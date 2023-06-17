package ar.com.practicas.juegoderol;

import java.util.Scanner;

public class IngresarDato {
    public static boolean ingresarBoolean(String texto){
        System.out.print(texto + " : (si/no)"); // texto es la pregunta por si o no
        Scanner entradaEscaner = new Scanner (System.in);
        String decision=entradaEscaner.nextLine();
        if(decision.equalsIgnoreCase("si")){
            return true;
        }
        else {
            return false;
        }

    }


}
