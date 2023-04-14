package practica2;

import javax.swing.JOptionPane;

public class Mensajes extends JOptionPane {
	
	// Lista de razas para seleccionar
	private static final String[] RAZAS = { "Humano", "Elfo", "Enano", "Orco" };
	
	public static void Aviso(String mensaje) {
		showMessageDialog(null, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int pedirEntero(String mensaje) {
		return Integer.parseInt(showInputDialog(null, mensaje, "Entrada de datos", JOptionPane.QUESTION_MESSAGE));
	}
	
	public static String pedirString(String mensaje) {
		return showInputDialog(null, mensaje, "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
	}
	
	public static String pedirRaza(String mensaje) {
		return (String)showInputDialog(null, mensaje, "Entrada de datos", JOptionPane.QUESTION_MESSAGE, null, RAZAS, "Humano");
	}
}
