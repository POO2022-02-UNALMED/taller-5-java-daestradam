package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();

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

	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
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
