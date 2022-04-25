package gestion;
import java.util.ArrayList;
import java.util.List;

import zooAnimales.*;
public class Zona {
	private String nombre;
	private  Zoologico zoo;
	private static ArrayList<Animal> animales = new ArrayList<Animal>();
	public Zona(String nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	public Zona() {
	}
	public void agregarAnimales(Animal animal){ 
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();/*retorna la cantidad de animales en la zona*/
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public List<Animal> getAnimales(){
		return animales;
	}
	}