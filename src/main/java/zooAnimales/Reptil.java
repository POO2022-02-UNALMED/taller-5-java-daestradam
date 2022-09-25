package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		
	}
	
	public Reptil() {
		
	}

	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public cantidadReptiles() {
		
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public crearIguana() {
		
	}
	
	public crearSerpiente() {
		
	}
}
