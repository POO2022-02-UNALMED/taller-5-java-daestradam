package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	public Anfibio() {
		
	}
	
	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		listado.add(new Anfibio(nombre, edad, "selva", genero, "rojo", true));
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		listado.add(new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false));
		salamandras++;
	}
}
