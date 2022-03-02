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
package ejercicio7.calculos;

import ejercicio7.persona.Persona;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class calculos {

Scanner leer = new Scanner (System.in).useDelimiter("\n");
//crear persona

    public Persona crearpersona(Persona P1) {
        System.out.println("Nombre:");
        P1.setNombre(leer.next());
        System.out.println("Edad:");
        P1.setEdad(leer.nextInt());
        System.out.println("Sexo: Hombre(H),Mujer(M),otro(O)");
        P1.setSexo(leer.next());
        while ((!P1.getSexo().equalsIgnoreCase("M")) && (!P1.getSexo().equalsIgnoreCase("H")) && (!P1.getSexo().equalsIgnoreCase("O"))) {
            System.out.println("Ingrese alguna de las iniciales especificadas anteriormente");
            P1.setSexo(leer.next());
        }
        System.out.println("Altura: en mts(por ejemplo: 1,70 )");
        P1.setAltura(leer.nextDouble());
        System.out.println("Peso: en kg (por ejemplo: 75 )");
        P1.setPeso(leer.nextDouble());
        return P1;
    }
//calculo de IMC con retorno de variable IMC

    public Persona calcularIMC(Persona P1) {
        P1.setIMC((P1.getPeso()) / (Math.pow(P1.getAltura(), 2)));
        return P1;
    }
//mayor de edad
    public Persona mayor(Persona P1) {
        if (P1.getEdad() > 18) {
            P1.setMayor(true);
        } else {
            P1.setMayor(false);
        }
        return P1;
    }
//mostrar
}
