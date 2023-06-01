package ar.com.practicas.juegoderol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void iniciarMenu (){
        guardarPersonaje();
        accionPersonaje();

    }

    public static List<String> guardarPersonaje(){
        List<String> guardarPersonaje = new ArrayList<>();
        boolean guardar = true;
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println(IngresarDato.ingresarBoolean("Desea guardar un personaje?"));
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            guardarPersonaje.add(nombre);
        }

    }

    public static void cargarPersonaje(List<String> guardarPersonaje){
        boolean cargar = true;
        cargar=IngresarDato.ingresarBoolean("Desea cargar un personaje?");
        Scanner teclado = new Scanner(System.in);
        if (cargar){
            for (int j = 0; j < guardarPersonaje.size(); j++) {

                System.out.println(guardarPersonaje());
                break;
            }
        }
    }

    public static void accionPersonaje(){
        int decision;
        System.out.println("Ataque = 1 "+ "Ataque esp = 2 "+ "Defender = 3 " + "Abandonar = 4 " + "Salir = 5");
        Scanner teclado = new Scanner(System.in);
        decision= teclado.nextInt();
        if (decision==1){
            System.out.println("Usted ha realizado un Ataque");

        }
        if (decision==2) {
            System.out.println("Usted ha realizado un Ataque esp");
        }
        if (decision==3) {
            System.out.println("Usted ha realizado un Defender");
        }
        if (decision==4) {
            System.out.println("Usted ha abandonado");
        }
        if (decision==5) {
            System.out.println("Usted salio");
        }

    }

}
