package Conversores;

import javax.swing.JOptionPane;

public class SeleccionConversor {
	private String conversor;
	private int codConv;

	public SeleccionConversor(String conversor) {
		this.conversor = conversor;
		conversor();
	}

	public String getConversor() {
		return conversor;
	}
	
	public int getCodConv() {
		return codConv;
	}

	public void setCodConv(int codConv) {
		this.codConv = codConv;
	}

	private void conversor() {
		switch (this.getConversor()) {
		case "Conversor de Monedas":
			setCodConv(1);
			break;

		case "Conversor de unidades Longitud":
			setCodConv(2);
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"Por favor, selecciona una opción");
			break;
		}
	}
}
