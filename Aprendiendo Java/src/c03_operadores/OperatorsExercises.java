package c03_operadores;

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int suma = 10 + 21;
        int resta = 21 - 10;
        int multiplicacion = 5 * 2;
        float division = 5f / 2;
        float resto = 5 % 3;

        System.out.println(suma); //31
        System.out.println(resta); //11
        System.out.println(multiplicacion); // 10
        System.out.println(division); // 2.5
        System.out.println(resto); // 2.0

        // 2. Crea una variable para cada tipo de operación de asignación.

        // meh

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(true && true);
        System.out.println(true || true);
        System.out.println(!false);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(true && false);
        System.out.println(false || false);
        System.out.println(!true);

        // 5. Utiliza el operador lógico and.

        System.out.println(true && false);

        // 6. Utiliza el operador lógico or.

        System.out.println(true || false);

        // 7. Combina ambos operadores lógicos.

        System.out.println((true && false) || (true && true)); // true

        // 8. Añade alguna negación.

        System.out.println((true && false) || !(true && true)); // false

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        int num = 1;

        System.out.println(+num); //1
        System.out.println(++num); //2
        System.out.println(num++); //2

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        int men = 10;
        int women = 5;
        int dogs = 5;

        System.out.println((men + dogs) < (women + dogs) || true ); // true
    }
}