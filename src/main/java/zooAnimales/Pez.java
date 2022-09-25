package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	
	public Pez() {
		
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static void crearSalmon(String nombre, int edad, String genero) {
		listado.add(new Pez(nombre, edad, "oceano", genero, "rojo", 6));
		salmones++;
	}
	
	public static void crearBacalao(String nombre, int edad, String genero) {
		listado.add(new Pez(nombre, edad, "oceano", genero, "gris", 6));
		bacalaos++;
	}
}
