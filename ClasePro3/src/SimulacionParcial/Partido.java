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
public class Partido {
    private Equipo equipo1, equipo2;
    private Arbitro[] grupoArbitros;
    private int golesMarcados, tarjetasSacadas, asistencia;
    private String faseEvento;
    private Estadio estadio;

    public Partido(Equipo equipo1, Equipo equipo2, Arbitro[] grupoArbitros, int golesMarcados, int tarjetasSacadas, int asistencia, 
            String faseEvento, Estadio estadio) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.grupoArbitros = grupoArbitros;
        this.golesMarcados = golesMarcados;
        this.tarjetasSacadas = tarjetasSacadas;
        this.asistencia = asistencia;
        this.faseEvento = faseEvento;
        this.estadio = estadio;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Arbitro[] getGrupoArbitros() {
        return grupoArbitros;
    }

    public void setGrupoArbitros(Arbitro[] grupoArbitros) {
        this.grupoArbitros = grupoArbitros;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getTarjetasSacadas() {
        return tarjetasSacadas;
    }

    public void setTarjetasSacadas(int tarjetasSacadas) {
        this.tarjetasSacadas = tarjetasSacadas;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String getFaseEvento() {
        return faseEvento;
    }

    public void setFaseEvento(String faseEvento) {
        this.faseEvento = faseEvento;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    
    
    
    
}
