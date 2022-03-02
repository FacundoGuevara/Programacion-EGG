/*
/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package ejercicio12.servicio;

import ejercicio12.persona.persona;
import java.util.Date;
import java.util.Scanner;

public class servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date fechaactual = new Date();
//crear persona

    public persona crearpersona(persona P1) {
        int dia, mes, anio;
        System.out.println("Ingrese su nombre y apellido");
        P1.setNombrecompleto(leer.next());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia: ");
        dia = leer.nextInt();
        System.out.println("Mes: 1-enero,2-febrero, 3-Marzo,etc....");
        mes = leer.nextInt();
        System.out.println("Anio: ");
        anio = leer.nextInt();
        Date fechanacimiento = new Date(anio - 1900, mes - 1, dia);
        P1.setNacimiento(fechanacimiento);
        return P1;
    }
//calcular edad 

    public persona calcularedad(persona P1) {
        if (fechaactual.getMonth() >= P1.getNacimiento().getMonth() && (fechaactual.getDate() >= P1.getNacimiento().getDate())) {
            P1.setEdad(fechaactual.getYear() - P1.getNacimiento().getYear());
        } else {
            P1.setEdad ((fechaactual.getYear() - P1.getNacimiento().getYear())-1);
        }
        return P1;
    }
//menor de edad
public void menoredad (persona P1){
if (P1.getEdad()<18){
    System.out.println("La persona que ingreso es menor de edad");
} else {
    System.out.println("La persona que ingreso es mayor de edad");
}
}

public void mostrarpersona(persona P1){
    System.out.println("Nombre y apellido: "+P1.getNombrecompleto());
    System.out.println("Fecha de nacimiento: "+P1.getNacimiento());
    System.out.println("Edad: "+P1.getEdad());
}
}
