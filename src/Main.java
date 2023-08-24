import java.util.Scanner;
public class Main {
    public void main(String[] args) {
        String[][] mazo = crearMatrizCartas();
        inicializarCartasJuego(mazo);
        for (int i = 0; i < mazo.length; i++) {
            System.out.println(mazo[i][0] + " " + mazo[i][1]);
        }
    }

    // método llamado crearMatrizCartas() que permita crear una matriz de cartas que indique su nombre y puntaje. Considere el largo de la matriz de como máximo 12 cartas.
    public static String[][] crearMatrizCartas(){
        String [][] matrizCartas = new String[49][2];
        return matrizCartas;
    }
    //método llamado agregarCartas(String nombreCarta, String puntaje) que permita agregar una carta a la matriz.
    public static String[][] agregarCartas(String [][] matrizCartas, String nombreCarta, int puntaje){
        if (puntaje == 11){
            matrizCartas[0][0] = nombreCarta;
            matrizCartas[0][1] = String.valueOf(puntaje);
        }
        else if (nombreCarta == "J" || nombreCarta == "Q" || nombreCarta == "K"){
            if (nombreCarta == "J")
                matrizCartas[9][0] = String.valueOf(puntaje);
            else if (nombreCarta == "Q")
                matrizCartas[10][0] = String.valueOf(puntaje);
            else if (nombreCarta == "K")
                matrizCartas[11][0] = String.valueOf(puntaje);
        }
        else{
            matrizCartas[puntaje-1][0] = nombreCarta;
            matrizCartas[puntaje-1][1] = String.valueOf(puntaje);
        }
        return matrizCartas;
    }

    //método llamado inicializarCartasJuego() que permita agregar las cartas
    public static String[][] inicializarCartasJuego(String [][] mazo){
        String [] color = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        int contador = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == 0){
                    mazo[contador][0] = "A";
                    mazo[contador][1] = String.valueOf(11);
                }
                else if (j == 10){
                    mazo[contador][0] = "J";
                    mazo[contador][1] = String.valueOf(10);
                }
                else if (j == 11){
                    mazo[contador][0] = "Q";
                    mazo[contador][1] = String.valueOf(10);
                }
                else if (j == 12){
                    mazo[contador][0] = "K";
                    mazo[contador][1] = String.valueOf(10);
                }
                else{
                    mazo[contador][0] = String.valueOf(j+1);
                    mazo[contador][1] = String.valueOf(j+1);
                }
                contador++;
            }
        }
        return mazo;
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