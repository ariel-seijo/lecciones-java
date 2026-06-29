package c07_loops;

import java.util.*;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

//        int numero = 0;
//        while (numero < 11) {
//            System.out.println("Numero: " + numero);
//            numero++;
//        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

//        ArrayList<String> nombres = new ArrayList<>(
//                List.of("Arielo", "Lucia", "Martin", "Lucas")
//        );
//
//        int index = 0;
//
//        do {
//            System.out.println(nombres.get(index));
//            index++;
//        } while (index < nombres.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

//        for ( int multiplicador = 5; multiplicador <= 50; multiplicador += 5) {
//            System.out.println(multiplicador);
//        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

//        int[] numeros = new int[]{2, 4, 6, 8, 10};
//        int suma = 0;
//        for (int numero: numeros) {
//            suma += numero;
//        }
//        System.out.println(suma);


        // 5. Usa un for para recorrer un Array y mostrar sus valores.

//        int[] fibonacci = new int[]{1,1,2,3,5,8,13};
//
//        for (int numero: fibonacci) {
//            System.out.println("Valor " + numero);
//        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

//        HashMap<Integer, String> userdata = new HashMap<>(
//                Map.of(
//                        1, "Ariel",
//                        2, "Pedro",
//                        3, "Lucia",
//                        4, "Ramon"
//                )
//        );
//
//        HashSet<String> nombres = new HashSet<>(
//                List.of("Ariel", "Martin", "Luciano")
//        );
//
//        for (String nombre: nombres) {
//            System.out.println("Elemento hash: " + nombre);
//        }
//
//        for (Map.Entry<Integer, String> data: userdata.entrySet()) {
//            System.out.println(data.getValue());
//        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

//        for (int numero_descendente = 10; numero_descendente > 0; numero_descendente-- ) {
//            System.out.println(numero_descendente);
//        };

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

//        for (int contador = 1; contador <= 20; contador++) {
//            if (contador % 3 == 0) {
//                continue;
//            }
//            System.out.println(contador);
//        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

//        int[] negativo = new int[]{1, 3, 5, -3, 8};
//
//        for (int numero: negativo) {
//            if (numero < 0) {
//                break;
//            }
//            System.out.println(numero);
//        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        int factorial = 0;

        for (int inicial = 5; inicial == 0; inicial-- ) {
            if ((inicial-1) > 0) {
                factorial += inicial * inicial-1;
            }
            break;
        }

        System.out.println("Factorial: " + factorial);

    }
}
