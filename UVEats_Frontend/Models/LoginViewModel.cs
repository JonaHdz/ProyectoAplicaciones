using System.ComponentModel.DataAnnotations;

namespace UVEats_Frontend.Models
{
  public class LoginViewModel
  {
    [Required(ErrorMessage = "El correo es requerido")]
    public string Correo { get; set; } = null!;
    [Required(ErrorMessage = "La contraseña es requerida")]
    public string Contrasena { get; set; } = null!;
  }
}