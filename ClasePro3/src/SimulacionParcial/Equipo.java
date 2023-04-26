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
public class Equipo {
    private String nombre;
    private Jugador[] jugadores;
    private String pais;
    private Tecnico[] grupoTecnico;

    public Equipo(String nombre, Jugador[] jugadores, String pais, Tecnico[] grupoTecnico) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.pais = pais;
        this.grupoTecnico = grupoTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Tecnico[] getGrupoTecnico() {
        return grupoTecnico;
    }

    public void setGrupoTecnico(Tecnico[] grupoTecnico) {
        this.grupoTecnico = grupoTecnico;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + 
                ", jugadores=" + Arrays.toString(jugadores) + 
                ", pais=" + pais + 
                ", grupoTecnico=" + Arrays.toString(grupoTecnico) + '}';
    }
    
    
}
