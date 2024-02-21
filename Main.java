import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Punto 1: Ingresar el nombre del artículo
        String articulo = ingresarArticulo(scanner);

        // Punto 2: Verificar si tiene permiso de acceso
        boolean tienePermiso = true; // Asignamos el valor inicial
        verificarPermiso(tienePermiso);

        // Punto 3: Verificar el rango de la cifra
        int cifra = 950; // Asignamos el valor inicial
        verificarRangoCifra(cifra);

        // Punto 4: Asignar valor a respuesta según el valor de n
        String respuesta = asignarRespuesta(25);

        // Punto 5: Verificar el estado de encendido y la cantidad
        boolean encendido = true; // Asignamos el valor inicial
        verificarEncendidoYCantidad(encendido, scanner);

        // Cerrar el Scanner al finalizar.
        scanner.close();
    }

    // Función para ingresar el nombre del artículo
    public static String ingresarArticulo(Scanner scanner) {
        System.out.print("Ingrese el nombre del artículo: ");
        return scanner.nextLine();
    }

    // Función para verificar si tiene permiso de acceso
    public static void verificarPermiso(boolean tienePermiso) {
        if (!tienePermiso) {
            System.out.println("No tiene permiso de acceso");
        } else {
            System.out.println("Bienvenido");
        }
    }

    // Función para verificar el rango de la cifra
    public static void verificarRangoCifra(int cifra) {
        if (cifra > 0 && cifra < 500) {
            System.out.println("Rango menor");
        } else if (cifra >= 501 && cifra <= 2000) {
            System.out.println("Rango intermedio");
        } else if (cifra > 2000 && cifra < 10000) {
            System.out.println("Rango superior");
        } else {
            System.out.println("Rango inválido!");
        }
    }

    // Función para asignar valor a respuesta según el valor de n
    public static String asignarRespuesta(int n) {
        if (n > 0 && n < 100) {
            return "SI";
        } else {
            return "NO";
        }
    }

    // Función para verificar el estado de encendido y la cantidad
    public static void verificarEncendidoYCantidad(boolean encendido, Scanner scanner) {
        if (encendido) {
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            if (cantidad == 20) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } else {
            System.out.println("Incorrecto");
        }
    }
}
