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
public class CaballoTroya {
    private int capacidad;
    private int ocupacion;
    private Guerrero[] ocupantes;

    public CaballoTroya(int capacidad) {
        this.capacidad = capacidad;
        this.ocupacion = 0;
        this.ocupantes = new Guerrero[capacidad];
    }
    
    public int MontarGuerrero(Guerrero guerrero) {
        if (guerrero.isPuedeMontarCaballo()) {
            int indice = ocupacion-1;
            ocupantes[indice] = guerrero;
            ocupacion++;
            System.out.println(guerrero.getNombre() + " se ha montado en el caballo de Troya");
            return ocupacion;
        }
        else if (ocupacion == capacidad) {
            System.out.println(guerrero.getNombre() + " no se puede montar porque el caballo esta lleno");
            return -1;
        }
        System.out.println(guerrero.getNombre() + " es troyano así que no se puede montar en el caballo de Troya");
        return -2;
    }
    
    public int BuscarGuerrero(String nombreGuerrero) {
        return 0;
    }   
}
