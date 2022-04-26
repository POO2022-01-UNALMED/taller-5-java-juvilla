package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;
public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
public Mamifero (String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
	super(nombre,edad,habitat,genero);
	this.patas=patas;
	this.pelaje=pelaje;
	listado.add(this);
	}
public Mamifero () {
	listado.add(this);
}
public static Mamifero crearCaballo(String nombre,int edad,String genero) {
	Mamifero A=new Mamifero(nombre,edad,"pradera",genero,true,4);
	caballos ++;
	return A;
}
public static Mamifero crearLeon(String nombre,int edad,String genero) {
	Mamifero A=new Mamifero(nombre,edad,"selva",genero,true,4);
	leones ++;
	return A;
}
public static int cantidadMamiferos() {
	return listado.size();
}
public void setPatas(int patas) {
	this.patas=patas;
}
public int getPatas() {
	return patas;
}
public void setPelaje(boolean pelaje) {
	this.pelaje=pelaje;
}
public boolean isPelaje() {
	return pelaje;
}
}
