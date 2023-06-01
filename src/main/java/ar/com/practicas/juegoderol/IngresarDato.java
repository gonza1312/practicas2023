package ar.com.practicas.juegoderol;

import java.util.Scanner;

public class IngresarDato {
    public static boolean ingresarBoolean(String texto){
        System.out.print(texto + " : (si/no)"); // texto es la pregunta por si o no
        Scanner entradaEscaner = new Scanner (System.in);
        String decision=entradaEscaner.nextLine();
        while (!decision.equalsIgnoreCase("si")&&!decision.equalsIgnoreCase("no")){//preguntar como diferenciar respuesta minuscula o mayus en if
            System.out.println("respuesta invalida");
            System.out.print(texto + " : (si/no)"); // texto es la pregunta por si o no
            decision=entradaEscaner.nextLine();
        }
        if (decision.equalsIgnoreCase("si")){
            entradaEscaner.close();
            return true;
        }
        else {
            return false;
        }

    }


}
