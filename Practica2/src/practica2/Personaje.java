package practica2;

public abstract class Personaje {
	// Atributos
	protected String nombre, raza;
	protected int fuerza, inteligencia, vidaMax, vidaActual;
	
	// Constructor por defecto
	public Personaje() {
		nombre = "Peppino";
		raza = "Humano";
		fuerza = inteligencia = 10;
		vidaMax = vidaActual = 100;
	}
	
	// Constructor con parametros
	public Personaje(String nombre, String raza, int fuerza, int inteligencia, int vidaMax) {
		this.nombre = nombre;
		this.raza = raza;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.vidaMax = vidaMax;
		this.vidaActual = vidaMax;
	}
	
	// Otros metodos
	public abstract void imprimirDatos();
	public abstract void usarHechizo(Personaje objetivo);
	
}
