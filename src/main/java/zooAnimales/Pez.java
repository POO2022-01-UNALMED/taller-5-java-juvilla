package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private Pez [] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
public Pez (String nombre,int edad,String habitad,String genero,Zona zona,
		String colorEscamas,int cantidadAletas) {
	super.setnombre(nombre);
	super.setedad(edad);
	super.sethabitad(habitad);
	super.setgenero(genero);
	super.setzona(zona);
	}
public Pez() {
	
}
public String movimiento() {
	return "nadar";
}
}
