package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.List;

public class ProductoPerfumeria extends Producto{
	
	public List<ProductoPerfumeria> stockPP = new ArrayList<>();
	
	public ProductoPerfumeria(){
		
	}
	
	public ProductoPerfumeria(String nombre, String descripcion, double precio, int stock ){
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
	
	public void introducirPerfume(ProductoPerfumeria p){
		stockPP.add(p);
	}
	
	public void mostrarStockPerfumeria(){
		for(ProductoPerfumeria s:stockPP){
			System.out.println(s.getNombre() + " " + s.getStock());
		}
	}
	
	
}
