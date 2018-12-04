package com.itt.libreria;

//Agregación
public class Libro {
 //declaramos atributos
	private String titulo;
	private String genero;
	private Autor autor; //componente objeto Autor
	//constructor vacío
	public Libro() {
		
	}
	//constructor parametrizado
	public Libro(String titulo, String genero, Autor autor) {
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		
	}
//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro título: " + titulo + ", Género: " + genero + ", Autor-"+ autor;
	}
	
	
}
