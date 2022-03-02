/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12.persona;

import java.util.Date;

/**
 *
 * @author fggue
 */
public class persona {

    private Date nacimiento;
    private String nombrecompleto;
private int edad;
private int numero;

//contructores

    public persona() {
    }

    public persona(Date nacimiento, String nombrecompleto,int edad) {
        this.nacimiento = nacimiento;
        this.nombrecompleto = nombrecompleto;
    }

//getter and setter

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
