package ar.com.practicas.juegoderol;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void iniciarMenu (){
        List<String> personajes = guardarPersonaje();
        cargarPersonaje(personajes);
    }

    public static List<String> guardarPersonaje() {
        List<String> guardarPersonajes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Desea guardar un personaje? (si/no)");
            String decision = teclado.nextLine();
            if (decision.equalsIgnoreCase("si")){
                System.out.println("Ingrese el nombre: ");
                String nombre = teclado.nextLine();
                guardarPersonajes.add(nombre);
            }
            else if (decision.equalsIgnoreCase("no")){
                break;
            }

        }
        return guardarPersonajes;
    }

    public static void cargarPersonaje(List<String> guardarPersonajes) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Desea cargar un personaje? (si/no)");
            String decision = teclado.nextLine();
            if (decision.equalsIgnoreCase("si")){
                for (String nombre : guardarPersonajes) {
                    System.out.println(nombre);
                }
            } else if (decision.equalsIgnoreCase("no")){
                break;
            }
        }
    }


    public static void accionPersonaje(){
        int decision;
        System.out.println("Ataque = 1/ "+ "Ataque esp = 2/ "+ "Defender = 3/ " + "Abandonar = 4/ " + "Salir = 5");
        Scanner teclado = new Scanner(System.in);
        decision= teclado.nextInt();
        switch (decision) {
            case 1:
                System.out.println("Usted ha realizado un Ataque");
                break;
            case 2:
                System.out.println("Usted ha realizado un Ataque esp");
                break;
            case 3:
                System.out.println("Usted ha realizado un Defender");
                break;
            case 4:
                System.out.println("Usted ha abandonado");
                break;
            case 5:
                System.out.println("Usted ha salido");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida");
        }

    }

}
