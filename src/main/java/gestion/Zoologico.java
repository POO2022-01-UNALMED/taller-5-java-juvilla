package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona [] zonas;
	public Zoologico(String nombre,String ubicacion,Zona zonas){	
	}
	public Zoologico() {	
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public String getubicacion() {
		return ubicacion;
	}
	public void setubicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public void agregarZonas(Zona zonas) { /*agrega nuevas zonas al zoologico*/ 
		this.zonas=this.zonas.unshift(zonas);
	}
	public int cantidadTotalAnimales() { /*retorna la cantidad total de animales en todas las zonas que tengan que ver con el zoologico*/
		
		}
	}
	
	
}
