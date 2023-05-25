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

	final public String getName() {
		return name;
	}
	
	// Con final en la firma del método
	// evitamos que clases que se heredan
	// puedan sobreescribirlo
	final public void setName(String name) {
		this.name = name;
	}

	final public String getType() {
		return type;
	}

	final public void setType(String type) {
		this.type = type;
	}

	final public double getSizeInMts() {
		return sizeInMts;
	}

	final public void setSizeInMts(double sizeInMts) {
		this.sizeInMts = sizeInMts;
	}

	final public double getWeightInKg() {
		return weightInKg;
	}

	final public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	final public boolean isAlive() {
		return alive;
	}

	final public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public String eat(String food) {
		return "El animal " + this.name + " está comiento: " + food;
	}
	
	public String sleep(int minutes) {
		return this.name + " duerme " + minutes + " minutos.";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", sizeInMts=");
		builder.append(sizeInMts);
		builder.append(", weightInKg=");
		builder.append(weightInKg);
		builder.append(", alive=");
		builder.append(alive);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
}
