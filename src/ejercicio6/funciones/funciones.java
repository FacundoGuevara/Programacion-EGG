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
package ejercicio6.funciones;

import ejercicio6.maquina.cafetera;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class funciones {
Scanner leer = new Scanner(System.in);
cafetera C1 = new cafetera();
//llenar cafetera
public cafetera llenar(cafetera C1){
C1.setCactual(C1.getCmax());
return C1;
}
//servir taza e informar si se lleno o no 

public cafetera servirtaza (cafetera C1){
int taza;
    System.out.println("Indique tamano de la taza (en ml)");
taza=leer.nextInt();;
if (taza>C1.getCactual()){
    System.out.println("lo siento, La taza se lleno con "+C1.getCactual()+" ml de cafe");
    System.out.println("Rellene la cafetera");
C1.setCactual(0);
} else {
System.out.println("Su taza se lleno correctamente");
C1.setCactual((C1.getCactual()-taza));
}
return C1;
}
//vaciar

public cafetera vaciar(cafetera C1){
C1.setCactual(0);
return C1;
}
//agregar cafe

public cafetera Agregarcafe(cafetera C1){
    System.out.println("cuanto cafe desea agregar?");
int cantcafe=leer.nextInt();
while ((C1.getCactual()+cantcafe)>C1.getCmax()){
    System.out.println("La capacidad maxima que usted puede agregar es de "+(C1.getCmax()- C1.getCactual())+"ml");
    System.out.println("ingrese nuevamente la cantidad que desea agregar");
cantcafe=leer.nextInt();
}
C1.setCactual(cantcafe+C1.getCactual());
return C1;
}
//ver cant de cafe disponible
public void cafedisponible(cafetera C1){
    System.out.println("Quedan "+C1.getCactual()+"ml de cafe en la cafetera");
}
}
