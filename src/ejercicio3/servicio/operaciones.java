/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package ejercicio3.servicio;

import ejercicio3.numeros.Numeros;
import java.util.Scanner;
public class operaciones {
Scanner leer = new Scanner(System.in); 
    public Numeros crearop(){
Numeros O1 = new Numeros();
        System.out.println("Ingrese el primer numero con el que va a operar");
O1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero con el que va a operar");
O1.setNum2(leer.nextInt());
return O1;
}
//operaciones matematicas
public void sumar(Numeros O1) {
        System.out.println("La suma de los numeros es: " + (O1.getNum1() + O1.getNum2()));
    }
    public void restar(Numeros O1) {
        System.out.println("La resta de los numeros es: " + (O1.getNum1()- O1.getNum2()));
    }
public void multiplicar(Numeros O1){
if ((O1.getNum1()==0) || (O1.getNum2()==0)) {
    System.out.println("La multiplicacion no es ejecutable debido a que uno de los numeros es de valor '0'");
} else {
System.out.println("La multiplicacion de los numeros es: " + (O1.getNum1()* O1.getNum2()));
}
}
public void dividir (Numeros O1){
if ((O1.getNum1()==0) || (O1.getNum2()==0)) {
    System.out.println("La Division no es ejecutable debido a que uno de los numeros es de valor '0'");
} else {
System.out.println("La division de los numeros es: " + (O1.getNum1() / O1.getNum2()));
}
}
}