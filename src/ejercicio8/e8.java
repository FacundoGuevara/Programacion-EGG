/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8;

import ejercicio8.cadena.cadena;
import ejercicio8.funcionalidades.comandos;
import java.util.Scanner;



/**
 *
 * @author fggue
 */
public class e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        comandos com = new comandos();
        cadena C1 = new cadena();
        int opcion;
        String confirmacion = null;
        do {
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear Frase");
            System.out.println("2-Mostrar Vocales");
            System.out.println("3-Invertir Frase");
            System.out.println("4-consultar Veces Repetido");
            System.out.println("5-Comparar Longitud");
            System.out.println("6-Unir Frases");
            System.out.println("7-Reemplazar");
            System.out.println("8-corroboracion de contenido");
            System.out.println("9-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    com.crearcadena(C1);
                    break;
                case 2:
                    com.mostrarvocales(C1);
                    break;
                case 3:
                    com.invertirfrase(C1);
                    break;
                case 4:
                    com.vecesrepetido(C1);
                    break;
                case 5:
                    com.compararlongitud(C1);
                    break;
                case 6:
                    com.unirfrase(C1);
                    break;
                case 7:
                   com.remplazar(C1);
                    break;
                case 8:
                    com.contener(C1);
                    break;
                case 9:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
        System.out.println("Gracias por usar nuestro programa");
    }
}
