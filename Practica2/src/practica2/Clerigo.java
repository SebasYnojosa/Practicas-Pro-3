package practica2;

import javax.swing.JOptionPane;

public class Clerigo extends Personaje{
	// Atributos
	private String dios; // El nombre del dios al que le reza el clerigo 
	
	// Constructores
	public Clerigo() {
		super();
		this.dios = "Larez";
	}
	
	public Clerigo(String nombre, String raza, int fuerza, int inteligencia, int vidaMax, String dios) {
		super(nombre, raza, fuerza, inteligencia, vidaMax);
		this.dios = dios;
	}

	// Otros métodos
	@Override
	public void imprimirDatos() {
		String mensaje = "";
		
		mensaje += "Nombre: " + nombre + "\n";
		mensaje += "Raza: " + raza + "\n";
		mensaje += "Fuerza: " + fuerza + "\n";
		mensaje += "Inteligencia: " + inteligencia + "\n";
		mensaje += "PV Maximos: " + vidaMax + "\n";
		mensaje += "PV Actuales: " + vidaActual + "\n";
		mensaje += "Dios del clerigo: " + dios;
		
		JOptionPane.showMessageDialog(null, mensaje, "Informacion del clerigo", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void usarHechizo(Personaje objetivo) {
		objetivo.vidaActual += 10;
		if (objetivo.vidaActual > objetivo.vidaMax) 
			objetivo.vidaActual = objetivo.vidaMax;
		System.out.println(nombre + " le ha rezado a " + dios + " para poder curar a " + objetivo.nombre);
		System.out.println(objetivo.nombre + " ahora tiene " + objetivo.vidaActual + " PV");
		
	}
	
	
	
}
