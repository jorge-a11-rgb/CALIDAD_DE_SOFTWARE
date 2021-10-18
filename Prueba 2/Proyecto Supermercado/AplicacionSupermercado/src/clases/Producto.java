package clases;

public abstract class Producto implements IMontos {

	private int cantidad;
	private String nombre;
	private int precioUnitario;

	public Producto(int cantidad, String nombre, int precioUnitario) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
	}

	public Producto() {
		this.cantidad = 0;
		this.nombre = "";
		this.precioUnitario = 0;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {

		if (cantidad > 0) {
			this.cantidad = cantidad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		if (precioUnitario > 0) {
			this.precioUnitario = precioUnitario;
		}
	}

	@Override
	public String toString() {
		return "Producto [cantidad=" + cantidad + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
