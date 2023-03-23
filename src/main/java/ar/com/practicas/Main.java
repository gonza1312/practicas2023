package ar.com.practicas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //llamarHola();
//        llamarImprimir();
//        llamarCalculadoraSuma();
//        llamarCalculadoraResta();
//        llamarCalculadoraDividir();
//        llamarCalculadoraMultiplicar();
//        llamarCalculadoraPotencia();
        llamarSumaLista();
    }
    private static void llamarHola(){
        HelloWorld.saludarMundo();
    }

    private static void llamarImprimir(){
        ImprimePantalla.imprimirPantalla("Chau mundo");
    }

    private static void llamarCalculadoraSuma(){
        int resultado = Calculadora.suma(2,5);
        ImprimePantalla.imprimirPantalla("La suma es: "+resultado);
    }
    private static void llamarCalculadoraResta(){
        int resultado = Calculadora.restar(2,5);
        ImprimePantalla.imprimirPantalla("La resta es: "+resultado);
    }
    private static void llamarCalculadoraDividir() {
        try {
            float resultado = Calculadora.dividir(5,0);
            ImprimePantalla.imprimirPantalla("La división es: "+resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void llamarCalculadoraMultiplicar(){
        double resultado = Calculadora.multiplicar(2.33,5.33);
        ImprimePantalla.imprimirPantalla("La multiplicacion es: "+resultado);
    }
    private static void llamarCalculadoraPotencia(){
        double resultado = Calculadora.potencia(2,5);
        ImprimePantalla.imprimirPantalla("La potencia es: "+resultado);
    }
    private static void llamarSumaLista(){
        List<Double> listaSuma = new ArrayList<Double>();
        listaSuma.add(4.3);
        listaSuma.add(2.2);
        listaSuma.add(6.5);
        listaSuma.add(1D);
        double resultado = ListaNumeros.sumarLista(listaSuma);
        ImprimePantalla.imprimirPantalla("La suma de la lista es: "+resultado);
    }
}
