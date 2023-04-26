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
public class Jugador extends Persona {
    
    private String posicion;
    
    public Jugador(String nombre, int diaNac, int mesNac, int anioNac, String lugarNacimiento, String posicion) {
        super(nombre, diaNac, mesNac, anioNac, lugarNacimiento);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + 
                ",fechaNacimiento=" + fechaNacimiento.toString() + 
                ",lugarNacimiento=" + lugarNacimiento + 
                ",posicion=" + posicion + '}' + '\n';
    }

    
    
    
}
