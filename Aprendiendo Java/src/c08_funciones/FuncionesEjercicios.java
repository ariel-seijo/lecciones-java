package c08_funciones;

import java.sql.Array;
import java.util.ArrayList;

public class FuncionesEjercicios {

    public static void saludar() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void saludarPersona(String name) {
        System.out.println("Hola, " + name + "!");
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int calcularCuadrado(int a) {
        return a * a;
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esMayor(int n) {
        return n >= 18;
    }

    public static int calcularLongitud(ArrayList lista) {
        return lista.size();
    }

    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int numero: numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int index = 2; index <= numero; index++ ) {
            factorial *= index;
        }
        return factorial;
    }

    public static void mostrarElemento(ArrayList<String> lista) {
        for (String elemento: lista) {
            System.out.println("Elemento: " + elemento);
        }
    }

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
//        saludar();
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
//        saludarPersona("Juan");
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
//        System.out.println(restar(10, 5));
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
//        System.out.println("Cuadrado: " + calcularCuadrado(5));
        // 5. Escribe una función que reciba un número y diga si es par o impar.
//        System.out.println(esPar(5));
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
//        System.out.println(esMayor(17));
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
//        ArrayList<String> nombres = new ArrayList<>();
//        nombres.add("Arielo");
//        nombres.add("Esteban");
//        nombres.add("Matias");
//
//        System.out.println(calcularLongitud(nombres));
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

//        int[] numeros = new int[]{12, 23, 35, 12, 81};
//        System.out.println("Media: " + calcularMedia(numeros));

        // 9. Escribe un método que reciba un número y retorna su factorial.
//        int numero = 5;
//        System.out.println("Factorial de " + numero + ": " + calcularFactorial(numero));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

//        ArrayList<String> listado = new ArrayList<>();
//        listado.add("Ariel");
//        listado.add("Arielo");
//        listado.add("Arielovich");
//
//        mostrarElemento(listado);

    }
}
