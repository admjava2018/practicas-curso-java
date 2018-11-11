package es.indra.carrito.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.indra.carrito.beans.Cliente;
import es.indra.carrito.beans.ProductoAlimentacion;
import es.indra.carrito.beans.ProductoLimpieza;
import es.indra.carrito.beans.ProductoPerfumeria;

public class AplicacionCarrito {
	List<String> historial = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProductoAlimentacion a = new ProductoAlimentacion("Zanahoria","Hortaliza",0.2,300);
		ProductoLimpieza l = new ProductoLimpieza("Lejía","Químico",2,30);
		ProductoPerfumeria p = new ProductoPerfumeria("Axe","Desodorante",1.2,50);
		ProductoPerfumeria p1 = new ProductoPerfumeria("Rexona","Desodorante",1.2,50);
		ProductoLimpieza l1 = new ProductoLimpieza("Limpia Cristales","Químico",2,30);
		ProductoAlimentacion a1 = new ProductoAlimentacion("Tomate","Hortaliza",0.2,300);
		AplicacionCarrito app = new AplicacionCarrito();
		
		//app.historial(c.comprar(a,3));
		//app.historial(c.comprar(l,9));
		//app.mostrarHistorial();
		
		System.out.println("\t<Identificación>");
		System.out.print("\tNombre:");
		String nombre = scan.nextLine();
		System.out.print("\tApellido:");
		String apellido = scan.nextLine();
		System.out.print("\tDirección:");
		String direccion = scan.nextLine();
		System.out.print("\tTeléfono:");
		String tlf = scan.nextLine();
		
		Cliente c = new Cliente(nombre,apellido,direccion,tlf);
		
		do{
			System.out.println("\t<MENU>");
			System.out.println("\t1.-Comprar.");
			System.out.println("\t2.-Historial.");
			System.out.println("\t3.-Ver stock.");
			System.out.println("\t4.-Aumentar sotck.");
			System.out.println("\t5.-Disminuir stock.");
			System.out.println("\t6.-Salir.");
			int opcion = scan.nextInt();
			
			switch(opcion){
				case 1:
					app.historial(c.comprar(a,3));
					app.historial(c.comprar(a1,3));
					app.historial(c.comprar(l,3));
					app.historial(c.comprar(l1,3));
					app.historial(c.comprar(p,1));
					app.historial(c.comprar(p1,3));
					
					a.introducirAlimento(a);
					a1.introducirAlimento(a1);
					l.introducirLimpieza(l);
					l1.introducirLimpieza(l1);
					p.introducirPerfume(p);
					p1.introducirPerfume(p1);
					break;
		
				case 2:
					app.mostrarHistorial();
					break;
				
				case 3:
					System.out.println("\t<Stock de alimentación>");
					a.mostrarStockAlimentacion();
					a1.mostrarStockAlimentacion();
					System.out.println("\t<Stock de perfumería>");
					p.mostrarStockPerfumeria();
					p1.mostrarStockPerfumeria();
					System.out.println("\t<Stock de limpieza>");
					l.mostrarStockLimpieza();
					l1.mostrarStockLimpieza();
					break;
				
				case 4:
					break;
			
				case 5:
					break;
				
				case 6:
					System.out.println("Saliendo...");
					break;
			}
		}while(6==6);
			
	}
	
	public void historial(String s){
		String h = "11/11/2018;" + s;
		historial.add(h);
	}
	
	public void mostrarHistorial(){
		for(String s:historial){
			System.out.println(s);
		}
	}
	
}
