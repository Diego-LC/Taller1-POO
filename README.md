Taller 1 Programación orientada a objetos
Simulador de un juego de cartas.

Supuestos:

Se desea desarrollar un nuevo juego de cartas para dos jugadores. Las reglas del juego son las siguientes:

-Cada jugador debe sacar tres cartas de una baraja.

-El objetivo del juego es que un jugador obtenga un puntaje total exacto de 20 puntos con las cartas que haya sacado.

-Si ninguno de los dos jugadores obtiene un puntaje exacto de 20 puntos, entonces ganará aquel que haya sacado un puntaje lo más cercano posible a 20, pero sin superarlo.

-Si algún jugador saca un puntaje total que excede los 20 puntos, perderá el juego automáticamente, independientemente del puntaje del otro jugador.

Explicación del código:

En el método main se llama al método mostrar_menu() que muestra el menú de opciones y permite al usuario elegir una opción.

Si el usuario elige la opción 1, se llama al método jugar() que permite jugar al juego de cartas.

Si el usuario elige la opción 2, se termina el programa.

Si el usuario elige una opción no válida, se vuelve a mostrar el menú de opciones.

El método `jugar()` llama a los siguientes métodos:

-`crearMatrizCartas()`: crea una matriz de cartas que indique su nombre y puntaje. 

-`agregarCartas(String nombreCarta, String puntaje)`: agrega una carta a la matriz.

-`inicializarCartasJuego()`: agrega las cartas del juego.

-`obtenerCartas()`: permite a un jugador obtener una carta aleatoria.

`jugar()`: permite que ambos jugadores saquen 3 cartas cada uno y valida quien es el ganador.

Al finalizar el juego, se llama al método `jugarVariasVeces()` que permite jugar varias veces hasta que el usuario quiera no seguir jugando a través de un menú.