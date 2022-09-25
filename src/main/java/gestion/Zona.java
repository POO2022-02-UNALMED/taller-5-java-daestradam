package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo;
	private ArrayList<Animal> animales;

	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo.add(zoo);
	}
	
	public Zona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo.get(0);
	}

	public void setZoo(Zoologico zoo) {
		this.zoo.add(zoo);
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
}
