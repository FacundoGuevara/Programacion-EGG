/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package ejercicio2extra.calculos;

import ejercicio2extra.puntos.puntos;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class calculo {

    Scanner leer = new Scanner(System.in);

    public puntos crearpuntos(puntos P1) {
        System.out.println("Ingrese la posicion del primer punto:");
        System.out.println("Punto 1,x1: ");
        P1.setX1(leer.nextInt());
        System.out.println("Punto 1,y1: ");
        P1.setY1(leer.nextInt());
        System.out.println("Ingrese la posicion del segundo punto:");
        System.out.println("Punto 2,x2: ");
        P1.setX2(leer.nextInt());
        System.out.println("Punto 2,y2: ");
        P1.setY2(leer.nextInt());
        return P1;
    }

    public void calcularpuntos(puntos P1) {
//teorema de pitagoras aplicado:
        double distancia = Math.sqrt(Math.pow(((P1.getX2()) - (P1.getX1())), 2) + (Math.pow(((P1.getY2()) - (P1.getY1())), 2)));
        System.out.println("La distancia es igual a :" + distancia);
    }
}
