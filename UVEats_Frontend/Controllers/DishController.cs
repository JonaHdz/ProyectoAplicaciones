using System;
using System.Net.Http.Headers;
using Microsoft.AspNetCore.Mvc;
using UVEats_Frontend.Models;
using UVEats_Frontend.Configuration;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Microsoft.AspNetCore.Authorization;

namespace UVEats_Frontend.Controllers
{
  [Route("[controller]")]
  [Authorize]
  public class DishController : Controller
  {
    private readonly IConfiguration Configuration;

    public DishController(IConfiguration configuration)
    {
      Configuration = configuration;
    }

    public async Task<ActionResult> Index()
    {
      try
      {
        string BASE_URL = Configuration.GetValue("BaseUrl", "http://localhost:5140/")!;

        using (var client = new HttpClient())
        {
          client.BaseAddress = new Uri(BASE_URL);
          client.DefaultRequestHeaders.Clear();
          client.DefaultRequestHeaders.Accept
            .Add(new MediaTypeWithQualityHeaderValue("application/json"));

          var tokenClaim = User.Claims.FirstOrDefault(c => c.Type == "Token");

          client.DefaultRequestHeaders.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", tokenClaim.Value);

          HttpResponseMessage response = await client.GetAsync("/Producto/RecuperarProductos");

          if (response.IsSuccessStatusCode)
          {
            var content = await response.Content.ReadAsStringAsync();
            var responseObject = JsonConvert.DeserializeObject<DishResponse>(content);
            var jsonObject = JObject.Parse(content);
            var dishes = jsonObject["productosRecuperados"];

            List<DishModel> DishList = new List<DishModel>();

            if (dishes != null && dishes.Type == JTokenType.Array)
            {
              foreach (var dish in dishes)
              {
                Console.WriteLine(dish);
                DishModel dishModel = new DishModel();
                dishModel.IdProducto = dish["idProducto"]?.Value<int>() ?? 0;
                dishModel.Nombre = dish["nombre"]?.Value<string>();
                dishModel.Descripcion = dish["descripcion"]?.Value<string>();
                dishModel.Precio = dish["precio"].Value<decimal>();
                dishModel.Categoria = dish["categoria"]?.Value<string>();
                dishModel.EstadoProducto = dish["estadoProducto"]?.Value<string>();
                dishModel.FotoProducto = dish["fotoProducto"]?.Value<byte[]>();

                DishList.Add(dishModel);
              }
            }

            foreach (var dish in DishList)
            {
              Console.WriteLine(dish.Nombre);
            }

            return View(DishList);
          }
          else
          {
            ViewData["MessageError"] = $"Error: {response.StatusCode}";
          }
        }
      }
      catch (Exception exception)
      {
        ExceptionLogger.LogException(exception);
      }

      return View();
    }

    // [HttpPost]
    [Route("Create")]
    public async Task<ActionResult> Create(DishModel dish)
    {
      if (!ModelState.IsValid)
      {
        return View(dish);
      }

      try
      {
        string BASE_URL = Configuration.GetValue("BaseUrl", "http://localhost:5140/")!;

        using (var client = new HttpClient())
        {
          client.BaseAddress = new Uri(BASE_URL);
          client.DefaultRequestHeaders.Clear();
          client.DefaultRequestHeaders.Accept
            .Add(new MediaTypeWithQualityHeaderValue("application/json"));

          var tokenClaim = User.Claims.FirstOrDefault(c => c.Type == "Token");

          client.DefaultRequestHeaders.Authorization =
            new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", tokenClaim.Value);

          HttpResponseMessage response = await client.PostAsJsonAsync("/Producto/RegistrarProducto", dish);

          if (!response.IsSuccessStatusCode)
          {
            ViewData["MessageError"] = $"Error: {response.StatusCode}";
          }
        }
      }
      catch (Exception exception)
      {
        ExceptionLogger.LogException(exception);
      }

      return RedirectToAction("Index");
    }
  }
}