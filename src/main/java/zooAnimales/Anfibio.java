package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	private Anfibio [] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
public void setcolorPiel(String colorPiel) {
	this.colorPiel=colorPiel;
}
public String getcolorPiel() {
	return colorPiel;
}
public void setvenenoso(boolean venenoso) {
	this.venenoso=venenoso;
}
public Anfibio (String nombre,int edad,String habitad,String genero,Zona zona,String colorPiel,boolean venenoso) {
	super.setnombre(nombre);
	super.setedad(edad);
	super.sethabitad(habitad);
	super.setgenero(genero);
	super.setzona(zona);
	
	}
public Anfibio() {
	
}
public String movimiento() {
	return "saltar";
}

}
