package com.itt.libreria;

public class Autor {
//Declaramos atributos
	private String nombre;
	private String biografia;
	//Constructor vacío
	public Autor() {
		
	}
	//Constructor parametrizado
	public Autor(String nombre, String biografia) {
		
		this.nombre = nombre;
		this.biografia = biografia;
	}
    //Generamos métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Biografia: " + biografia;
	}
	
	
}
