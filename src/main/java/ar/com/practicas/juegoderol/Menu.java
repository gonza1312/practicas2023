package ar.com.practicas.juegoderol;

import java.util.Scanner;

public class Menu {
    public static void iniciarMenu (){
        guardarPersonaje();
        accionPersonaje();

    }

    public static void guardarPersonaje(){
        String[] personaje = new String[2];
        boolean guardar = true;
        guardar=IngresarDato.ingresarBoolean("Desea crear un personaje?");
        Scanner teclado = new Scanner(System.in);
        if (guardar){
            for (int i = 0; i < personaje.length; i++) {

                System.out.println("Ingrese nombre de personaje: ");
                personaje[i]=teclado.nextLine();
                break;
            }
        }
        boolean cargar = true;
        cargar=IngresarDato.ingresarBoolean("Desea cargar un personaje?");
        teclado = new Scanner(System.in);
        if (cargar){
            for (int j = 0; j < personaje.length; j++) {

                System.out.println(personaje[j]);
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
