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
package Ejercicio5.servicio;

import Ejercicio5.Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class servicio {

    Scanner leer = new Scanner(System.in);
//Crear rectangulo

    public Rectangulo CR() {
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese altura del rectangulo");
        R1.setAltura(leer.nextInt());
        System.out.println("Ingrese base del rectangulo");
        R1.setBase(leer.nextInt());
        return R1;
    }
//calculo de superficie y area//

    public void Sup(Rectangulo R1) {
        System.out.println("La superficie del rectangulo que ingreso es de: " + (R1.getAltura() * R1.getBase()));
    }

    public void per(Rectangulo R1) {
        System.out.println("El perimetro del rectangulo que ingreso es de: " + ((R1.getAltura() + R1.getBase()) * 2));
    }
//metodo draw
    public void draw(Rectangulo R1) {
        for (int i = 0; i < R1.getAltura(); i++) {
            for (int j = 0; j < R1.getBase(); j++) {
                if ((i == 0) || (i == R1.getAltura() - 1)) {
                    System.out.print(" * ");
                } else if ((j == 0) || (j == R1.getBase() - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("   ");
        }
    }
}
