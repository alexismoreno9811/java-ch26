package org.generation;

import java.util.Date;

public class OperacionesMath {
	
	void sumaEnterosSinRetorno(int a, int b) {
		Date date = new Date(); // instanciando un objeto de tipo 
		System.out.printf("%tT %d + %d = %d %n", date, a, b, a+b);
	};
	
	int sumaEnteros(int a, int b) {
		return a+b;
	};
	
	double sumaFlotantes(double a, double b) {
		return (a*1000 + b*1000)/1000;
	}
	
	// sobrecarga de métodos (overload)
	// funciones con el mismo nombre pero con diferentes parámetros
	int suma(int a, int b) {
		return a + b;
	}
	
	int suma(short a, short b) {
		return a + b;
	}
	
	double suma(double a, double b) {
		return (a*1000 + b*1000)/1000;
	}
	
	double suma(double a, double b, boolean redondear) {
		if (redondear)
			return Math.round(a+b);
		return (a*1000 + b*1000)/1000;
	}	
	
}
