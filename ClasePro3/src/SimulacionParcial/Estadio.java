/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionParcial;

import java.util.Arrays;

/**
 *
 * @author labbd
 */
public class Estadio {
    private String nombre, pais;
    private int capacidad;
    private Tecnico[] grupoTecnico;

    public Estadio(String nombre, String pais, int capacidad, Tecnico[] grupoTecnico) {
        this.nombre = nombre;
        this.pais = pais;
        this.capacidad = capacidad;
        this.grupoTecnico = grupoTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Tecnico[] getGrupoTecnico() {
        return grupoTecnico;
    }

    public void setGrupoTecnico(Tecnico[] grupoTecnico) {
        this.grupoTecnico = grupoTecnico;
    }

    @Override
    public String toString() {
        return "Estadio{" + "nombre=" + nombre + 
                ", pais=" + pais + 
                ", capacidad=" + capacidad + 
                ", grupoTecnico=" + Arrays.toString(grupoTecnico) + '}';
    }
    
    
}
