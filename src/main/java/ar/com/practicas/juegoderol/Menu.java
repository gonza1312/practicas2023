package ar.com.practicas.juegoderol;

import javax.swing.*;
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
        Personaje vida = new Personaje();
        int vida1 = vida.getVida();
        int vidaActual=100;
        for (int i = 0; i < vidaActual; i++) {
            System.out.println("Ataque = 1/ "+ "Ataque esp = 2/ "+ "Defender = 3/ " + "Abandonar = 4/ ");
            Scanner teclado = new Scanner(System.in);
            decision= teclado.nextInt();
            switch (decision) {
                case 1:
                    int ataque = 20;
                    System.out.println("Usted ha realizado un Ataque");
                    vida.realizarAtaque(ataque);
                    vidaActual = vida.getVida();
                    System.out.println("La vida es: " + vidaActual);
                    break;
                case 2:
                    int ataqueEsp=30;
                    System.out.println("Usted ha realizado un Ataque especial");
                    vida.realizarAtaque(ataqueEsp);
                    vidaActual = vida.getVida();
                    System.out.println("La vida es: " + vidaActual);
                    break;
                case 3:
                    System.out.println("Usted se ha defendido");
                    break;
                case 4:
                    System.out.println("Usted ha abandonado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            if (vidaActual<=0){
                System.exit(0);
            }
        }
    }
}
