
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Producto productos[] = new Producto[MAX];
        int opcion;

        do {
            System.out.println("\n--- MENU PRODUCTOS ---");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Aplicar descuento a todos");
            System.out.println("4. Modificar precios");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    for (int i = 0; i < productos.length; i++) {
                        productos[i] = new Producto();

                        System.out.print("Nombre: ");
                        productos[i].setNombre(sc.nextLine());

                        System.out.print("Precio: ");
                        productos[i].setPrecio(
                                Double.parseDouble(sc.nextLine())
                        );

                        System.out.print("Categoria: ");
                        productos[i].setCategoria(sc.nextLine());
                    }
                    break;

                case 2:
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) {
                            System.out.println("\nProducto " + (i + 1));
                            productos[i].mostrarDatos();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Porcentaje de descuento: ");
                    double descuento =
                            Double.parseDouble(sc.nextLine());

                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) {
                            productos[i].aplicarDescuento(descuento);
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i] != null) {
                            System.out.println(
                                    "Nuevo precio de " +
                                            productos[i].getNombre()
                            );
                            double precio =
                                    Double.parseDouble(sc.nextLine());
                            productos[i].setPrecio(precio);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);

        sc.close();
    }
}
