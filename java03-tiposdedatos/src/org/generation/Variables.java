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
	// Formas de representar un número
	// Representación decimal
		System.out.println("Representación decimal: " + 26);
		System.out.println("Representación hexadecimal: " + 0x1a);
		System.out.println("Representación binaria: " + 0b11010);
	// Para las literales numéricas se puede usar el guión bajo _ para separar números
	// No se puede escribir _ al inicio o al final de la literal
	// No se puede escribir _ junto a un punto decimal
	// No se puede escribir _ antes de la F o L
		int numeroSeparados = 12_345;
		float numeroFloatSeparados = 12_345.456_365F;
		
	// -------------------------------------------------------------------------------
	// Conversion de tipos de datos
		byte coquita600ml = 60;
		// upcasting
		short coquita2000ml = coquita600ml;
		// downcasting
		short pozoleGrande1L = 259;
		byte pozoleBurbuja = (byte) pozoleGrande1L;
		System.out.println("Pozole burbuja: " + pozoleBurbuja);		
		
	// -------------------------------------------------
	// Objetos de tipo String
	// Se definen entre comillas dobles.
	// Si deseas imprimir comillas dobles en el mensaje, se usa el caracter de escape \		
	// \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), 
	// \" (double quote), \' (single quote), and \\ (backslash).
		String myVarString = "Holi \"Crayoli\"";
		System.out.println("Mensaje string: " + myVarString);
		
	// Convertir de String a número
		byte edadMascota = Byte.parseByte("10");
		double edadPlaneta = Double.parseDouble("456.8956");
		System.out.println(edadMascota + " , " + edadPlaneta);
	
	// Convertir números a String
		String edadString = String.valueOf(4568);
	
	// Obteniendo la longitud de un String
		System.out.println("El número de digitos de edadString es de: " + edadString.length());
	
	// Obteniendo el primer caracter de un String
		System.out.println("El primer caracter de " + edadString + " es: " + edadString.charAt(0));
		
	// ----------------------------------------------------------------
	// Operadores numéricos.
		int opA = 5;
		int opB = 6;
		int suma = opA + opB;
		int resta = opA - opB;
		int multiplica = (int)(opA * opB * 1.01);
		double multiplicaDouble = (opA * opB * 1.01);
		int division = opA / opB;
		double divisionDouble = 1.0 * opA / opB;
		int residuo = opA % 2;
		
		System.out.println("Suma es: " + suma);
		System.out.println("Resta es: " + resta);
		System.out.println("Multiplica es: " + multiplica);
		System.out.println("MultiplicaDouble es: " + multiplicaDouble);
		System.out.println("Division es: " + division);
		System.out.println("DivisionDouble es: " + divisionDouble);
		System.out.println("DivisionDouble es: " + residuo);
		
		int valorInicial = 10;
		System.out.println("Preincremento: " + ++valorInicial);
		System.out.println("Postincremento: " + valorInicial++);
		System.out.println("Valor final: " + valorInicial);
		valorInicial = 33;
		System.out.println("Predecremento: " + --valorInicial);
		System.out.println("Postdecremento: " + valorInicial--);
		System.out.println("Valor final: " + valorInicial);
		
		// Operaciones con valores enteros
		byte edadGato = 10;
		short dobleDeEdad = (short)(edadGato * 2);
		
		// Operadores comparativos
		// <, <=, >, >=, ==, !=
		int numEmpleados = 1000;
		System.out.println("Empleados > 1000: " + (numEmpleados > 1000));
		System.out.println("Empleados >= 1000: " + (numEmpleados >= 1000));
		System.out.println("Empleados == 1000: " + (numEmpleados == 1000));
		System.out.println("Empleados != 1000: " + (numEmpleados != 1000));
		
		// Operadores lógicos
		// && (AND) retorna true si ambos operadores son true
		// || (OR) retorna true si cualquiera de los operandos es true
		// ! (NOT) invierte el resultado booleano
		
		System.out.println("Empleados > 0 && Empleados < 2000: " + (numEmpleados > 0 && numEmpleados < 2000));
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		System.out.println( (a && b) || (a && c) );
		System.out.println( a || b || c && a );
		System.out.println( !(a || b) && (!a || c) );
		System.out.println( a || b && c || a && b );

		// -------------------------------------------------------------------
		int divisionPorCero = 45 / 0;
		
	}

}
