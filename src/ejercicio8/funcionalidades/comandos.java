/*
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
package ejercicio8.funcionalidades;

import ejercicio8.cadena.cadena;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class comandos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//crearcadena

    public cadena crearcadena(cadena C1) {
        System.out.println("ingrese una frase a eleccion");
        C1.setFrase(leer.next());
        C1.setLongitud((C1.getFrase().length()));
        System.out.println(C1.getLongitud());
        return C1;
    }
//mostrar vocales

    public void mostrarvocales(cadena C1) {
        int a = 0, e = 0, contadori = 0, o = 0, u = 0;
        for (int i = 0; i < ((C1.getLongitud())); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
                a = a + 1;
                continue;
            }
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("E")) {
                e = e + 1;
                continue;
            }

            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("I")) {
                contadori = contadori + 1;
                continue;
            }
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("O")) {
                o = o + 1;
                continue;
            }

            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                u = u + 1;
            }
        }
        System.out.println("Mostrar vocales:");
        System.out.println("A:" + a);
        System.out.println("E:" + e);
        System.out.println("I:" + contadori);
        System.out.println("O:" + o);
        System.out.println("U:" + u);
    }

//invertir frase (impportante,no se como lo hace)
    public void invertirfrase(cadena C1) {
	String fraseinvertida = C1.getFrase();
		System.out.println(fraseinvertida);
		StringBuilder strb = new StringBuilder(fraseinvertida);
		fraseinvertida = strb.reverse().toString();
		System.out.println(fraseinvertida); 
    }
//veces repetido

    public void vecesrepetido(cadena C1) {
        String caracter = null;
        int cont = 0;
        System.out.println("Que caracter desea saber cuantas veces se repite(ingrese solo una letra)");
        caracter = leer.next();
        for (int i = 0; i < ((C1.getLongitud())); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                cont = cont + 1;
            }
        }
        System.out.println("La letra '" + caracter.toUpperCase() + "' se repite " + cont + " veces");
    }
// comparar longitud

    public void compararlongitud(cadena C1) {
        String frasenueva;
        int fraselong;
        System.out.println("ingrese una frase nueva para comparar longitud con la primera que ingreso");
        frasenueva = leer.next();
        fraselong = frasenueva.length();
        if (C1.getLongitud() == fraselong) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }

//unir frase
    public void unirfrase(cadena C1) {
        String frasenueva;
        System.out.println("ingrese una frase nueva para agregarla a la primera que ingreso");
        frasenueva = leer.next();
        System.out.println(C1.getFrase() + " " + frasenueva);

    }
//remplazar

    public void remplazar(cadena C1) {
        String caracter;
        System.out.println("ingrese un caracter para remplazarlo por todas las letras 'a' ");
        caracter = leer.next();
        caracter = caracter.toUpperCase();
        System.out.println(C1.getFrase().toUpperCase().replace("A", caracter));
    }

//contener: deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public void contener(cadena C1) {
        String caracter;
        int cont = 0;
        System.out.println("ingrese un caracter para buscarlo y corroborar si esta presente");
        caracter = leer.next();
        for (int i = 0; i < ((C1.getLongitud())); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                cont = cont + 1;
            }
        }
        if (cont > 0) {
            System.out.println("La frase contiene el caracter '" + caracter + "'");
        } else {
            System.out.println("La frase no contiene el caracter '" + caracter + "'");
        }

    }
}
