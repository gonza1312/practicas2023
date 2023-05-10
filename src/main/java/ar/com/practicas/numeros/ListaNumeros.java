package ar.com.practicas.numeros;

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
        if (cursos==null){
            return 0.0;
        }
        List<List<Double>> todasLasNotasDeTodosLosCursos = Arrays.stream(cursos.clone()).toList();
        //Lista de Cursos:
        //Cada Curso de una Lista de Notas
        // ListCursos<ListaNotas>
        List<Double> promedios=new ArrayList<>();
        for (int i = 0; i < todasLasNotasDeTodosLosCursos.size(); i++) {
            List<Double> curso= todasLasNotasDeTodosLosCursos.get(i);
            double suma=0;
            for (int j = 0; j < curso.size(); j++) {
                double notaAlumno = curso.get(j);
                suma=notaAlumno+suma;
            }
            double promedio = suma/curso.size();
            promedios.add(promedio);
        }
        double sumaPromedio=0;
        for (int i = 0; i < promedios.size(); i++) {
            double promedioCurso=promedios.get(i);
            sumaPromedio=promedioCurso+sumaPromedio;
        }
        double promedioGral= sumaPromedio/promedios.size();

        return promedioGral;
    }

    /**
     * Se quiere saber el promedio de notas de una escuela.
     * El promedio se debe calcular como el promedio del promedio de cada curso
     */
    public static Double promedioEscuelaCon1For(List<List<Double>> todasLasNotasDeTodosLosCursos) {
        if (todasLasNotasDeTodosLosCursos==null){
            return 0.0;
        }
        List<Double> promedios = new ArrayList<>();
        for (int i = 0; i < todasLasNotasDeTodosLosCursos.size(); i++) {
            double promedio = ListaNumeros.promediarLista(todasLasNotasDeTodosLosCursos.get(i));
            promedios.add(promedio);
        }

        double promedioGral= ListaNumeros.promediarLista(promedios);

        return promedioGral;
    }

    public static Double promedioGralEscuela(List<List<Double>> todasLasNotasDeTodosLosCursos) {
        if (todasLasNotasDeTodosLosCursos==null){
            return 0.0;
        }
        double sumaLista=0;
        double suma = 0;
        for (int i = 0; i < todasLasNotasDeTodosLosCursos.size(); i++) {
            //Forma: Haciendo el promedio a mano
            sumaLista = ListaNumeros.sumarLista(todasLasNotasDeTodosLosCursos.get(i))+sumaLista;
            suma=todasLasNotasDeTodosLosCursos.get(i).size()+suma;
        }
        double promedioGral = sumaLista/suma;
        return promedioGral;
    }

    public static Double promedioGralEscuela2(List<List<Double>> todasLasNotasDeTodosLosCursos) {
        if (todasLasNotasDeTodosLosCursos==null){
            return 0.0;
        }
        List<Double> listaDeNotas = new ArrayList<>();

        for (int i = 0; i < todasLasNotasDeTodosLosCursos.size(); i++) {
            List<Double> curso = todasLasNotasDeTodosLosCursos.get(i);
            //Forma: Haciendo el promedio reutilizando codigo
            for (int j = 0; j < curso.size(); j++) {
                Double nota = curso.get(j);
                listaDeNotas.add(nota);
            }
        }

        Double promedioGral = ListaNumeros.promediarLista(listaDeNotas);

        return promedioGral;
    }
}
