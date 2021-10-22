/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsupermercado;
import clases.*;
/**
 *
 * @author Trabajo y Duoc
 */
public class AplicacionSupermercado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear objetos
        Carne carne1 = new Carne(10, "Vetado", 7000, 'A', 20);
        FrutaVerdura fruta1 = new FrutaVerdura(160, "manzana", 2000, "verde");
        //obtener total
        System.out.println("Total: $" + carne1.calcularTotalPago());
        //mostrar atributos
        System.out.println("-----------------");
        System.out.println(carne1.toString());
        System.out.println("/////////////////");
        System.out.println(fruta1.toString());
        System.out.println("------------AGREGADO PRODUCTOS A CARRITO------------");
        CarritoCompra carrito1 = new CarritoCompra();
        carrito1.agregarProducto(carne1);
        carrito1.agregarProducto(fruta1);
        System.out.println("----------------------Listado Objetos Creados---------------------------------");
        carrito1.listarProductos();
        carrito1.precioTotalCompra();
        System.out.println("--------------Listar denuevo productos-----------------");
        carrito1.eliminarProducto(fruta1);
        carrito1.listarProductos();
    }
}
