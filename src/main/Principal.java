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
		Autor aut = new Autor("Gabriel Garc�a M�rquez", "Nacido en Aracataca el 6 de marzo de 1927"); 
		Libro lib = new Libro("100 a�os de soledad", "novela", aut); //le pasamos como argumento el objeto autor
		System.out.print(lib.toString()+"\n"); //invocamos el m�todo toString del objeto libro
		aut.setBiografia("Nacido en Nuevo M�xico"); //modificamos la biograf�a
		System.out.print(lib.toString()+"\n"); //invocamos de nuevo el m�todo toString para ver la modificaci�n
		System.out.print(aut.toString()+"\n"); //invocamos el m�todo toString desde el objeto autor
		lib.setGenero("Drama"); //modificamos el g�nero
		System.out.print(lib.toString()+"\n"); //mostramos el cambio
	}

}
