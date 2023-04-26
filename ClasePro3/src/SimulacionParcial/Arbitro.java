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
public class Arbitro extends Persona {
    
    private String federacion, cargo;

    public Arbitro(String nombre, int diaNac, int mesNac, int anioNac, String lugarNacimiento, String federacion, String cargo) {
        super(nombre, diaNac, mesNac, anioNac, lugarNacimiento);
        this.federacion = federacion;
        this.cargo = cargo;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
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
                ",federacion=" + federacion + 
                ",cargo=" + cargo + '}' + '\n';
    }
    
}
