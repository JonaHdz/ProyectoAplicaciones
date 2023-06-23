using System.Net.Http.Headers;
using Microsoft.AspNetCore.Mvc;
using UVEats_Frontend.Models;
using UVEats_Frontend.Configuration;
using System.Security.Claims;
using Microsoft.AspNetCore.Authentication.Cookies;
using Microsoft.AspNetCore.Authentication;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace UVEats_Frontend.Controllers;

public class HomeController : Controller
{

  private readonly IConfiguration Configuration;

  public static string globalToken = "";

  public HomeController(IConfiguration configuration)
  {
    Configuration = configuration;
  }

  public IActionResult Index()
  {
    return View();
  }

  public IActionResult Privacy()
  {
    return View();
  }

  [HttpPost]
  public async Task<ActionResult> Login(LoginViewModel login)
  {
    try
    {
      using (HttpClient client = new HttpClient())
      {
        string BASE_URL = Configuration.GetValue("BaseUrl", "http://localhost:5140/")!;

        client.BaseAddress = new Uri(BASE_URL);
        client.DefaultRequestHeaders.Clear();
        client.DefaultRequestHeaders.Accept
          .Add(new MediaTypeWithQualityHeaderValue("application/json"));

        HttpResponseMessage response =
          client.PostAsJsonAsync("/Login/ValidarUsuarioLogin", login).Result;

        if (response.IsSuccessStatusCode)
        {
          var content = await response.Content.ReadAsStringAsync();

          var responseObject = JsonConvert.DeserializeObject<LoginViewModel>(content);
          var jsonObject = JObject.Parse(content);
          var token = jsonObject["token"];

          globalToken = (string)token;

          var claims = new List<Claim>{
            new Claim("Correo", login.Correo),
            new Claim("Token", globalToken)
          };

          var claimsIdentity = new ClaimsIdentity(claims, CookieAuthenticationDefaults.AuthenticationScheme);

          await HttpContext.SignInAsync(
            CookieAuthenticationDefaults.AuthenticationScheme,
            new ClaimsPrincipal(claimsIdentity),
            new AuthenticationProperties { ExpiresUtc = DateTime.Now.AddMinutes(10), IsPersistent = true }
          );
        }
        else
        {
          ViewData["MessageError"] = "Usuario o contraseña incorrectos.";
        }
      }
    }
    catch (Exception exception)
    {
      ExceptionLogger.LogException(exception);
    }

    return RedirectToAction("Index", "Dish");
  }
}
