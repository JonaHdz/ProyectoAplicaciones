using System.ComponentModel.DataAnnotations;

namespace UVEats_Frontend.Models
{
  public class UserModel
  {
    [Required(ErrorMessage = "Campo requerido.")]
    [StringLength(45, ErrorMessage = "El correo es demasiado largo.")]
    [EmailAddress(ErrorMessage = "El correo no es válido.")]
    public string Correo { get; set; } = null!;
    [Required(ErrorMessage = "Campo requerido.")]
    [StringLength(45, ErrorMessage = "La contraseña es demasiado larga.")]
    public string Contrasena { get; set; } = null!;
    [Required(ErrorMessage = "Campo requerido.")]
    [StringLength(45, ErrorMessage = "El nombre es demasiado largo.")]
    public string FirstName { get; set; } = null!;
    [Required(ErrorMessage = "Campo requerido.")]
    [StringLength(45, ErrorMessage = "Los apellidos son demasiado largos.")]
    public string Apellido { get; set; } = null!;
    [Required(ErrorMessage = "Campo requerido.")]
    [StringLength(10, ErrorMessage = "El número de teléfono es demasiado largo.")]
    public string Telefono { get; set; } = null!;
    public byte[]? Foto { get; set; }
  }
}