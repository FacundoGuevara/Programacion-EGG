/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ejercicio5extra;

import ejercicio5extra.meses.mes;
import java.util.Scanner;

public class e5extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        mes M1 = new mes();
        String respuesta, messecreto = M1.getMeses()[0];
        System.out.println("Adivine el mes secreto");
        System.out.println("Tienes 3 intentos");
        respuesta = leer.next();
        int contador = 0;
        while (!respuesta.equalsIgnoreCase(messecreto) && contador != 2) {
            contador = contador + 1;
            System.out.println("Incorrecto, te queda otro intento");

            respuesta = leer.next();
        }
        if (contador == 2) {
            System.out.println("Lo siento,superaste el limite de 3 intentos fallidos, intentalo de nuevo otro dia");
        } else {
            System.out.println("Felicidades, es correcto");
        }

    }

}
