package practica2;

import javax.swing.JOptionPane;

public class Mago extends Personaje{
	// Atributos
	private String[] hechizos;
	private int cantHechizos = 0;
	
	// Constructor por defecto
	public Mago() {
		super();
		nombre = "Mago";
		inteligencia = 17;
		hechizos = new String[4];
	}

	// Constructor con parametros
	public Mago(String nombre, String raza, int fuerza, int inteligencia, int vidaMax) {
		super(nombre, raza, fuerza, inteligencia, vidaMax);
		hechizos = new String[4];
	}
	
	// Otros metodos
	
	@Override
	public void imprimirDatos() {
		String mensaje = "";
		
		mensaje += "Nombre: " + nombre + "\n";
		mensaje += "Raza: " + raza + "\n";
		mensaje += "Fuerza: " + fuerza + "\n";
		mensaje += "Inteligencia: " + inteligencia + "\n";
		mensaje += "PV Maximos: " + vidaMax + "\n";
		mensaje += "PV Actuales: " + vidaActual + "\n";
		for (int i = 0; i < cantHechizos; i++)
			mensaje += "Hechizo " + (i+1) + ": " + hechizos[i] + "\n";
		
		JOptionPane.showMessageDialog(null, mensaje, "Informacion del mago", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void aprenderHechizo(String hechizo) {
		// Si el indice llega a 4 quiere decir que el arreglo de hechizo esta lleno 
		// por lo tanto no se agregaran mas hechizos
		if (cantHechizos < 4) { 
			hechizos[cantHechizos] = hechizo;
			cantHechizos++;
		}
		else {
			JOptionPane.showMessageDialog(null, "El mago solo puede aprender 4 hechizos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void olvidarHechizo(int indice) {
		// Esto es para que solo se puedan quitar hechizos si hay al menos un hechizo en 
		// el arreglo
		if (cantHechizos > 0 && indice < cantHechizos) {
			hechizos[indice] = "";
			for (int i = indice; i < cantHechizos-1; i++) {
				hechizos[i] = hechizos[i+1];
			}
			for (int i = cantHechizos-1; i < 4; i++) {
				hechizos[i] = "";
			}
			cantHechizos--;
		}
		else {
			System.out.println("Error: No se puede quitar este hechizo");
		}
	}

	// El mago utilizara uno de los hechizos que tiene para quitarle 10 PV al objetivo
	// pero se le olvidara cuando lo use
	@Override
	public void usarHechizo(Personaje objetivo) {
		if (cantHechizos > 0) {
			objetivo.vidaActual -= 10;
			System.out.println(nombre + " uso " + hechizos[cantHechizos-1] + " sobre " + objetivo.nombre);
			System.out.println(objetivo.nombre + " ahora tiene " + objetivo.vidaActual + " PV");
			olvidarHechizo(cantHechizos-1);
		}
		else 
			System.out.println("El mago no tiene hechizos que usar, asi que no le hizo nada al objetivo");
	}
	
	
}
 