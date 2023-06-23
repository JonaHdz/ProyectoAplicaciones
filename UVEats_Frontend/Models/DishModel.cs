using System.ComponentModel.DataAnnotations;

namespace UVEats_Frontend.Models
{
  public class DishModel
  {
    public int IdProducto { get; set; }

    [Required(ErrorMessage = "El nombre es requerido")]
    [StringLength(45, ErrorMessage = "El nombre no puede tener más de 50 caracteres")]
    public string? Nombre { get; set; }
    [Required(ErrorMessage = "La Descripción es requerido")]
    [StringLength(500, ErrorMessage = "La descripción no puede tener más de 500 caracteres")]
    public string? Descripcion { get; set; }
    [Required(ErrorMessage = "El Precio es requerido")]
    public decimal? Precio { get; set; }
    public int? IdCategoria { get; set; }
    // [Required(ErrorMessage = "El nombre es requerido")]
    public string? Categoria { get; set; }
    [Required(ErrorMessage = "El Estado es requerido")]
    public string? EstadoProducto { get; set; }
    public byte[]? FotoProducto { get; set; }
  }

  public class DishResponse
  {
    public int Codigo { get; set; }
    public string Msg { get; set; }
    public string DishList { get; set; }
  }
}