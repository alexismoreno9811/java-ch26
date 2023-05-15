package condicionales;

public class FlujoControl {

	public static void main(String[] args) {
		/*
		 * Java 05
		 * Sintaxis de la condicional if
		 * Si la condicional es verdadera, se ejecuta la instrucción del if
		 * 
		 * if( condicional ) sentencia;
		 * 
		 * if( condicional ) {
		 * 	 sentecias;
		 * }
		 * 
		 * if( condicional )
		 * 	 sentencia;
		 * else
		 *   sentencia_si_la_condicional_es_falsa;
		 * 
		 * if( condicional )
		 * 	 sentencia;
		 * else if( nueva_condicional)
		 *   sentencia;
		 * .
		 * .
		 * .
		 * else if( n_condicional )
		 *   sentencia;
		 * else
		 *   sentencia;
		 *      
		 */

		boolean condicion = false;
		if(condicion)
			System.out.println("La condición es verdadera.");
		else
		    System.out.println("La condición es falsa.");
		
		int edad = 21;
		
		if ( edad > 18 )
			System.out.println("La persona es mayor de edad.");
		else
			System.out.println("La persona es menor de edad.");
		
		// ---------------------------------------------------
		/*
		 * De una variable tipo int, evaluar si está
		 * en el rango de 1 a 10, si es así desplegar en consola
		 * "La selección está en el rango."
		 * En caso contrario "La selección está fuera de rango."
		 */
		
		int variable = 1;
		
		if (variable >= 1 && variable <= 10) {
			System.out.println("La selección está en el rango.");
		} else {
			System.out.println("La selección está fuera de rango.");
		}
		
	}

}
