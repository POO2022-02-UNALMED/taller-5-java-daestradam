package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	private ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Pez> listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		
	}
	
	public Pez() {
		
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
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
	
	public cantidadPeces() {
		
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public crearSalmon() {
		
	}
	
	public crearBacalao() {
		
	}
}
