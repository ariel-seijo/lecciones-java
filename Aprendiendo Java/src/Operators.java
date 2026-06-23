public class Operators {

    public static void main(String[] args) {

        // ARITMETICOS

        int a = 10;
        int b = 7;

        System.out.println(a + b); // 17
        System.out.println(a - b); // 3
        System.out.println(a * b); // 70
        System.out.println(a / b); // 1
        System.out.println(a % b); // 3

        // ASIGNACION

        int x = 10;

        x += 7;
        System.out.println(x); // 17
        x -= 7;
        System.out.println(x); // 3
        x *= 7;
        System.out.println(x); // 70
        x /= 7;
        System.out.println(x); // 10
        x %= 7;
        System.out.println(x); // 3

        // RELACIONALES

        int edad = 22;
        System.out.println(edad > 18); // true
        System.out.println(edad < 18); // false
        System.out.println(edad >= 18); // true
        System.out.println(edad == 22); // true
        System.out.println(edad != 22); // false

        // LOGICOS

        boolean tieneEdad = true;
        boolean tieneDocumento = false;

        System.out.println(tieneEdad && tieneDocumento); // false
        System.out.println(tieneEdad || tieneDocumento); // true
        System.out.println(!tieneEdad); // false

        // UNARIOS

        int contador = 5;

        System.out.println(-contador); // -5
        System.out.println(+contador); // 5
        System.out.println(++contador); // 6
        System.out.println(contador++); // 6
        System.out.println(contador); // 7


        // TERNARIOS

        int anios = 16;

        String texto = anios > 10 ? "Es mayor" : "Es menor";
        System.out.println(texto);

    }
}
