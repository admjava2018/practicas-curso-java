package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductoLimpieza extends Producto{
	
	public List<ProductoLimpieza> stockPL = new ArrayList<>();
	
	public ProductoLimpieza(){
		
	}
	
	public ProductoLimpieza(String nombre, String descripcion, double precio, int stock ){
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
	
	public void introducirLimpieza(ProductoLimpieza p){
		stockPL.add(p);
	}
	
	public void mostrarStockLimpieza(){
		for(ProductoLimpieza s:stockPL){
			System.out.println(s.getNombre() + " " + s.getStock());
		}
	}
	
}
