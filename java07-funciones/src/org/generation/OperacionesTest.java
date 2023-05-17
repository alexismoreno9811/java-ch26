package org.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		System.out.println("Java 07 Funciones");

		OperacionesMath operaciones = new OperacionesMath();
		
		operaciones.sumaEnterosSinRetorno(35, 5);  //40
		operaciones.sumaEnterosSinRetorno(3, 3);  //6
		
		int sumaUno = operaciones.sumaEnteros(10, 9);  //19
		int sumaDos = operaciones.sumaEnteros(6, 5);  //11
		
		operaciones.sumaEnterosSinRetorno(sumaUno, sumaDos); //30
		System.out.println(operaciones.sumaFlotantes(0.1, 0.2)); //0.3
		
		System.out.println(operaciones.suma(0.1, 0.5, true)); //1.0
		
	}

}
