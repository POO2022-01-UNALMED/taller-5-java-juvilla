package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.*;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	public int getLargoCola() {
		return largoCola;
	}
public Reptil (String nombre,int edad,String habitad,String genero,String colorEscamas,int largoCola) {
	super(nombre,edad,habitad,genero);
	this.colorEscamas=colorEscamas;
	this.largoCola=largoCola;
	listado.add(this);
	}
public static Reptil crearIguana(String nombre,int edad,String genero ) {
	Reptil A=new Reptil(nombre,edad,"humedal",genero,"verde",3);
	iguanas ++;
	return A;
}
public static Reptil crearSerpiente(String nombre,int edad,String genero ) {
	Reptil A=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
	serpientes ++;
	return A;
}
public static int cantidadReptiles() {
	return listado.size();
}
public String movimiento() {
	return "reptar";
}
}

