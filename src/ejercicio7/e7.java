/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio7;

import ejercicio7.calculos.calculos;
import ejercicio7.persona.Persona;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        calculos cal = new calculos();

//persona 1
        Persona P1 = new Persona();
        System.out.println("Paciente numero 1: ");
        P1 = cal.crearpersona(P1);
        cal.calcularIMC(P1);
        cal.mayor(P1);
//persona 2

        System.out.println("Paciente numero 2: ");
        Persona P2 = new Persona();
        P2 = cal.crearpersona(P2);
        cal.calcularIMC(P2);
        cal.mayor(P2);
        //persona 3 

        System.out.println("paciente numero 3:");
        Persona P3 = new Persona();
        P3 = cal.crearpersona(P3);
        cal.calcularIMC(P3);
        cal.mayor(P3);

//persona 4
        System.out.println("paciente numero 4:");
        Persona P4 = new Persona();
        P4 = cal.crearpersona(P4);
        cal.calcularIMC(P4);
        cal.mayor(P4);

        //estadisticas:
        //paciente1
        int normopeso = 0, infrapeso = 0, sobrepeso = 0, mayoredad = 0;
        if (P1.getIMC() < 20) {
            infrapeso = infrapeso + 1;
        } else if (P1.getIMC() < 25) {
            normopeso = normopeso + 1;
        } else {
            sobrepeso = sobrepeso + 1;
        }
        if (P1.isMayor() == true) {
            mayoredad = mayoredad + 1;
        }
//paciente2
        if (P2.getIMC() < 20) {
            infrapeso = infrapeso + 1;
        } else if (P2.getIMC() < 25) {
            normopeso = normopeso + 1;
        } else {
            sobrepeso = sobrepeso + 1;
        }
        if (P2.isMayor() == true) {
            mayoredad = mayoredad + 1;
        }
        //paciente3
        if (P3.getIMC() < 20) {
            infrapeso = infrapeso + 1;
        } else if (P3.getIMC() < 25) {
            normopeso = normopeso + 1;
        } else {
            sobrepeso = sobrepeso + 1;
        }
        if (P3.isMayor() == true) {
            mayoredad = mayoredad + 1;
        }
//paciente4
        if (P4.getIMC() < 20) {
            infrapeso = infrapeso + 1;
        } else if (P4.getIMC() < 25) {
            normopeso = normopeso + 1;
        } else {
            sobrepeso = sobrepeso + 1;
        }
        if (P4.isMayor() == true) {
            mayoredad = mayoredad + 1;
        }
        System.out.println("Conclusiones finales del estudio realizado: ");
        System.out.println("El " + ((infrapeso * 100) / 4) + "% de los pacientes tienen un peso deficiente");
        System.out.println("El " + ((normopeso * 100) / 4) + "% de los pacientes tienen un peso adecuado");
        System.out.println("El " + ((sobrepeso * 100) / 4) + "% de los pacientes tienen un peso elevado");
        System.out.println("El " + ((mayoredad * 100) / 4) + "% de los pacientes son mayores de edad");
    }
}
