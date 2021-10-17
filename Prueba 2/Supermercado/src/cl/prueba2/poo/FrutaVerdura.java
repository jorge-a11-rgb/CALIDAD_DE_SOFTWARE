package cl.prueba2.poo;

public class FrutaVerdura extends Producto {
	
	private String tipo;

	public FrutaVerdura(int cantidad, String nombre, int precioUnitario, String tipo) {
		super(cantidad, nombre, precioUnitario);
		this.tipo = tipo;
	}
	
	public FrutaVerdura() {
		super();
		this.tipo = "";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "FrutaVerdura [tipo=" + tipo + "]";
	}

	@Override
	public int calcularMontoIva() {
		return (int)(this.getPrecioUnitario()*this.getCantidad()*0.19);
	}

	@Override
	public int calcularMontoNeto() {
		return (int)(this.getPrecioUnitario()*this.getCantidad());
	}

	@Override
	public int calcularTotalPago() {
		return this.calcularMontoNeto() + this.calcularMontoIva();
	}
}
