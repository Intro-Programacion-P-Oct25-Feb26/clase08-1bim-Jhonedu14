/*
Que se genere una solución que permita presenta lo siguiente, con una sola cadena
acumuladora

1
2
3
4
5
6
7
8
9
10

Y presente la suma
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        String cadena = "";
        do {
            suma = suma + contador;
            cadena = String.format("%s%s\n", cadena, contador);
            contador = contador + 1;
        } while (contador <= 10);
        
        cadena = String.format("%s\nLa suma es %d\n", cadena,suma);
        System.out.printf("%s\n", cadena);
    }

}
