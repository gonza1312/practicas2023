package ar.com.practicas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaNumeros {
    public static double sumarLista(List <Double> listaNum){
        double resultado = 0;
        for (double num:listaNum){
            resultado=num+resultado;
        }
        return resultado;
    }
    public static Double multiplicarLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        double resultado = 1;
        for (double num:listaNum){
            resultado=num*resultado;
        }
        return resultado;
    }
    public static Double promediarLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        double resultado = 0;
        for (double num:listaNum){
            resultado=num+resultado;
        }

        double promedio=resultado/listaNum.size();
        return promedio;
    }
    public static Double maximoLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) > max) {
                max = listaNum.get(i);
            }
        }
        return max;

    }
    public static Double minimoLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) < min) {
                min = listaNum.get(i);
            }
        }
        return min;
    }

    public static Double minimoListaOpcion2(List<Double> listaNum){
        double min;
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        min = listaNum.get(0);
        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) < min) {
                min = listaNum.get(i);
            }
        }
        return min;
    }




    /*obtener objeto del medio de la lista*/
    public static Double mediaLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }

        Integer medio=listaNum.size()/2;
        Double numMedio=listaNum.get(medio);
        return numMedio;
    }

    /*el elemento que aparece más veces*/
    public static Double modaLista(List<Double> listaNum){
        if (listaNum==null||listaNum.isEmpty()){
            return 0.0;
        }
        Map<Double,Integer> map= new HashMap<>();
        for (int i = 0; i < listaNum.size(); i++) {
            Double key=listaNum.get(i);
            Integer contador=map.get(key);
            if (contador!=null){
                contador++;
                map.put(key,contador);
            }
            else {
                map.put(key,1);
            }

        }
        double max = Double.NEGATIVE_INFINITY;
        Double masRepetido=null;
        for (int i = 0; i < listaNum.size(); i++) {
            Double key=listaNum.get(i);
            Integer contador=map.get(key);
            if (contador>max){
                max=contador;
                masRepetido=key;
            }
        }
        return masRepetido;
    }
}
