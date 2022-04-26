package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;
public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
    public Ave (String nombre,int edad,String habitat,String genero,String colorPlumas) {
    	super(nombre,edad,habitat,genero);
    	this.colorPlumas=colorPlumas;
    	listado.add(this);
	}
    public Ave() {
    	listado.add(this);
    }
    public String movimiento() {
		return "volar";
	}
 public static Ave crearHalcon(String nombre,int edad,String genero) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	 halcones++;
	 return A;
	 }
 public static Ave crearAguila(String nombre,int edad,String genero) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	 aguilas++;
	 return A;
	 }
 public static int cantidadAves() {
	 return listado.size();
 }
}
