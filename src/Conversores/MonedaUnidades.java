package Conversores;

public class MonedaUnidades {
	private String deMoneda;
	private String aMoneda;
	private double valor;


	public MonedaUnidades(String demoneda, String amoneda, double valor)
	{
		this.deMoneda = demoneda;
		this.aMoneda = amoneda;
		this.valor = valor;
	}
	
	public String getDeMoneda() {
		return deMoneda;
	}

	public String getAMoneda() {
		return aMoneda;
	}

	public String getConversor() {
		 return aMoneda;
	}

	public double getValor() {
		return valor;
	}
	

}
