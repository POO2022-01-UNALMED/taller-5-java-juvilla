package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public int getedad() {
		return edad;
	}
	public void setedad(int edad) {
		this.edad=edad;
	}
	public String gethabitad() {
		return habitad;
	}
	public void sethabitad(String habitad) {
		this.habitad=habitad;
	}
	public String getgenero() {
		return genero;
	}
	public void setgenero(String genero) {
		this.genero=genero;
	}
	public Zona getzona() {
		return zona;
	}
	public void setzona(Zona zona) {
		this.zona=zona;
	}
	public Animal (String nombre,int edad,String habitad,String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitad=habitad;
		this.genero=genero;
	}
	public Animal() {
		
	}
	public String toString() {
		if(zona==null){
			return "Mi nombre es "+nombre+" tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+ 
					genero;
		}
		else{
		return "Mi nombre es "+nombre+" tengo una edad de "+edad+", habito en "+habitad+" y mi genero es "+ 
				genero+", la zona en la que me ubico es "+zona;}
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String totalPorTipo() {return "Mamieros: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " +         Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();}
}

