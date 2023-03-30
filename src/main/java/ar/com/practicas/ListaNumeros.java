package ar.com.practicas;

import java.util.*;

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

    /**
     * Se quiere saber el promedio de notas de una escuela.
     * El promedio se debe calcular como el promedio del promedio de cada curso
     */
    public static Double promedioEscuela(List<Double>... cursos) {
        List<List<Double>> todasLasNotasDeTodosLosCursos = Arrays.stream(cursos.clone()).toList();
        //Lista de Cursos:
        //Cada Curso de una Lista de Notas
        // ListCursos<ListaNotas>
        return 0D;
    }
}
