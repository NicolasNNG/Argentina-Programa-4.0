
import java.io.File;

import java.io.FileNotFoundException;

import java.util.*;



public class Clase4_Archivo {



	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("E:\\UTN\\Practica\\Clase 4 Archivo\\Numero.txt");
		char operacion = 'm';
		int sumaInt= sumar(archivo, operacion);
		System.out.print("\nEl resultado es: "+sumaInt);
	}
	private static int sumar(File ruta, char op) throws FileNotFoundException {
		int producto=0, suma=0, resultado =0;
		boolean bandera= true;
		Scanner sumaNumeros = new Scanner(ruta);
		if (op == 's') {

		 System.out.println("Entra por suma: ");

		 while (sumaNumeros.hasNextInt()) { 		 

	            suma = suma + sumaNumeros.nextInt();

	            System.out.print(suma+" ");

		 } return suma;

		}

		else { 

			System.out.println("Entra por multiplicacion: ");

		     while (sumaNumeros.hasNextInt()) { 

		    	 if (bandera) {

					 producto = sumaNumeros.nextInt();

					 bandera = false;

				  }else

					  producto = producto * sumaNumeros.nextInt();

		    	 System.out.print(producto+" ");

			 } return producto;

			}		     

	}	

}

