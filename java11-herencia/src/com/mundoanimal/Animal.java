package com.mundoanimal;
/**
 * Las clases abstractas son clases que no se pueden instanciar
 * Estas clases se utilizan como modelos(plantillas) para
 * crear subclases concretas que se pueden instancias.
 * 
 * Una clase abstracta se declara en la firma de la clase
 * con la palabra 'abstract'.
 * 
 * La clase abstracta puede contener métodos abstractos y
 * método concretos.
 * 
 * Un método abstracto se declara sin implementación y se
 * define en las subclases.
 * 
 * Las clases abstractas se recomiendan utilizar para
 * clases que esten estrechamente relacionadas (is-A).
 * 
 * @author Alexis Moreno
 *
 */

public abstract class Animal {
	private String name = "---";
	private String type = "---";
	private double sizeInMts = 0.0;
	private double weightInKg = 0.0;
	private boolean alive = true;
	
	public Animal (String name) {
		this.name = name;
	}
	
	/**
	 * Un método abstracto no tiene cuerpo, solo la definición del método.
	 * Termina en punto y coma.
	 * La clase heredada es quién implementará el comportamiento.
	 * Si existe un método abstracto, la clase que lo contiene también tiene que ser abstracta.
	 */
	abstract public String showFigure();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSizeInMts() {
		return sizeInMts;
	}

	public void setSizeInMts(double sizeInMts) {
		this.sizeInMts = sizeInMts;
	}

	public double getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public String eat(String food) {
		return "El animal " + this.name + " está comiento: " + food;
	}
	
	public String sleep(int minutes) {
		return this.name + " duerme " + minutes + " minutos.";
	}
	
}
