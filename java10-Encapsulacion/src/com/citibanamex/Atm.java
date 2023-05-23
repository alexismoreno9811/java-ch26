package com.citibanamex;

public class Atm {
	private int serialNumber;
	private double balance;
	
	private static int counterAtm = 1;
	
	public Atm() {
		//this.balance = 100_000;
		setBalance(100_000);
		//this.serialNumber = counterAtm++;
		setSerialNumber(counterAtm++);
	}
 
	public Atm(double balance){
		this(); // se invoca al constructor sin parámetros (default)
		// this.balance = balance;
		setBalance(balance);
	}

	public Atm(String balance){
		this(Double.parseDouble(balance));
	}
	
	// Para acceder a los atributos encapsulados
	// se usan los setters y getters.
	
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	private int setSerialNumber(int serialNumber) {
		return this.serialNumber = serialNumber;
	}

	public double getBalance() {
		return this.balance;
	}
	
	private double setBalance(double balance) {
		return this.balance = balance;
	}
	
	public static int getCounterAtm() {
		return counterAtm;
	}
	
	public double deposit(double amount) {
		if(amount > 0) {
			// return this.balance = amount;
			return setBalance( getBalance() + amount);
		} else {
			return setBalance( getBalance() );
		}
	}
	
}
