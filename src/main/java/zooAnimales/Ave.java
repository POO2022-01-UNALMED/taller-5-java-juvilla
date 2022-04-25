package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.*;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public void setcolorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	public String getcolorPlumas() {
		return colorPlumas;
	}
    public Ave (String nombre,int edad,String habitad,String genero,String colorPlumas) {
    	super(nombre,edad,habitad,genero);
    	this.setcolorPlumas(colorPlumas);
    	listado.add(this);
	}
    public Ave() {
    }
    public String movimiento() {
		return "volar";
	}
 public Ave crearHalcon(String nombre,int edad,String genero) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	 halcones++;
	 return A;
	 }
 public Ave crearAguila(String nombre,int edad,String genero) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	 aguilas++;
	 return A;
	 }
 public static int cantidadAves() {
	 return listado.size();
 }
}
