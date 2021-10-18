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
    }
    
}
