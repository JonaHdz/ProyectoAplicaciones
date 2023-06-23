using System.Net.Http.Headers;
using Microsoft.AspNetCore.Mvc;
using UVEats_Frontend.Models;
using UVEats_Frontend.Configuration;

namespace UVEats_Frontend.Controllers
{
  [Route("[controller]")]
  public class AccountController : Controller
  {
    private readonly IConfiguration Configuration;
    public static string globalToken = "";

    public AccountController(IConfiguration configuration)
    {
      Configuration = configuration;
    }

    public IActionResult Create(UserModel user)
    {
      if (!ModelState.IsValid)
      {
        return View(user);
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

          HttpResponseMessage response = client.PostAsJsonAsync("/Usuario/RegistrarCliente", user).Result;
        }
      }
      catch (Exception exception)
      {
        ExceptionLogger.LogException(exception);
      }

      return RedirectToAction("Index", "Home");
    }
  }
}