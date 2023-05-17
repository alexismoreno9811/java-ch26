package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/*
		 * Sintaxis
		 * 
		 * 	for( expresión_inicial ; comparación ; expresión_final )
		 *		instrucción;
		 *	
		 *	for( expresión_inicial ; comparación ; expresión_final ){
		 *		instrucciones;
		 *	};
		 *
		 */

		int j;
		for(j = 1; j <= 5; j++);
		System.out.println("Hola " + j); // Hola 6
		
		// imprimir la tabla de multiplicar del 1 al 3.
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("");
			for(j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			};
		};
		
	}

}
