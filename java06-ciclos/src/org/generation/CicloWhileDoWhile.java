package org.generation;

import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {
		/*
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 * 
		 * 		while( condición ) instrucción;
		 * 
		 * 		while( condición ){
		 * 			instrucciónes;
		 * 		}
		 * 
		 */
		//Scanner sc = new Scanner(System.in);
		var sc = new Scanner(System.in);
		
		boolean active = false;
		
		while(active) {
			System.out.println("Bienvenido Alexis");
			System.out.println("Quieres seguir activo (s/n)?");
			char response = sc.next().toLowerCase().charAt(0);
			if(response != 's') {
				active=false;
				System.out.println("Gracias por tu visita.");
				sc.close();
			}			
		}
		
		do {
			System.out.println("Bienvenido Alexis");
			System.out.println("Quieres seguir activo (s/n)?");
			char response = sc.next().toLowerCase().charAt(0);
			if(response == 's') active = true;
			else {
				active=false;
				System.out.println("Gracias por tu visita.");
				sc.close();
			} 		
		}while(active);
	}

}
