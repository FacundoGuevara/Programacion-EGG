/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package ejercicio6extra.ahorcado;

public class ahorcado {
public String palabrita;
public String palabrabuscar[];
public String palabraencontrada[];
public int letras;
public int cantdejugadas;
public int jugadasmaximas;
//constructores 

    public ahorcado() {
    }

    public ahorcado(String palabrita, String[] palabrabuscar, String[] palabraencontrada, int letras, int cantdejugadas, int jugadasmaximas) {
        this.palabrita = palabrita;
        this.palabrabuscar = palabrabuscar;
        this.palabraencontrada = palabraencontrada;
        this.letras = letras;
        this.cantdejugadas = cantdejugadas;
        this.jugadasmaximas = jugadasmaximas;
    }


  
//getter and setter

    public String getPalabrabuscar()[] {
        return palabrabuscar;
    }

    public void setPalabrabuscar(String palabrabuscar[]) {
        this.palabrabuscar = palabrabuscar;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getCantdejugadas() {
        return cantdejugadas;
    }

    public void setCantdejugadas(int cantdejugadas) {
        this.cantdejugadas = cantdejugadas;
    }

    public int getJugadasmaximas() {
        return jugadasmaximas;
    }

    public void setJugadasmaximas(int jugadasmaximas) {
        this.jugadasmaximas = jugadasmaximas;
    }

    public String[] getPalabraencontrada() {
        return palabraencontrada;
    }

    public void setPalabraencontrada(String[] palabraencontrada) {
        this.palabraencontrada = palabraencontrada;
    }

    public String getPalabrita() {
        return palabrita;
    }

    public void setPalabrita(String palabrita) {
        this.palabrita = palabrita;
    }

}
