/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Ejercicio55.servicio;

import Ejercicio55.cuenta.Cuenta;
import java.util.Scanner;

public class servicio {
    Scanner leer = new Scanner(System.in);
//crear cuenta
    public Cuenta crearcuenta(Cuenta C1){
        System.out.println("Ingrese numero de cuenta");
        C1.setNcuenta(leer.next());
        System.out.println("Ingrese DNI");
        C1.setDNI(leer.next());
        System.out.println("Ingrese Saldo actual");
        C1.setSaldo(leer.nextDouble());
        return C1;
    }
//ingresar dinero

    public Cuenta ingresard(Cuenta C1) {
        double monto;
        System.out.println("Ingrese monto a depositar");
        monto = leer.nextDouble();
        C1.setSaldo(C1.getSaldo() + monto);
        return C1;
    }
//Retirar dinero (no me deja poner el if para que se quede la cuenta en 0)

    public Cuenta retirar(Cuenta C1) {
        double monto;
        System.out.println("Ingrese monto a retirar");
        monto = leer.nextDouble();
        C1.setSaldo(C1.getSaldo() - monto);
        return C1;
    }
//retiro express

    public Cuenta retirorapido(Cuenta C1) {
        double monto;
        System.out.println("ingrese monto a retirar");
        monto = leer.nextDouble();
        while ((monto > (C1.getSaldo() * 20) / 100)) {
            System.out.println("Recuerde que solo puede retirar un monto limite de: $" + (C1.getSaldo() * 20) / 100);
            System.out.println("Ingrese nuevamente el monto");
            monto = leer.nextDouble();
        }
        C1.setSaldo(C1.getSaldo() - monto);
        return C1;
    }
//consultar saldo 

    public void consultarsaldo(Cuenta C1) {
        System.out.println(" saldo: $" + C1.getSaldo());
    }
//consultar datos

    public void consultardatos(Cuenta C1) {
        System.out.println("Numero de cuenta: " + C1.getNcuenta());
        System.out.println("DNI: " + C1.getDNI());
        System.out.println(" saldo: $" + C1.getSaldo());
    }
}
