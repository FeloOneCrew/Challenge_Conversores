package Conversores;

import java.text.DecimalFormat;

public class EquivalenciaDolar extends MonedaUnidades {
	private double valorEquivDe;
	private double valorEquivA;
	private double EquiDolarDe;
	private double EquiDolarA;
	private double valorConvertido;
	private String imagenMoneda;
	private boolean EstadoImagen;

	public EquivalenciaDolar(String demoneda, String amoneda, double valor) {
		super(demoneda, amoneda, valor);
		hacerEquivalenciasDivisaDe();
	}
	
	public double getValorEquivDe() {
		return valorEquivDe;
	}

	public void setValorEquivDe(double valorEquivDe) {
		this.valorEquivDe = valorEquivDe;
	}

	public double getValorEquivA() {
		return valorEquivA;
	}

	public void setValorEquivA(double valorEquivA) {
		this.valorEquivA = valorEquivA;
	}

	public double getEquiDolarDe() {
		return EquiDolarDe;
	}

	public double getEquiDolarA() {
		return EquiDolarA;
	}

	public double getValorConvertido() {
		return valorConvertido;
	}

	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	
	public String getImagenMoneda() {
		return imagenMoneda;
	}

	public void setImagenMoneda(String imagenMoneda) {
		this.imagenMoneda = imagenMoneda;
	}

	public boolean isEstadoImagen() {
		return EstadoImagen;
	}

	public void setEstadoImagen(boolean estadoImagen) {
		EstadoImagen = estadoImagen;
	}

	private void hacerEquivalenciasDivisaDe()  {

			switch (super.getDeMoneda()) {
			case "Peso Colombiano":
				EquiDolarDe = 4713.69;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
	
			case "Dolar":
				EquiDolarDe = 1.00;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
			case "Euros":
				EquiDolarDe = 0.95;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
			case "Libra Esterlina (GBP)":
				EquiDolarDe = 0.85;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
			case "Yen Japones":
				EquiDolarDe = 132.96;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
			case "Won (KRW)":
				EquiDolarDe = 1316.60;
				valorEquivDe = super.getValor() / EquiDolarDe;
				break;
			default:
				break;
			}

		setValorEquivDe(Math.round(valorEquivDe));
		RealizarConvesion();
	}
	
	private void RealizarConvesion() {
		
		switch (super.getAMoneda()) {
		case "Peso Colombiano":
			EquiDolarA = 4713.69;
			valorEquivA = getValorEquivDe() * EquiDolarA;
			setImagenMoneda("peso-colombiano.png");
			break;

		case "Dolar":
			EquiDolarA = 1.00;
			valorEquivA = getValorEquivDe() * EquiDolarA;
			setImagenMoneda("dolar.png");
			break;
		case "Euros":
			EquiDolarA = 0.95;
			valorEquivA = getValorEquivDe() * EquiDolarA;
			setImagenMoneda("euro.png");
			break;
		case "Libra Esterlina (GBP)":
			EquiDolarA = 0.85;
			valorEquivA = getValorEquivDe() * EquiDolarA;
			setImagenMoneda("libra-esterlina.png");
			break;
		case "Yen Japones":
			EquiDolarA = 132.96;
			valorEquivA = getValorEquivDe() * EquiDolarA;
			setImagenMoneda("yen.png");
			break;
		case "Won (KRW)":
			EquiDolarA = 1316.60;
			valorEquivA =getValorEquivDe() * EquiDolarA;
			setImagenMoneda("won.png");
			break;
		default:
			break;
		}
		setValorConvertido(Math.round(valorEquivA));
		setEstadoImagen(true);
	}
}
