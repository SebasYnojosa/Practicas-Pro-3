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
public class Troyano extends Guerrero{

    public Troyano() {
        super();
        puedeMontarCaballo = false;
    }

    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
        puedeMontarCaballo = false;
    }

    @Override
    public void CopiarGuerrero() {
        
    }

    @Override
    public void Retirarse() {
        System.out.println(nombre + " es un valiente guerrero troyano asi que no puede retirarse sin importar su condicion");
    }
}
