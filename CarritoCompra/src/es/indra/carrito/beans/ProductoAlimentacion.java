package es.indra.carrito.beans;

import java.util.List;
import java.util.ArrayList;

public class ProductoAlimentacion extends Producto {
	
	public List<ProductoAlimentacion> stockPA = new ArrayList<>();
	
	public ProductoAlimentacion(){
		
	}
	
	public ProductoAlimentacion(String nombre, String descripcion, double precio, int stock ){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public int getStock(){
		return this.stock;
	}
	
	public void disminuirStock(int i){
		this.stock -= i;
	}
	
	public void aumentarStock(int i){
		this.stock += i;
	}
	
	public void introducirAlimento(ProductoAlimentacion p){
		stockPA.add(p);
	}
	
	public void mostrarStockAlimentacion(){
		for(ProductoAlimentacion s:stockPA){
			System.out.println(s.getNombre() + " " + s.getStock());
		}
	}
}
