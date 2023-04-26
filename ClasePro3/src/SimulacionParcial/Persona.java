/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionParcial;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author labbd
 */
public abstract class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String lugarNacimiento;

    public Persona(String nombre, int diaNac, int mesNac, int anioNac, String lugarNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.of(anioNac, mesNac, diaNac);
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public abstract String toString();
    
    
}
