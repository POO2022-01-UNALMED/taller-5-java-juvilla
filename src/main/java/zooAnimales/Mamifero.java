package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.*;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
public Mamifero (String nombre,int edad,String habitad,String genero,boolean pelaje,int patas) {
	super(nombre,edad,habitad,genero);
	this.patas=patas;
	this.pelaje=pelaje;
	listado.add(this);
	}
public Mamifero () {	
}
public Mamifero crearCaballo(String nombre,int edad,String genero) {
	Mamifero A=new Mamifero(nombre,edad,"pradera",genero,true,4);
	caballos ++;
	return A;
}
public Mamifero crearLeon(String nombre,int edad,String genero) {
	Mamifero A=new Mamifero(nombre,edad,"selva",genero,true,4);
	leones ++;
	return A;
}
public static int cantidadMamiferos() {
	return listado.size();
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
