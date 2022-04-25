package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private Ave [] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public void setcolorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	public String getcolorPlumas() {
		return colorPlumas;
	}
    public Ave (String nombre,int edad,String habitad,String genero,Zona zona,String colorPlumas) {
    	super.setnombre(nombre);
    	super.setedad(edad);
    	super.sethabitad(habitad);
    	super.setgenero(genero);
    	super.setzona(zona);
    	this.setcolorPlumas(colorPlumas);
	}
    public Ave() {
    }
    public String movimiento() {
		return "volar";
	}
 public Ave crearHalcon(String nombre,int edad,String genero,Zona zona) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
	 halcones++;
	 return A;
	 }
 public Ave crearAguila(String nombre,int edad,String genero,Zona zona) {
	 Ave A=new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
	 aguilas++;
	 return A;
	 }
 public int cantidadAves() {
	 return listado.length;
 }
}
