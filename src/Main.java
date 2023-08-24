import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

    mostrar_menu();
    }

    public static void mostrar_menu() {
        System.out.println("Menú de opciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        eleccion(opcion);
        sc.close();
    }

    private static void eleccion(int opcion) {
        if (opcion == 1) {
            System.out.println("Has elegido sumar");
        } else if (opcion == 2) {
            System.out.println("Has elegido restar");
        } else if (opcion == 3) {
            System.out.println("Has elegido multiplicar");
        } else if (opcion == 4) {
            System.out.println("Has elegido dividir");
        } else if (opcion == 5) {
            System.out.println("Has elegido salir");
            return;
        } else {
            System.out.println("Opción no válida");
        }
        mostrar_menu();
    }
}