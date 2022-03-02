/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio5;

import Ejercicio5.Rectangulo.Rectangulo;
import Ejercicio5.servicio.servicio;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicio Ser = new servicio();
        Rectangulo R1 = Ser.CR();
        Ser.Sup(R1);
        Ser.per(R1);
        System.out.println("Si quiere dibujar su rectangulo ingrese '1'");

        int respuesta = leer.nextInt();
        if (respuesta == 1) {
            Ser.draw(R1);
        } else {
            System.out.println("Gracias por usar nuestro programa");
        }
    }
}
