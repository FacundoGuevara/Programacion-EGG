/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ejercicio11;

import ejercicio11.date.Hombre;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author fggue
 */
public class e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
Hombre D1 = new Hombre();
int anio=0,mes=0,dia=0;
//pido anio,mes,dia para rellenar la fecha date


     System.out.println("ingrese su fecha de nacimiento porfavor");
        System.out.println("Año de nacimiento: ");
anio=leer.nextInt();
        System.out.println("Mes de nacimiento:(1-enero, 2-febrero, 3-marzo, etc....");
mes=leer.nextInt();
        System.out.println("Dia de nacimiento: ");
dia=leer.nextInt();
Date fechadenacimiento = new Date(anio-1900, mes-1, dia);
D1.setFechanacimiento(fechadenacimiento);
//calculo de edad


Date fechaactual=new Date();
        System.out.println(D1.getFechanacimiento());
    if (fechaactual.getMonth()>D1.getFechanacimiento().getMonth() && (fechaactual.getDate()>D1.getFechanacimiento().getDate())){
        System.out.println("Usted tiene "+(fechaactual.getYear()-D1.getFechanacimiento().getYear())+" anios");
} else if (fechaactual.getMonth()==D1.getFechanacimiento().getMonth() && (fechaactual.getDate()==D1.getFechanacimiento().getDate())) {
        System.out.println("Felices cumpleanois capo, 22 anios mi rey, ya estas grande");
} else { 
System.out.println("Usted tiene "+ ((fechaactual.getYear()-D1.getFechanacimiento().getYear())-1)+" anios");
}
    }
    
}
