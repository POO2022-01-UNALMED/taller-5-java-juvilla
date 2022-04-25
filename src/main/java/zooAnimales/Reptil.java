package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	private Reptil [] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public void setcolorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getcolorEscamas() {
		return colorEscamas;
	}
	public void setlargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	public int getlargoCola() {
		return largoCola;
	}
public Reptil (String nombre,int edad,String habitad,String genero,Zona zona,String colorEscamas,int largoCola) {
	super.setnombre(nombre);
	super.setedad(edad);
	super.sethabitad(habitad);
	super.setgenero(genero);
	super.setzona(zona);
	this.setcolorEscamas(colorEscamas);
	this.setlargoCola(largoCola);
	}
public Reptil () {
	
}
public String movimiento() {
	return "reptar";
}
}

