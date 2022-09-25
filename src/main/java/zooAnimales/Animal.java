package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
		
	}
	
	public Animal() {
		totalAnimales++;
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos: " + Mamifero);
		System.out.println("Aves: " + Ave);
		System.out.println("Reptiles: " + Reptil);
		System.out.println("Peces: " + Pez);
		System.out.println("Anfibios: " + Anfibio);
	}

	public String toString() {
		if(zona.isEmpty()) {
			return "Mi nombre es #nombre, tengo una edad de #edad, habito en #habitat y mi genero es #genero";
		}
		else {
			return "Mi nombre es #nombre, tengo una edad de #edad, habito en #habitat y mi genero es #genero, la zona en la que me ubico es #zona, en el #zoo";
		}
	}
	
	
}
