/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package ejercicio6extra;

import ejercicio6extra.ahorcado.ahorcado;
import ejercicio6extra.servicio.servicio;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class e6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String confirmacion=null;
int opcion;
 ahorcado H1 = new ahorcado();
        servicio ser = new servicio();
Scanner leer = new Scanner(System.in);
do {
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear nuevo juego");
            System.out.println("2-probar letra");
            System.out.println("3-salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ser.crearjuego(H1);
                    
            
                case 2:
                   ser.buscarletra(H1);
                    break;
                case 3:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
    }

}
