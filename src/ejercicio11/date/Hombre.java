/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11.date;

import java.util.Date;

/**
 *
 * @author fggue
 */
public class Hombre {
   private Date fechanacimiento;
//constructores
    public Hombre() {
    }

    public Hombre(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
//gettes and setter 

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

}
