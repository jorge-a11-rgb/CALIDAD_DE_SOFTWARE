package cl.prueba2.poo;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private List<Producto> productos;

	public CarritoCompra(List<Producto> productos) {
		this.productos = productos;
	}
	
	public CarritoCompra() {
		this.productos = new ArrayList<>();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public int precioTotalCompra() {
		
		int precioTotal = 0;
		
		for(Producto producto : productos) {
			
			precioTotal = precioTotal + producto.calcularTotalPago();
		}
		
		return precioTotal;
	}
	
	public void agregarProducto(Producto producto) {
		
		if(!this.productos.contains(producto)) {
			
			this.productos.add(producto);
		}
	}
	
	public void eliminarProducto(Producto producto) {
		
		this.productos.remove(producto);
	}
	
	public void listarProductos() {
		
		for(Producto producto : this.productos) {
			
			System.out.println(producto);
		}
	}
}
