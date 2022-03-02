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
package Ejercicio55;

import Ejercicio55.servicio.servicio;
import Ejercicio55.cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class ejercicio5real {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        String confirmacion = null;
        Cuenta C1 = new Cuenta();
        servicio serc = new servicio();
        do {
            System.out.println("Seleccione la opcion que quiera ejecutar");
            System.out.println("1-Crear cuenta");
            System.out.println("2-Ingresar dinero");
            System.out.println("3-Retirar dinero");
            System.out.println("4-Extraccion rapida");
            System.out.println("5-consultar saldo");
            System.out.println("6-consultar datos");
            System.out.println("7-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    serc.crearcuenta(C1);
                    break;
                case 2:
                    serc.ingresard(C1);
                    break;
                case 3:
                    serc.retirar(C1);
                    break;
                case 4:
                    serc.retirorapido(C1);
                    break;
                case 5:
                    serc.consultarsaldo(C1);
                    break;
                case 6:
                    serc.consultardatos(C1);
                    break;
                case 7:
                    System.out.println("Esta seguro que quiere salir?(si/no)");
                    confirmacion = leer.next();
                    confirmacion = confirmacion.toUpperCase();
                    break;
            }
        } while (!"SI".equals(confirmacion));
        System.out.println("Muchas gracias por usar nuestras servicios");
    }
}
