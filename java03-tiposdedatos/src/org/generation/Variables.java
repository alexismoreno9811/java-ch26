package org.generation;

public class Variables {

	public static void main(String[] args) {
		/*
		* Reglas para el nombre de las variables:
		* - Se distingue entre minúsculas y mayusculas
		* - La longitud del nombre es limitada
		* - Puedes utilizar cualquier caracter Unicode
		* - La variable puede comenzar:
		* 	> una letra ej. miVariable
		* 	> signo de dolar $mivariable
		* 	> caracter de subrayado _miVariable
		* 
		*/
		
		//int $myVar; // es válido, pero no se recomienda
		//int _myVar; // es válido, pero no se recomienda
		//int #myVar; // no es válido.
		//int myVarEspañol; // es válido, pero no se recomienda, de preferencia nombres en ingles.
		//int 5comentarios; // no es válido, no se puede comenzar con un número
		//int sinC0m3nt4r10s; // es válido
		
		/*
		 * En Java tendremos los siguientes tipos de variables:
		 * 	Variables de instancia (Non static fields): atributos de los objetos.
		 * 	Variables de clase (Static Fields): atributos de la clase.
		 * 	Variables locales (local variables): variable dentro de las funciones(métodos).
		 *  Parámetros (parameters): Entrada de las funciones
		 *  
		 */
	/**
	 * Tipos de datos en Java
	 * - Objetos
	 * - Datos primitivos
	 *  	8 datos primitivos
	 *  > byte
	 *  > short
	 *  > int
	 *  > long
	 *  > float
	 *  > double
	 *  > boolean
	 *  > char
	 *  
	 */
	// el tipo byte es de 8 bits, almacena datos numéricos enteros
		byte myVarByte = 12;
		System.out.println("byte: " + myVarByte);
	// 2^8 = 256
	// Obtener el valor máximo y minimo del tipo byte, usando su
	// wrapper (Clase envolvente) Byte.
		System.out.println("Byte, Max value: " + Byte.MAX_VALUE );
		System.out.println("Byte, Min value: " + Byte.MIN_VALUE );
		
	// El tipo short es de 16 bits, almacena datos numéricos enteros
	// 2^16 = 65,536
		short myVarShort = 500;
		System.out.println("short: " + myVarShort);
		System.out.println("Short, Max value: " + Short.MAX_VALUE);
		System.out.println("Short, Min value: " + Short.MIN_VALUE);
		
	// El tipo int es de 32 bits, almacena datos numéricos enteros.
	// 2^32 = 4,294,967,296
		int myVarInt = 1000;
		System.out.println("int: " + myVarInt);
		// El wrapper para int -> Integer
		System.out.println("Integer, Max value: " + Integer.MAX_VALUE);
		System.out.println("Integer, Min value: " + Integer.MIN_VALUE);
		
	// El tipo long es de 64 bits, almacena datos numéricos enteros
	// 2^64
	// Las literales numéricas enteras son de tipo int por default.
	// Para indicar una literal numérica de tipo float, hay que indicar la literal con la letra l o L al final
		long myVarLong = 1500L;
		System.out.println("Long: " + myVarLong);
		System.out.println("Long, Max value: " + Long.MAX_VALUE);
		System.out.println("Long, Min value: " + Long.MIN_VALUE);
	
	// ---------------------------------------------------------------
	// El tipo float es de 32 bits, almacena datos numéricos de punto flotante (real).
	// Las literales numéricas enteras son de tipo double por default.
	// Para indicar una literal numérica de tipo float, hay que indicar la literal con la letra f o F al final
		float myVarFloat = 1500.6523F;
		System.out.println("Float: " + myVarFloat);
		System.out.println("Float, Max value: " + Float.MAX_VALUE);
		System.out.println("Float, Min value: " + Float.MIN_VALUE);
		
	// El tipo double es de 64 bits, almacena datos numéricos de punto flotante
		double myVarDouble = 1800.6523D;
		System.out.println("Double: " + myVarDouble);
		System.out.println("Double, Max value: " + Double.MAX_VALUE);
		System.out.println("Double, Min value: " + Double.MIN_VALUE);
	
	// ----------------------------------------------------------
	// El tipo boolean solo almacena valores true o false
		boolean myVarBoolean = true;
		System.out.println("myVarBoolean es: " + myVarBoolean);
		
	// El tipo char solo almacena un caracter, se debe definir la literal
	// entre apostrofes ej. 'a'. Solo almacena caracteres de la tabla unicode(16 bits)
	// puede almacenar del 0 al 65535.
		
		char losPandillerosDeLaTarde = 'I';
		System.out.println("char: " + losPandillerosDeLaTarde);
	// Podemos definir un char por su código unicode o sus valores numéricos.
		char letraL = '\u004C'; // L
		System.out.println("La letra L: " + letraL);
		char letraM = 77; // M
		System.out.println("La letra M: " + letraM);
		
	}	

}
