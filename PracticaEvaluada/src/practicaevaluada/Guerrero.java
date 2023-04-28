/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaevaluada;

/**
 *
 * @author labbd
 */
public abstract class Guerrero {
    protected String nombre;
    protected int edad;
    protected int fuerza;
    protected String estado; // Indica en que estado se encuentra el guerrero ya sea "Sano", "Herido" o "Muerto"
    protected boolean puedeMontarCaballo; // Indica si el guerrero puede montarse o no al caballo de Troya
    
    public Guerrero(){
        this.nombre = "GuerreroX";
        this.edad = 15;
        this.fuerza = 1;
    }

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        setEdad(edad);
        setFuerza(fuerza);
        this.estado = "Sano";
    }

    // Otros métodos
    public abstract void CopiarGuerrero();
    
    public void Atacar(Guerrero guerrero) {
        if (guerrero.getEstado() == "Sano") {
            guerrero.setEstado("Herido");
            System.out.println(nombre + " ataco a " + guerrero.getNombre() + ", hiriendolo gravemente");
        }
        if (guerrero.getEstado() == "Herido") {
            guerrero.setEstado("Muerto");
            System.out.println(nombre + " ataco a " + guerrero.getNombre() + ", matandolo en el acto");
        }
        else 
            System.out.println(nombre + " pensaba atacar a " + guerrero.getNombre() + ", pero ya estaba muerto");
    }
    
    public abstract void Retirarse();
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 5 || edad >= 60) 
            this.edad = 25;
        else 
            this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza <= 1 || fuerza >= 10)
            this.fuerza = 5;
        else 
            this.fuerza = fuerza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isPuedeMontarCaballo() {
        return puedeMontarCaballo;
    }

    public void setPuedeMontarCaballo(boolean puedeMontarCaballo) {
        this.puedeMontarCaballo = puedeMontarCaballo;
    }
    
    
}
