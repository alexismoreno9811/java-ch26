package org.generation;

public class Pokemon {
	// atributos de instancia (non-static fields)
	String nombre;
	int alturaCm;
	double pesoKg;
	// atributos de clase (static fields)
	static String nacimiento = "Ovíparos";
	
	// Métodos constructores
	// Debe tener el mismo nombre de mi Clase
	// los métodos constructores no tienen retorno (return)
	Pokemon(String nombrePk, int alturaCmPk, double pesoKgPk){
		System.out.println("Has creado un pokemon llamada: " + nombrePk);
		this.nombre = nombrePk;
		this.alturaCm = alturaCmPk;
		this.pesoKg = pesoKgPk;
	}
	
	// Métodos de instancia
	void saludo() {
		System.out.printf("Hola minombre es %s, mido %d cm y peso %.2f kg %n", nombre, alturaCm, pesoKg);
	}
	// Métodos de calse

}