package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o despues de la variable
		 * ej.  int[] myArray;
		 * 		int myArray[];
		 * Para los arreglos se debe asignar la cantidad de elementos que contendrá
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		
		// Definimos un arreglo de 4 elementos tipo int.
		int[] codigoColores = new int[4]; // Instanciando un objeto de tipo Array, con 4 elementos.
						// [ 0, 0, 0, 0 ]
		String nombreColores [] = new String[4];
		
		// Para agregar elementos en un arreglo, se indica dentro del corchete el índice.
		// El primer elemento es el índice 0.
		
		nombreColores[0] = "Rojo";
		codigoColores[0] = 0x00_00_FF; // RGB 0,0,255
		
		// Agregar color amarillo y negro.
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xFF_FF_00; // Amarillo
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x00_00_00; // Negro
		
		// Iterar elemetos en un arreglo
		// usando for loop
		
		for (int i = 0; i < nombreColores.length; i++) {
			String texto = String.format("El color %s tiene el código RGB: 0x%06X", nombreColores[i], codigoColores[i]);
			System.out.println(texto);
		}
		
		// Iterar elemento de un arreglo
		// usando for each loop
		for (String nombreColor : nombreColores) {
			System.out.println("El color: " + nombreColor);
		}
		
		// Agregar un elemento al índice 5
		// Se crea la excepción que esta fuera de los límites.
		// nombreColores[5] = "Naranja";
		
		// Inicializar un arreglo al asignarlo a la variable.
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Instanciar un arreglo de 2 dimensiones.
		String[][] participantes = new String [3][5];
		
		
		
	}

}
