/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio1.servicio;

import java.util.Scanner;
import poo.ejercicio1.recursos.Libro;

/**
 *
 * @author fggue
 */
public class LibroServicio {
Scanner leer = new Scanner (System.in).useDelimiter("\n");

public Libro crearLibro () {
Libro L1= new Libro() ;
    System.out.println("Ingrese ISBM");
L1.setISBN(leer.next());
    System.out.println("Ingrese autor");
L1.setAutor(leer.next());
    System.out.println("ingrese titulo");
L1.setTitulo(leer.next());
        System.out.println("ingrese numero de paginas");
        L1.setNumpag(leer.nextInt());
        return L1;
    }

    public void Mostrarlibro(Libro L1) {
        System.out.println("ISBN:" + L1.getISBN());
        System.out.println("Autor:" + L1.getAutor());
        System.out.println("Titulo:" + L1.getTitulo());
        System.out.println("Numero de paginas" + L1.getNumpag());
    }
}
