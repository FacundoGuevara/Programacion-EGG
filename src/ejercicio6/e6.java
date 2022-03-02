/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;

import ejercicio6.funciones.funciones;
import ejercicio6.maquina.cafetera;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class e6 {
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int opcion=0;
cafetera C1 = new cafetera();
funciones fun = new funciones();
do {
    System.out.println("1-Llenar cafetera");
    System.out.println("2-servir taza");
    System.out.println("3-vaciar cafetera");
    System.out.println("4-Agregar cafe");
    System.out.println("5-Mostrar cantidad de cafe");
    System.out.println("6-SALIR");
opcion = leer.nextInt();
switch (opcion){
case 1:
fun.llenar(C1);
break;
case 2: 
fun.servirtaza(C1);
break;
case 3:
fun.vaciar(C1);
break;
case 4:
fun.Agregarcafe(C1);
break;
case 5:
fun.cafedisponible(C1);
break;
case 6:
break;
}
} while (opcion!=6);
        System.out.println("Gracias por elegir NESPRESSO");
    }
    
}
