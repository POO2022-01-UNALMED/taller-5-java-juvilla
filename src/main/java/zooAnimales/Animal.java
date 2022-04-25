package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad=habitad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona=zona;
	}
	public Animal (String nombre,int edad,String habitad,String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitad=habitad;
		this.genero=genero;
		totalAnimales++;
	}
	public Animal() {
		
	}
	public String toString() {
		if(zona==null){
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+ 
					genero;
		}
		else{
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+ 
				genero+", la zona en la que me ubico es "+zona;}
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String totalPorTipo() {return "Mamieros: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();}
}

