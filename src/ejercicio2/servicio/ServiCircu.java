/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2.servicio;

import ejercicio2.circunferencia.circunferencia;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class ServiCircu {
Scanner leer = new Scanner(System.in);
public circunferencia crearcircu(){
circunferencia C1 = new circunferencia() ;
    System.out.println("Ingrese el radio a continuacion");
C1.setRadio(leer.nextDouble());
return C1;

}
public circunferencia area(circunferencia C1){
C1.setArea(3.14*((C1.getRadio())*C1.getRadio()));
return C1;
}
public circunferencia perimetro(circunferencia C1){
C1.setPerimetro(2*3.14*C1.getRadio());
return C1;
}
public void Mostrarcircu(circunferencia C1){
    System.out.println("El area de este circulo es :"+C1.getArea());
System.out.println("El perimetro de este circulo es :"+C1.getPerimetro());
}

    public circunferencia area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


