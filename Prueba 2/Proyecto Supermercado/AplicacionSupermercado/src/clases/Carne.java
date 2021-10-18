package clases;

public class Carne extends Producto {

	private char categoria;
	private double descuentoCategoria;

	public Carne(int cantidad, String nombre, int precioUnitario, char categoria, double descuentoCategoria) {
		super(cantidad, nombre, precioUnitario);
		this.categoria = categoria;
		this.descuentoCategoria = descuentoCategoria;
	}

	public Carne() {
		super();
		this.categoria = ' ';
		this.descuentoCategoria = 0.0;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		
		if(categoria == 'A' || categoria == 'B' || categoria == 'C') {
			this.categoria = categoria;
		}
	}

	public double getDescuentoCategoria() {
		return descuentoCategoria;
	}

	public void setDescuentoCategoria(double descuentoCategoria) {
		
		if(descuentoCategoria > 0) {
			
			this.descuentoCategoria = descuentoCategoria;
		}
	}

	@Override
	public int calcularMontoIva() {
		return (int)(this.getPrecioUnitario()*this.getCantidad()*descuentoCategoria*IVA);
	}

	@Override
	public int calcularMontoNeto() {
		return (int)(this.getPrecioUnitario()*this.getCantidad()*descuentoCategoria);
	}

	@Override
	public int calcularTotalPago() {
		return this.calcularMontoNeto() + this.calcularMontoIva();
	}

}
