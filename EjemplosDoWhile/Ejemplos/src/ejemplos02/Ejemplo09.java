/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

               int nota;
        int salida;
        String nombre;
        double promedio;
        boolean bandera = true;
        String cadenaFinal = " ";
        String mensajeNota;
        double suma = 0;
        int contador = 0;

        cadenaFinal = "Listado de Notas\n";

        do {

            System.out.println("Ingrese nombre del estudiante:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese calificacion:");
            nota = entrada.nextInt();

            if (nota >= 5) {
                mensajeNota = "Muy buena";
            } else {
                mensajeNota = "Buena";
            }

            cadenaFinal = String.format("%sCalificacion %d (%s) del"
                    + " estudiante %s\n",
                    cadenaFinal,
                    nota,
                    mensajeNota,
                    nombre);

            suma = suma + nota;
            contador = contador + 1;

            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + " si no cualquier otro numero para continuar");
            
            salida = entrada.nextInt();

            entrada.nextLine();

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera);

        promedio = suma / contador;

        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
