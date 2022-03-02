/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

import ejercicio9.matematica.matematica;

/**
 *
 * @author fggue
 */
public class e9 {

    public static void main(String[] args) {
        String mayor = null;
        matematica M1 = new matematica();
        M1.setNum1(Math.random() * 10);
        M1.setNum2(Math.random() * 100);
        System.out.println("Num1: " + Math.round(M1.getNum1()));
        System.out.println("Num2: " + Math.round(M1.getNum2()));
        devolvermayor(M1);
        potencia(M1);

    }

// funcion devuelve mayor
    public static void devolvermayor(matematica M1) {
        if (M1.getNum1() > M1.getNum2()) {
            System.out.println("El numero 1 es mas grande que el numero 2 ");
        } else {
            System.out.println("El numero 2 es mas grande que el numero 1");
        }
    }
//calcular potencia

    public static void potencia(matematica M1) {
        String mayor = null;
        if (M1.getNum1() > M1.getNum2()) {
            mayor = "1";
        } else {
            mayor = "2";
        }
        double potencia;
        if (mayor.equals("1")) {
            potencia = Math.pow(Math.round(M1.getNum1()), Math.round(M1.getNum2()));
        } else {
            potencia = Math.pow(Math.round(M1.getNum2()), Math.round(M1.getNum1()));
        }
        System.out.println("EL resultado es: " + potencia);
    }
}
