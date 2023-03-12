package Conversores;

public class EquivalenciaMetros extends MonedaUnidades{

	private double valorEquivDe;
	private double valorEquivA;
	private double EquiMetroDe;
	private double EquiMetroA;
	private double valorConvertido;
	
	public EquivalenciaMetros(String demoneda, String amoneda, double valor) {
		super(demoneda, amoneda, valor);
		// TODO Auto-generated constructor stub
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

	public double getEquiMetroDe() {
		return EquiMetroDe;
	}

	public void setEquiMetroDe(double equiMetroDe) {
		EquiMetroDe = equiMetroDe;
	}

	public double getEquiMetroA() {
		return EquiMetroA;
	}

	public void setEquiMetroA(double equiMetroA) {
		EquiMetroA = equiMetroA;
	}

	public double getValorConvertido() {
		return valorConvertido;
	}

	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	
	private void hacerEquivalenciasDivisaDe()  {

		switch (super.getDeMoneda()) {
		case "Nanometro":
			EquiMetroDe = 0.00000001;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Micrometro(um)":
			EquiMetroDe = 0.000001;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Milimetro":
			EquiMetroDe = 0.001;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Centimetro(cm)":
			EquiMetroDe = 0.01;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Metro":
			EquiMetroDe = 1;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Kilometro(km)":
			EquiMetroDe = 1000;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
		
		case "Milla(mi)":
			EquiMetroDe = 1609.344;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Yarda(yd)":
			EquiMetroDe = 0.9144;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		case "Pie":
			EquiMetroDe = 0.3048;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
		
		case "Pulgada":
			EquiMetroDe = 0.9144;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
		
		case "Milla Nautica":
			EquiMetroDe = 1852;
			valorEquivDe = super.getValor() * EquiMetroDe;
			break;
			
		default:
			break;
		}

	setValorEquivDe(Math.round(valorEquivDe));
	RealizarConvesion();
}

private void RealizarConvesion() {
	
	switch (super.getAMoneda()) {
	case "Nanometro":
		EquiMetroA = 0.00000001;
		valorEquivA = getValorEquivDe() / EquiMetroA;
		break;

	case "Micrometro(um)":
		EquiMetroA = 0.000001;
		valorEquivA = getValorEquivDe() / EquiMetroA;
		break;
		
	case "Milimetro":
		EquiMetroA = 0.001;
		valorEquivA = getValorEquivDe() /EquiMetroA;
		break;
		
	case "Centimetro(cm)":
		EquiMetroA = 0.01;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
		
	case "Metro":
		EquiMetroA = 1;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
		
	case "Kilometro(km)":
		EquiMetroA = 1000;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
	
	case "Milla(mi)":
		EquiMetroA = 1609.344;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
		
	case "Yarda(yd)":
		EquiMetroA = 0.9144;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
		
	case "Pie":
		EquiMetroA = 0.3048;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
	
	case "Pulgada":
		EquiMetroA = 0.9144;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
	
	case "Milla Nautica":
		EquiMetroA = 1852;
		valorEquivA = getValorEquivDe() / EquiMetroA;;
		break;
		
	default:
		break;
	}
	
	setValorConvertido(Math.round(valorEquivA));

}
	
	
	
}
