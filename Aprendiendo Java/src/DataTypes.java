public class DataTypes {
    public static void main(String[] args) {
        // PRIMITIVOS

/*      Tipo: byte
        Uso: Enteros pequeños.
        Tamaño: 8 bits
        Rango: -128 a 127
*/
        byte edad = 18;
        System.out.println("byte: " + edad);

/*      Tipo: short
        Uso: Enteros más grandes que byte. (se usa más int)
        Tamaño: 16 bits
        Rango: -32.768 a 32.767
*/
        short year = 2012;
        System.out.println("short: " + year);

/*      Tipo: int
        Uso: Enteros.
        Tamaño: 32 bits
        Rango: ±2.147 millones
*/
        int id = 1123456654;
        System.out.println("int: " + id);

/*      Tipo: long
        Uso: Cuando int se queda corto.
        Tamaño: 64 bits
        Rango: ±2.147 millones
*/
        long poblacionMundial = 6000000000L;
        System.out.println("long: " + poblacionMundial);

/*      Tipo: float
        Uso: Representa números con decimales.
        Tamaño: 32 bits
        Precisión aproximada: 6-7 dígitos
*/
        float temperatura = 36.5f;
        System.out.println("float: " + temperatura);

/*      Tipo: double
        Uso: También representa números con decimales, pero con mucha más precisión.
        Tamaño: 64 bits
        Precisión aproximada: 15-16 dígitos
*/
        double pi = 3.141592653589793;
        System.out.println("double: " + pi);

/*      Tipo: char
        Uso: un único valor unicode.
*/
        char letra = 'A';
        System.out.println("char: " + letra);

/*      Tipo: boolean
        Uso: verdadero o falso
*/
        boolean vivo;
        vivo = false;
        System.out.println("boolean: " + vivo);


        // DE REFERENCIA

        String texto = "Hola";
        System.out.println("String: " + texto);
    }
}
