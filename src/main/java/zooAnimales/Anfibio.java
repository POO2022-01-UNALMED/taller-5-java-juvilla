package zooAnimales;

import gestion.*;
import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<>();
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
