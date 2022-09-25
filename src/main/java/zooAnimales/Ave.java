package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas=colorPlumas;
	}
	
	public Ave() {
		
	}

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		listado.add(new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		listado.add(new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		aguilas++;
	}
}
