/*
 * Desarrollar una aplicacion que permita determinar el estado nutricional de una persona
 * de acuerdo con su Indice de Masa Corporal. El calculo del indice de masa corporal
 * se hace hace con la siguiente formula 
 * 
 * IMC = Peso (kg) / (Estatura(m) * Estatura (m)) 
 * */

package practica1;

import javax.swing.JOptionPane;

public class Practica1 {

	public static void main(String[] args) {
		
		// Declaracion y lectura de variables
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		char genero = JOptionPane.showInputDialog("Ingrese su genero (M/F)").charAt(0);
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso (kg)"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura (cm)"));
		
		// Pasamos la altura a metros para calcular el IMC
		double alturaMet = altura/100;
		
		// Calculamos el IMC con la formula
		double IMC = peso / (alturaMet * alturaMet);
		
		// El programa decide el estado nutricional del paciente segun su IMC
		String estado;
		if (IMC < 18.5) 
			estado = "Bajo Peso";
		else if (IMC >= 18.5 && IMC < 25) 
			estado = "Normal";
		else 
			estado = "Sobrepeso";
		
		// Imprimimos el informe
		JOptionPane.showMessageDialog(null, 
					"**************************************\n" +
					"Paciente: " + nombre + "\n" +
					"Edad del paciente: " + edad + " años\n" + 
					"Genero: " + genero + "\n" +
					"Peso: " + peso + " kg\n" + 
					"Altura: " + altura + "cm\n" +
					"IMC: " + IMC + " (kg/m2)\n" + 
					"Estado nutricional: " + estado + "\n" +
					"*************************************");
		
	}

}
