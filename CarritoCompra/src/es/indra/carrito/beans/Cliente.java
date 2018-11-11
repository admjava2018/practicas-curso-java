package es.indra.carrito.beans;

public final class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private String tlf;
	
	public Cliente(){
		
	}
	
	public Cliente(String nombre,String apellido,String direccion,String tlf){
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.tlf = tlf;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String comprar(Producto p,int i){
		if(p instanceof ProductoAlimentacion){
			p.disminuirStock(i);
			return this.getNombre() + " ha comprado " + i + " unidades de " + p.getNombre();
		}else if(p instanceof ProductoLimpieza){
			p.disminuirStock(i);
			return this.getNombre() + " ha comprado " + i + " unidades de " + p.getNombre();
		}else if(p instanceof ProductoPerfumeria){
			p.disminuirStock(i);
			return this.getNombre() + " ha comprado " + i + " unidades de " + p.getNombre();
		}else{
			return "No es un producto correcto";
		}
	}
}
