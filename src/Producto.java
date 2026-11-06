
public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio no valido");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
    }
}
