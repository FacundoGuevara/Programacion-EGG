/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package ejercicio4extra.calculos;

import com.sun.org.apache.xpath.internal.operations.Mod;
import ejercicio4extra.NIF.NIF;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fggue
 */
public class calculos {

    Scanner leer = new Scanner(System.in);


    public NIF crearnif(NIF N1) {
        System.out.println("Ingrese su DNI");
        N1.setDNI(leer.nextInt());
        char[] vocales = {'T', 'R', 'w', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resultado = N1.getDNI() / 23;
        resultado = resultado * 23;
        resultado = N1.getDNI() - resultado;
        System.out.println(resultado);
        for (int i = 0; i < 22; i++) {
            if (i == resultado) {
                N1.setLetra(vocales[i]);
                return N1;
            }
        }
        return N1;
    }

    public void mostrarnif(NIF N1) {
        System.out.println("DNI: " + N1.getDNI());
        System.out.println("NIF:00395469-" + N1.getLetra());
    }
}
