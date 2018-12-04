package main;
import com.itt.libreria.*; //importamos todas las clases del paquete
/**
 * 
 * @author JOSE CARLOS ARAQUE DELGADO
 *
 */
public class Principal {

	public static void main(String[] args) {
		//creamos los objetos autor y libro
		Autor aut = new Autor("Gabriel García Márquez", "Nacido en Aracataca el 6 de marzo de 1927"); 
		Libro lib = new Libro("100 años de soledad", "novela", aut); //le pasamos como argumento el objeto autor
		System.out.print(lib.toString()+"\n"); //invocamos el método toString del objeto libro
		aut.setBiografia("Nacido en Nuevo México"); //modificamos la biografía
		System.out.print(lib.toString()+"\n"); //invocamos de nuevo el método toString para ver la modificación
		System.out.print(aut.toString()+"\n"); //invocamos el método toString desde el objeto autor
		lib.setGenero("Drama"); //modificamos el género
		System.out.print(lib.toString()+"\n"); //mostramos el cambio
	}

}
