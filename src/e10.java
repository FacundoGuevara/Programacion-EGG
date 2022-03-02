
import java.util.Arrays;

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */

/**
 *
 * @author fggue
 */
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v1 = new int[50];
        int[] v2 = new int[20];
rellenarvector1(v1);
mostrarvector(v1);
ordenarv2(v1,v2);
        System.out.println("");
mostrarvectores(v1,v2);
    }
//rellena vector1
public static int[] rellenarvector1(int [] v1 ){
    for (int i = 0; i < 50; i++) {
v1[i] = (int) (Math.random() * 100 + 1);
    }
return v1;
}
//muestra el vector 1
public static void mostrarvector(int [] v1 ){
    System.out.println("Vector 1: ");
    for (int i = 0; i < 50; i++) {
        System.out.print("["+v1[i]+"]");
    }
}
//metodo burbuja para llenar vector 1,y luego pasar los primeros 10 datos al vector 2 
public static int[] ordenarv2 (int[]v1,int[]v2){
int aux=0;
Arrays.sort(v1);
/*
 for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (v1[j] > v1[i]) {
                    aux = v1[j];
                    v1[j] = v1[i];
                    v1[i] = aux;
                }
}
}
*/
    for (int i = 0; i < 20; i++) {
v2[i]=v1[i];
if (i>9) {
v2[i]=5;
}        
    }
return v2;
}
//muestra ambos vectores
public static void mostrarvectores (int [] v1,int[]v2){
    System.out.println("Vector 1 ordenado:");
    for (int i = 0; i < 50; i++) {
        System.out.print("["+v1[i]+"]");
    }
    System.out.println("");
    System.out.println("Vector 2:");
  for (int i = 0; i < 20; i++) {
        System.out.print("["+v2[i]+"]");
    }
}


}
