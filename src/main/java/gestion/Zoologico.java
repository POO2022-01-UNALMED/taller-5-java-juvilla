package gestion;
import java.util.ArrayList;
import java.util.List;

import zooAnimales.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	public Zoologico(String nombre,String ubicacion){
		this.nombre = nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void agregarZonas(Zona zona) { /*agrega nuevas zonas al zoologico*/ 
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int a = 0;
		for (int i=0;i<zonas.size();i++) {
			a=a+zonas.get(i).cantidadAnimales();
		}
		return a;
	}
	}
	
