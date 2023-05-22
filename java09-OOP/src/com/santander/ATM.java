package com.santander;

public class ATM {
	// Atributos de instancia (non-static fields)
	String serialNumber; // Null
	double balance; // 0.0
	
	// Atributos de clase (static fields)
	static String bankName = "BBVA"; // 01-Inicialización 
	static int counterATM;
	
	// Bloque de inicialización de atributos de instancia
	// Se ejecuta cuando se crea la instancia.
	{
		serialNumber = "---";
		balance = 100_000.00;		
	}
	
	// Bloque de inicialización de atributos de clase
	static {
		bankName = "Santander S.A. de C.V."; // 02-Inicialización
		counterATM = 1;
	}
	
	ATM(double balance){
		this.balance = balance;
		this.serialNumber = "A" + counterATM++;
	}
	
	// Constructores
	ATM(String serialNumber, double balance){
		//this.serialNumber = serialNumber;
		//this.balance = balance;
		// Llamar a otro constructor, se usa this().
		// Tiene que ser la primera línea
		this(balance); // ATM()
	}
	
	// Métodos de instancia
	double getBalance() {
		return this.balance;
	}
	
	// Métodos de clase
	static String getBankName(){
		return "Bank: " + bankName;
	}
	
	
}
