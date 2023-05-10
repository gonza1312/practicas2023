package ar.com.practicas.numeros;

public class Calculadora {
    public static int suma(int num1, int num2){
        return num1+num2;
    }
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    public static float dividir(float num1, float num2) throws Exception {
        if (num2==0){
            throw new Exception("No se puede dividir por 0");
        }
        return num1/num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1*num2;
    }
    public static double potencia(double num1, double num2){
        double resultado=1;
        for (int i=0; i<num2; i++){
            resultado=multiplicar(resultado,num1);
        }
        return resultado;
    }
}
