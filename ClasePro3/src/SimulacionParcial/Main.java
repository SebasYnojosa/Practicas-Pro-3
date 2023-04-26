
package SimulacionParcial;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Jugador[] jugadores = new Jugador[20];
        Tecnico[] tecnicos = new Tecnico[2];
        
        for (int i = 0; i < 20 ; i++) {
            jugadores[i] = new Jugador("Federico", Math.abs(rand.nextInt()%20)+1, Math.abs(rand.nextInt()%12)+1,Math.abs(rand.nextInt()%99)+1900,"Valencia","Defensa");
        }
        
        tecnicos[0] = new Tecnico("Juan", 25, 10, 78, "Caracas", "Var");
        tecnicos[1] = new Tecnico("Pedrito", 4, 1, 2004, "Bolivar", "Director");
        
        Equipo equipo = new Equipo("Aguilas", jugadores, "Venezuela", tecnicos);
        
        System.out.println(equipo.toString());
        
    }
    
}
