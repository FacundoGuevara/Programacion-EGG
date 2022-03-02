/*
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package ejercicio1extra;

import ejercicio1extra.cancion.cancion;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class e1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  cancion C1= new cancion();
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
crearcancion(C1);
mostrarcancion(C1);
}
//crear cancion
public static cancion crearcancion(cancion C1){
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Ingrese titulo de la cancion");
C1.setTitulo(leer.next());
    System.out.println("Ingrese autor");
C1.setAutor(leer.next());
return C1;
}
public static void mostrarcancion(cancion C1){
    System.out.println("Cancion: "+C1.getTitulo().toUpperCase());
    System.out.println("Autor: "+C1.getAutor().toUpperCase());
}
    
}
