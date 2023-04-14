package practica2;

public class Main {
	
	public static void main(String[] args) {
		// Instancia de las variables para la entrada de datos
		String nombre, raza, dios;
		int fuerza, inteligencia, vidaMax;
		
		// Instancia de nuestro personaje
		Mago[] magos = new Mago[2];
		Clerigo clerigo;
		
		for (int i = 0; i < 2; i++) {
			// Pedimos los datos para los magos
			nombre = Mensajes.pedirString("Ingrese el nombre del mago");
			raza = Mensajes.pedirRaza("Elija una raza para el mago");
			do {
				fuerza = Mensajes.pedirEntero("Ingrese la fuerza del mago (0-15)");
			} while (fuerza > 15 || fuerza < 0);
			do {
				inteligencia = Mensajes.pedirEntero("Ingrese la inteligencia del mago (17-20)");
			} while (inteligencia < 17 || inteligencia > 20);
			do {
				vidaMax = Mensajes.pedirEntero("Ingrese la vida maxima del mago (0-100)");
			} while (vidaMax < 0 || vidaMax > 100);
			
			// Le pasamos los datos al objeto mago
			magos[i] = new Mago(nombre, raza, fuerza, inteligencia, vidaMax);
		}
		
		// Pedimos los datos para el clerigo
		nombre = Mensajes.pedirString("Ingrese el nombre del clerigo");
		raza = Mensajes.pedirRaza("Elija una raza para el clerigo");
		do {
			fuerza = Mensajes.pedirEntero("Ingrese la fuerza del clerigo (18-20)");
		} while (fuerza < 18 || fuerza > 20);
		do {
			inteligencia = Mensajes.pedirEntero("Ingrese la inteligencia del clerigo (12-16)");
		} while (inteligencia < 12 || inteligencia > 16);
		do {
			vidaMax = Mensajes.pedirEntero("Ingrese la vida maxima del clerigo (0-100)");
		} while (vidaMax < 0 || vidaMax > 100);
		dios = Mensajes.pedirString("Ingrese el dios al que le reza el clerigo");
		
		// Pasamos los datos al clerigo
		clerigo = new Clerigo(nombre, raza, fuerza, inteligencia, vidaMax, dios);

		// Imprimimos los datos de los personajes
		magos[0].imprimirDatos();
		magos[1].imprimirDatos();
		clerigo.imprimirDatos();
		
		// El mago 1 aprende 2 hechizos
		magos[0].aprenderHechizo("Hielo");
		magos[0].aprenderHechizo("Fuego");
		Mensajes.Aviso("El mago 1 aprende 2 hechizos");
		
		// El mago 2 aprende 1 hechizo
		magos[1].aprenderHechizo("Veneno");
		Mensajes.Aviso("El mago 2 aprende 1 hechizo");
		
		// Imprimimos los datos de los magos
		magos[0].imprimirDatos();
		magos[1].imprimirDatos();
		
		// El mago 1 lanza un hechizo sobre el mago 2
		magos[0].usarHechizo(magos[1]);
		Mensajes.Aviso("El mago 1 lanza un hechizo sobre el mago 2");
		
		// El mago 2 lanza un hechizo sobre el mago 1
		magos[1].usarHechizo(magos[0]);
		Mensajes.Aviso("El mago 2 lanza un hechizo sobre el mago 1");

		// El clerigo cura al mago 2
		clerigo.usarHechizo(magos[1]);
		Mensajes.Aviso("El clerigo cura al mago 2");
		
		// El mago 1 lanza un hechizo sobre el mago 2
		magos[0].usarHechizo(magos[1]);
		Mensajes.Aviso("El mago 1 lanza un hechizo sobre el mago 2");
		
		// Imprimir los datos de los tres personajes
		magos[0].imprimirDatos();
		magos[1].imprimirDatos();
		clerigo.imprimirDatos();	
		
 	}
}


 