package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
	public Mamifero() {
		
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		listado.add(new Mamifero(nombre, edad, "pradera", genero, true, 4));
		caballos++;
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		listado.add(new Mamifero(nombre, edad, "selva", genero, true, 4));
		leones++;
	}
}