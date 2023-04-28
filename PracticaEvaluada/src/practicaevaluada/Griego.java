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
public class Griego extends Guerrero {

    public Griego() {
        super();
        this.puedeMontarCaballo = true;
    }

    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
        this.puedeMontarCaballo = true;
    }

    @Override
    public void CopiarGuerrero() {
        
    }

    @Override
    public void Retirarse() {
        if (estado == "Sano") {
            System.out.println("El guerrero griego " + nombre + " se ha retirado como un cobarde del combate");
            setEstado("Retirado");
        }
        if (estado == "Herido") 
            System.out.println(nombre + " se quería retirar del combate pero no puede porque esta herido");
        if (estado == "Muerto")
            System.out.println(nombre + " no puede retirarse obviamente porque ya esta muerto");
    }
    
}
