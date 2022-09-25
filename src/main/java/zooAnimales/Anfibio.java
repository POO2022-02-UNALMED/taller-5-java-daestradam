package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		
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
	
	public cantidadAnfibios() {
		
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public crearRana() {
		
	}
	
	public crearSalamandra() {
		
	}
}
