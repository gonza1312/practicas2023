package ar.com.practicas;

import java.util.List;

public class ImprimePantalla {
    public static void imprimirFrase(String frase){
        System.out.println(frase);
    }

    public static void imprimirResultadoLista(List<Double> lista, String frase, Double resultado){
        if (lista==null||lista.isEmpty()){
            ImprimePantalla.imprimirFrase("La lista esta vacia");
        }
        else {
            ImprimePantalla.imprimirFrase(frase+resultado);
        }
    }
}
