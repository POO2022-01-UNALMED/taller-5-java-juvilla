package zooAnimales;

import gestion.*;
import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
public void setColorPiel(String colorPiel) {
	this.colorPiel=colorPiel;
}
public String getColorPiel() {
	return colorPiel;
}
public void setVenenoso(boolean venenoso) {
	this.venenoso=venenoso;
}
public boolean isVenenoso() {
	return venenoso;
}
public Anfibio (String nombre,int edad,String habitad,String genero,String colorPiel,boolean venenoso) {
	super(nombre,edad,habitad,genero);
	this.colorPiel=colorPiel;
	this.venenoso=venenoso;
	listado.add(this);
	}
public Anfibio() {
}
public Anfibio crearRana(String nombre,int edad,String genero) {
	Anfibio A=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	ranas++;
	return A;
}
public Anfibio crearSalamandra(String nombre,int edad,String habitad,String genero) {
	Anfibio A=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	salamandras++;
	return A;
}
public String movimiento() {
	return "saltar";
}
public static int cantidadAnfibios() {
	return listado.size();
}
}
