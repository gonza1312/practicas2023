package ar.com.practicas.juegoderol;

import java.util.Scanner;

public class IngresarDato {
    public static boolean ingresarBoolean(String texto){
        System.out.print(texto + " :");
        Scanner entradaEscaner = new Scanner (System.in);
        texto=entradaEscaner.nextLine();
        return (texto.equalsIgnoreCase("si"));

    }


}
