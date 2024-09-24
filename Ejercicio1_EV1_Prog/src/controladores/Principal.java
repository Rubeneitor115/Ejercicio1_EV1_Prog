/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * rbr - 240924
 */
public class Principal {

	/**
	 * Método principal de la aplicación
	 * rbr - 240924
	 * @param args
	 */
	public static void main(String[] args) {


		//Variables
		String nombre, primerApellido;
		byte edad;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito por consola los datos y los guardo en sus correspondientes variables
		System.out.println("Escriba su nombre: ");
		nombre = sc.next();
		System.out.println("Escriba su primer apellido: ");
		primerApellido = sc.next();
		System.out.println("Escriba su edad: ");
		edad = sc.nextByte();
		
		//Muestro los datos por consola con el formato solicitado
		System.out.println(nombre + " " + primerApellido + " - " + edad);

	}

}
