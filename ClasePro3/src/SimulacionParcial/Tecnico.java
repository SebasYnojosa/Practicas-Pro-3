/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionParcial;

/**
 *
 * @author labbd
 */
public class Tecnico extends Persona {
    private String cargo;

    public Tecnico(String nombre, int diaNac, int mesNac, int anioNac, String lugarNacimiento, String cargo) {
        super(nombre, diaNac, mesNac, anioNac, lugarNacimiento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + 
                ",fechaNacimiento=" + fechaNacimiento.toString() + 
                ",lugarNacimiento=" + lugarNacimiento + 
                ",cargo=" + cargo + '}';
    }
    
    
}
