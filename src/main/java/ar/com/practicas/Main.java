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
//        llamarSumaLista();
//        llamarMultiplicarLista();
//        llamarPromedio();
//        llamarPromedioVacio();
//        llamarMultiplicarListaVacia();
//        llamarMaximo();
//        llamarMaximoVacio();
//        llamarMinimo();
//        llamarMinimoVacio();
//        llamarMedio();
        llamarModa();
    }
    private static void llamarHola(){
        HelloWorld.saludarMundo();
    }

    private static void llamarImprimir(){
        ImprimePantalla.imprimirFrase("Chau mundo");
    }

    private static void llamarCalculadoraSuma(){
        int resultado = Calculadora.suma(2,5);
        ImprimePantalla.imprimirFrase("La suma es: "+resultado);
    }
    private static void llamarCalculadoraResta(){
        int resultado = Calculadora.restar(2,5);
        ImprimePantalla.imprimirFrase("La resta es: "+resultado);
    }
    private static void llamarCalculadoraDividir() {
        try {
            float resultado = Calculadora.dividir(5,0);
            ImprimePantalla.imprimirFrase("La división es: "+resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void llamarCalculadoraMultiplicar(){
        double resultado = Calculadora.multiplicar(2.33,5.33);
        ImprimePantalla.imprimirFrase("La multiplicacion es: "+resultado);
    }
    private static void llamarCalculadoraPotencia(){
        double resultado = Calculadora.potencia(2,5);
        ImprimePantalla.imprimirFrase("La potencia es: "+resultado);
    }
    private static void llamarSumaLista(){
        List<Double> listaSuma = new ArrayList<Double>();
        listaSuma.add(4.3);
        listaSuma.add(-2.2);
        listaSuma.add(6.5);
        listaSuma.add(10.0);
        double resultado = ListaNumeros.sumarLista(listaSuma);
        ImprimePantalla.imprimirFrase("La suma de la lista es: "+resultado);
    }
    private static void llamarMultiplicarLista(){
        List<Double> listaMultiplica = new ArrayList<Double>();
        listaMultiplica.add(4.3);
        listaMultiplica.add(-2.2);
        listaMultiplica.add(6.5);
        listaMultiplica.add(10.0);
        double resultado = ListaNumeros.multiplicarLista(listaMultiplica);
        ImprimePantalla.imprimirFrase("La multiplicación de la lista es: "+resultado);
    }
    private static void llamarMultiplicarListaVacia(){
        List<Double> listaMultiplicaVacia = new ArrayList<Double>();
        double resultado = ListaNumeros.multiplicarLista(listaMultiplicaVacia);
        ImprimePantalla.imprimirFrase("La multiplicación de la lista es: "+resultado);
    }
    private static void llamarPromedio(){
        List<Double> listaPromedio = new ArrayList<Double>();
        listaPromedio.add(10.0);
        listaPromedio.add(-20.0);
        listaPromedio.add(0.0);
        listaPromedio.add(10.0);
        double resultado = ListaNumeros.promediarLista(listaPromedio);
        ImprimePantalla.imprimirFrase("El promedio de la lista es: "+resultado);
    }
    private static void llamarPromedioVacio(){
        List<Double> listaVacia = new ArrayList<>();
        double resultado =ListaNumeros.promediarLista(listaVacia);
        ImprimePantalla.imprimirFrase("El promedio de la lista es: "+resultado);
    }
    private static void llamarMaximo(){
        List<Double> listaMaximo = new ArrayList<Double>();
        listaMaximo.add(4.3);
        listaMaximo.add(-22.2);
        listaMaximo.add(6.5);
        listaMaximo.add(10.0);
        double resultado = ListaNumeros.maximoLista(listaMaximo);
        ImprimePantalla.imprimirFrase("El maximo de la lista es: "+resultado);
    }
    private static void llamarMaximoVacio(){
        List<Double> listaVacia = null;
        double resultado =ListaNumeros.maximoLista(listaVacia);
        ImprimePantalla.imprimirFrase("El Maximo de la lista es: "+resultado);
    }
    private static void llamarMinimo(){
        List<Double> listaMinimo = new ArrayList<Double>();
        listaMinimo.add(4.3);
        listaMinimo.add(-2.2);
        listaMinimo.add(6.5);
        listaMinimo.add(10.0);
        double resultado = ListaNumeros.minimoLista(listaMinimo);
        ImprimePantalla.imprimirResultadoLista(listaMinimo,"El minimo de la lista es: ",resultado);
    }
    private static void llamarMinimoVacio(){
        List<Double> listaVacia = new ArrayList<>();
        ImprimePantalla.imprimirResultadoLista(listaVacia,"El minimo de la lista es: ",null);

    }
    private static void llamarMedio(){
        List<Double> listaMedio = new ArrayList<Double>();
        listaMedio.add(4.3);
        listaMedio.add(-2.2);
        listaMedio.add(9.5);
        listaMedio.add(10.0);
        listaMedio.add(9.0);
        double resultado = ListaNumeros.mediaLista(listaMedio);
        ImprimePantalla.imprimirResultadoLista(listaMedio,"El medio de la lista es: ",resultado);
    }
    private static void llamarModa(){
        List<Double> listaModa = new ArrayList<Double>();
        listaModa.add(4.3);
        listaModa.add(-2.2);
        listaModa.add(9.5);
        listaModa.add(10.0);
        listaModa.add(9.0);
        listaModa.add(9.5);
        listaModa.add(9.5);
        listaModa.add(-2.2);
        double resultado = ListaNumeros.modaLista(listaModa);
        ImprimePantalla.imprimirResultadoLista(listaModa,"El valor mas repetido de la lista es: ",resultado);
    }

}
