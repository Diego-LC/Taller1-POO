import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] mazo = crearMatrizCartas();
        inicializarCartasJuego(mazo);
        for (int i = 0; i < mazo.length; i++) {
            System.out.println(mazo[i][0] + " " + mazo[i][1]);
        }
    }

    // Método llamado crearMatrizCartas() que permita crear una matriz de cartas que indique su nombre y puntaje. Considere el largo de la matriz de como máximo 12 cartas.
    public static String[][] crearMatrizCartas(){
        return new String[48][2];
    }
    //método llamado agregarCartas(String nombreCarta, String puntaje) que permita agregar una carta a la matriz.
    public static void agregarCartas(String [][] matrizCartas, String nombreCarta, int puntaje){
        for (int i = 0; i < matrizCartas.length; i++) {
            if (matrizCartas[i][0] == null){
                matrizCartas[i][0] = nombreCarta;
                matrizCartas[i][1] = String.valueOf(puntaje);
                break;
            }
        }
    }

    //método llamado inicializarCartasJuego() que permita agregar las cartas
    public static void inicializarCartasJuego(String [][] mazo){
        String [] color = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < 12; j++) {

                if (j == 0){
                    agregarCartas(mazo, "As de " + color[i], 11);
                }
                else if (j == 9){
                    agregarCartas(mazo,"J de " + color[i], 10);
                }
                else if (j == 10){
                    agregarCartas(mazo,"Q de " + color[i], 10);
                }
                else if (j == 11){
                    agregarCartas(mazo,"K de " + color[i], 10);
                }
                else{
                    agregarCartas(mazo, j+1 + " de " + color[i], j+1);
                }
            }
        }
    }
    
    //método llamado obtenerCartas() que permita a un jugador obtener una carta aleatoria.
    //método llamado jugar() que permita que ambos jugadores saquen sus cartas y valide quien es el ganador.
    //serie de métodos auxiliares que permita jugar varias veces hasta que el usuario quiera no seguir jugando a través de un menú.
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