import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        mostrar_menu();
    }

    // Método llamado crearMatrizCartas() que permita crear una matriz de cartas que indique su nombre y puntaje. Considere el largo de la matriz de como máximo 12 cartas.
    public static String[][] crearMatrizCartas(){
        return new String[12][2];
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
        agregarCartas(mazo, "As de diamantes", 11);
        agregarCartas(mazo, "Dos de tréboles", 2);
        agregarCartas(mazo, "Tres de diamantes", 3);
        agregarCartas(mazo, "Cuatro de picas", 4);
        agregarCartas(mazo, "Cinco de corazones", 5);
        agregarCartas(mazo, "Seis de tréboles", 6);
        agregarCartas(mazo, "Siete de diamantes", 7);
        agregarCartas(mazo, "Ocho de picas", 8);
        agregarCartas(mazo, "Nueve de corazones", 9);
        agregarCartas(mazo, "J de tréboles", 10);
        agregarCartas(mazo, "Q de corazones", 10);
        agregarCartas(mazo, "K de picas", 10);
    }
    
    //método llamado obtenerCartas() que permita a un jugador obtener una carta aleatoria.
    public static String[] obtenerCartas(String [][] mazo){
        Random random = new Random();
        int indice = random.nextInt(mazo.length);
        return mazo[indice];
    }
    //método llamado jugar() que permita que ambos jugadores saquen 3 cartas cada uno y valide quien es el ganador.
    public static void jugar(){
        String[][] mazo = crearMatrizCartas();
        inicializarCartasJuego(mazo);
        String[] carta1 = obtenerCartas(mazo);
        String[] carta2 = obtenerCartas(mazo);
        String[] carta3 = obtenerCartas(mazo);
        String[] carta4 = obtenerCartas(mazo);
        String[] carta5 = obtenerCartas(mazo);
        String[] carta6 = obtenerCartas(mazo);
        int puntajeJugador1 = Integer.parseInt(carta1[1]) + Integer.parseInt(carta2[1]) + Integer.parseInt(carta3[1]);
        int puntajeJugador2 = Integer.parseInt(carta4[1]) + Integer.parseInt(carta5[1]) + Integer.parseInt(carta6[1]);
        if (puntajeJugador1 > puntajeJugador2){
            System.out.println("Ganó el jugador 1");
        } else if (puntajeJugador1 < puntajeJugador2){
            System.out.println("Ganó el jugador 2");
        } else {
            System.out.println("Empate");
        }
        System.out.println("Jugador 1: " + puntajeJugador1);
        System.out.println("Jugador 2: " + puntajeJugador2);

        jugarVariasVeces();
    }
    //serie de métodos auxiliares que permita jugar varias veces hasta que el usuario quiera no seguir jugando a través de un menú.
    public static void jugarVariasVeces(){
        System.out.println("\n¿Desea jugar otra vez?");
        mostrar_menu();
    }

    public static void mostrar_menu() {

        System.out.println("Menú de opciones");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        eleccion(opcion);
        sc.close();
    }

    private static void eleccion(int opcion) {
        if (opcion == 1) {
            System.out.println("Has elegido jugar");
            jugar();
        } else if (opcion == 2) {
            System.out.println("Has elegido salir");
        } else {
            System.out.println("Opción no válida");
            mostrar_menu();
        }
        return;
    }
}