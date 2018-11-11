package es.indra.carrito.beans;

public abstract class Producto {
	protected String nombre;
	protected String descripcion;
	protected double precio;
	protected int stock;
	
	public abstract void disminuirStock(int i);
	public abstract void aumentarStock(int i);
	public abstract String getNombre();
	public abstract String getDescripcion();
	public abstract double getPrecio();
	public abstract int getStock();
	
}
