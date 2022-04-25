package gestion;
import zooAnimales.*;
public class Zona {
	private String nombre;
	private  Zoologico zoo;
	private Animal [] animales;
	public Zona(String nombre,Zoologico zoo,Animal [] animales) {
		this.nombre=nombre;
		this.zoo=zoo;
		this.animales=animales;
		
	}
	public Zona() {
	}
	public void agregarAnimales(Animal animal){ 
		/*añade un nuevo animal al listado animales*/
		
	}
	public int cantidadAnimales() {
		return animales.length;/*retorna la cantidad de animales en la zona*/
		
	}
	}