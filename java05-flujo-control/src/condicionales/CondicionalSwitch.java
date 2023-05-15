package condicionales;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/*
		 *  Sintaxis:
		 *  
		 *  switch (expresión){
		 *  	case valor1: expresión;
		 *  				 break;
		 *  	case valor2: expresión;
		 *  				 break;
		 *  	default:     expresión;
		 *                   break;
		 *  }
		 *  
		 *  La expresión a evaluar debe ser un tipo entero, string o enum.
		 *  La condicional Switch usa el método equals para comparar con los Strings.
		 */
		
		// -------------------------------------------
		/*
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej: entrada-> "Escribe tu mes de nacimiento: " 12
		 * 	salida-> Naciste en diciembre.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe tu mes de nacimiento ( 1 - 12 ): ");
		if(sc.hasNextInt()) {
			int mes = sc.nextInt();
			sc.nextLine();
			String mesTxt = "";
			String estacion = "";
			switch (mes) {
			case 1 : mesTxt = "Enero";
					 break;
			case 2 : mesTxt = "Febrero";
					 break;
			case 3 : mesTxt = "Marzo";
					 break;
			case 4 : mesTxt = "Abril";
			 		 break;
			case 5 : mesTxt = "Mayo";
					 break;
			case 6 : mesTxt = "Junio";
					 break;
			case 7 : mesTxt = "Julio";
					 break;
			case 8 : mesTxt = "Agosto";
					 break;
			case 9 : mesTxt = "Septiembre";
			 		 break;
			case 10: mesTxt = "Octubre";
					 break;
			case 11: mesTxt = "Noviembre";
					 break;
			case 12: mesTxt = "Diciembre";
					 break;
			default: mesTxt = "Tu mes no es valido.";
			}
			switch (mes) {
			case 1, 2, 12: estacion = "invierno";
			 			 break;			
			case 3, 4, 5: estacion = "primavera";
			break;			
			case 6, 7, 8: estacion = "verano";
			break;			
			case 9, 10, 11: estacion = "otoño";
			break;			
			default: estacion = "estación no valida";
			}
			sc.close();
			System.out.println("Naciste en el mes: " + mesTxt);
			System.out.println("Cuya estación es: " + estacion);
		} else {
			System.out.println("No escribiste un número");
		}

	}

}
