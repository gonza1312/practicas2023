package ar.com.practicas.juegoderol;

public class Controller {
    public static void ejecutarJuego(){
        boolean continuar=true;
        while (continuar){
            continuar=IngresarDato.ingresarBoolean("Desea continuar?");
        }

//        Crear una clase menu en la cual tenga un menu que tenga como opciones ataque, ataque esp, defender, abandonar, salir. Enumerados.
//        Si elegis salir que salga del juego. Crear otro metodo que se llame decidir que sepa resolver la elección
//        Crear una clase que se llame menu inicial en donde se pueda cargar el nombre de jugador y que se guarden en un Array (Clase jugador)
//        Que eso este fuera del while, el menu siempre se tiene que mostrar
    }
}
