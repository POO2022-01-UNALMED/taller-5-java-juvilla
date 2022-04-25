package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero [] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
public Mamifero (String nombre,int edad,String habitad,String genero,Zona zona,boolean pelaje,int patas) {
	super.setnombre(nombre);
	super.setedad(edad);
	super.sethabitad(habitad);
	super.setgenero(genero);
	super.setzona(zona);
	this.setpatas(patas);
	this.setpelaje(pelaje);
	}
public Mamifero () {	
}
public Mamifero crearCaballo(String nombre,int edad,String genero,Zona zona) {
	Mamifero A=new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
	caballos ++;
	return A;
}
public Mamifero crearLeon(String nombre,int edad,String genero,Zona zona) {
	Mamifero A=new Mamifero(nombre,edad,"selva",genero,zona,true,4);
	leones ++;
	return A;
}
public int cantidadMamiferos() {
	return listado.length;
}
public void setpatas(int patas) {
	this.patas=patas;
}
public int getpatas() {
	return patas;
}
public void setpelaje(boolean pelaje) {
	this.pelaje=pelaje;
}
public boolean getpelaje() {
	return pelaje;
}
}
