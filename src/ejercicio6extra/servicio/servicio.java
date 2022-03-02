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
package ejercicio6extra.servicio;

import ejercicio6extra.ahorcado.ahorcado;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class servicio {

    Scanner leer = new Scanner(System.in);

    public ahorcado crearjuego(ahorcado H1) {
        System.out.println("Ingrese la palabra con la que se jugara");
        String palabra = leer.next();
        H1.palabrita = palabra;
        H1.letras = palabra.length();
        H1.palabrabuscar = new String[H1.letras];
//bucle para llenar los espacios vacios
        H1.palabraencontrada = new String[H1.letras];
        for (int i = 0; i < palabra.length(); i++) {
            H1.palabraencontrada[i] = " ";
        }
//bucle para llenar el vector con las letras
        for (int i = 0; i < palabra.length(); i++) {
            H1.palabrabuscar[i] = palabra.substring(i, i + 1);
        }
///cant de intentos
        System.out.println("Ingrese cantidad de intentos maximo");
        H1.jugadasmaximas = leer.nextInt();
        H1.cantdejugadas = 0;
        H1.letras = palabra.length();
        return H1;
    }

    public void buscarletra(ahorcado H1) {
//declaracion de variables
        String palabrarriesgar = null;
        int conttotal;
        conttotal = H1.letras;
//while para buscar todas las letras que permita la cantidad de jugadas
        do {
            int cont = 0;
            System.out.println("Ingrese la letra que quiere buscar");
            String letra = leer.next();

//bucle para reccorer el vector q contiene la palabra letra por letra y contar cuantas veces encontro la letra ingresada
            for (int i = 0; i < H1.letras; i++) {
                if (letra.equals(H1.palabrabuscar[i])) {
                    H1.palabraencontrada[i] = H1.palabrabuscar[i];
                    cont = cont + 1;
                }
            }
// if para ingresar mensaje y restar un intento si la letra no se encontro y en caso de encontrar 
//mostrar la palabra con las letras agregadas
            if (cont == 0) {
                System.out.println("La letra ingresada no forma parte de la palabra");
                H1.cantdejugadas = H1.cantdejugadas + 1;
                System.out.println("A usted le quedan " + (H1.jugadasmaximas - H1.cantdejugadas) + " jugadas");
            } else {
                for (int i = 0; i < H1.letras; i++) {
                    System.out.print(H1.palabraencontrada[i]);
                }
                System.out.println();
                conttotal = conttotal - cont;
                System.out.println("Le quedan encontrar " + (conttotal) + " letras");
//probar palabra y en caso de equivocarse mostrar mensaje restando intento
                System.out.println("Quiere arriesgar por una palabra?(si/no)");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la palabra que crea correcta");
                    palabrarriesgar = leer.next();
                    if (palabrarriesgar != H1.palabrita) {
                        H1.cantdejugadas = H1.cantdejugadas + 1;
                        System.out.println("A usted le quedan " + (H1.jugadasmaximas - H1.cantdejugadas) + " jugadas");
                    }
                }
            }
// while que solo se ejectuta mientra la palabra sea incorrecta o los intentos sean menores a los intentos maximos
        } while ((!H1.palabrita.equalsIgnoreCase(palabrarriesgar)) && (H1.cantdejugadas < H1.jugadasmaximas));
        if (H1.cantdejugadas >= H1.jugadasmaximas) {
            System.out.println("usted es malisimo, ingrese el numero 1 para crear otro juego");
        } else {
            System.out.println("BIEN JUGADO CAPO");
        }
    }

}
