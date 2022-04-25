package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.*;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
public Pez (String nombre,int edad,String habitad,String genero,
		String colorEscamas,int cantidadAletas) {
	super(nombre,edad,habitad,genero);
	this.colorEscamas=colorEscamas;
	this.cantidadAletas=cantidadAletas;
	listado.add(this);
	}
public Pez() {
	
}

public String movimiento() {
	return "nadar";
}
public Pez crearSalmon(String nombre,int edad,String genero ) {
	Pez A=new Pez(nombre,edad,"oceano",genero,"rojo",6);
	salmones++;
	return A;
}
public Pez crearBacalao(String nombre,int edad,String genero ) {
	Pez A=new Pez(nombre,edad,"oceano",genero,"gris",6);
	bacalaos++;
	return A;
}
public static int cantidadPeces() {
	return listado.size();
}
public void setCantidadAletas(int cantidadAletas) {
	this.cantidadAletas=cantidadAletas;
}
public int getCantidadAletas() {
	return cantidadAletas;
}
public void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public String getColorEscamas() {
	return colorEscamas;
}
}
