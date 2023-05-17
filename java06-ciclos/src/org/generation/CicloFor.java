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

//		int j;
//		for(j = 1; j <= 5; j++);
//		System.out.println("Hola " + j); // Hola 6
		
		// imprimir la tabla de multiplicar del 1 al 3.
		
//		for(int i = 1; i <= 3; i++) {
//			for(j = 1; j <= 10; j++) {
//				//System.out.println(i + " * " + j + " = " + (i * j));
//				System.out.printf("%d * %02d = %02d %n",i, j, i*j );
//			}
//		}
		
//		int iteraciones = 1;
//		for( ; ; ) {
//			
//			if(iteraciones > 5) break;
//			System.out.println("Iteración: " + iteraciones++);
//		}
//		
//		outerLoop:
//			for(int i = 0; i < 5; i++) {
//				for (int j = 0; j < 5; j++) {
//					System.out.println(i + " " + j);
//					if(i==2 && j==2) break outerLoop;
//				}
//			}
		
		// Imprimir los número impares del 1 al 20 (incluyendo)
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) continue;
			System.out.printf("El %02d es impar %n", i);
		}
		
		boolean bandera = false;
		if(bandera)
			System.out.println("Banderita, banderita, banderita tricolor");
		
	}

}
