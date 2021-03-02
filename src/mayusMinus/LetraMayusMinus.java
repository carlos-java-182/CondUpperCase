package mayusMinus;

import javax.swing.JOptionPane;

public class LetraMayusMinus {

	public static void main(String[] args) {
		
		char letra;

		letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showConfirmDialog(null, "La letra "+letra+" es Mayúscula");
		}
		else {
			JOptionPane.showConfirmDialog(null, "La letra "+letra+" es minúscula");
		}
		
	}

}
