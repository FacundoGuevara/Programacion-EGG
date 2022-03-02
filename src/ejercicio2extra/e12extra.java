/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package ejercicio2extra;

import ejercicio2extra.calculos.calculo;
import ejercicio2extra.puntos.puntos;

/**
 *
 * @author fggue
 */
public class e12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
puntos P1 = new puntos();
calculo cal = new calculo();
cal.crearpuntos(P1);
cal.calcularpuntos(P1);
    }
    
}
