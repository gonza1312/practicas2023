package ar.com.practicas;

import java.util.Comparator;
import java.util.List;

public class ListaNumeros {
    public static double sumarLista(List <Double> listaNum){
        double resultado = 0;
        for (double num:listaNum){
            resultado=num+resultado;
        }
        return resultado;
    }
    public static Double multiplicarLista(List<Double> listaNum){
        double resultado = 1;
        for (double num:listaNum){
            resultado=num*resultado;
        }
        return resultado;
    }
    public static Double promediarLista(List<Double> listaNum){
        double resultado = 0;
        for (double num:listaNum){
            resultado=num+resultado;
        }

        double promedio=resultado/listaNum.size();
        return promedio;
    }
    public static Double maximoLista(List<Double> listaNum){
        double max = 0;
        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) > max) {
                max = listaNum.get(i);
            }
        }
        return max;

    }
//    public static Double minimoLista(List<Double> listaNum){
//
//    }
//
//    /*obtener objeto del medio de la lista*/
//    public static Double mediaLista(List<Double> listaNum){
//
//    }
//
//    /*el elemento que aparece más veces*/
//    public static Double modaLista(List<Double> listaNum){
//
//    }
}
