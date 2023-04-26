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
public class Competencia {
    private String nombre;
    private Estadio[] estadios;
    private Partido[] partidos;

    public Competencia(String nombre, Estadio[] estadios, Partido[] partidos) {
        this.nombre = nombre;
        this.estadios = estadios;
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estadio[] getEstadios() {
        return estadios;
    }

    public void setEstadios(Estadio[] estadios) {
        this.estadios = estadios;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }
    
    
}
