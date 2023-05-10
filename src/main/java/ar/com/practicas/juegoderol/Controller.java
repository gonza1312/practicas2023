package ar.com.practicas.juegoderol;

public class Controller {
    public static void ejecutarJuego(){
        boolean continuar=true;
        while (continuar){
            continuar=IngresarDato.ingresarBoolean("Desea continuar?");
        }
    }
}
