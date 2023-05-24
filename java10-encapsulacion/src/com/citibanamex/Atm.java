package com.citibanamex;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Atm {
	private int serialNumber;
	private double balance;
	private ArrayList<String> log = new ArrayList<>();
	
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
			depositLog(amount);
			return setBalance( getBalance() + amount);
		} else {
			return setBalance( getBalance() );
		}
	}
	
	private void withdrawLog(double amount) {
		String ANSI_RESET = "\u001B[0m";
		String ANSI_YELLOW = "\u001B[33m";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(ANSI_YELLOW);
		strBuilder.append(getDate());
		strBuilder.append(" - Withdraw $ ");
		strBuilder.append(amount);
		strBuilder.append(",  Balance: ");
		strBuilder.append(getBalance());
		strBuilder.append("\n");
		strBuilder.append(ANSI_RESET);
		
		this.log.add(strBuilder.toString());
	}
	
	private void depositLog(double amount) {
		String ANSI_RESET = "\u001B[0m";
		String ANSI_BLUE = "\u001B[34m";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(ANSI_BLUE);
		strBuilder.append(getDate());
		strBuilder.append(" - Deposit $ ");
		strBuilder.append(amount);
		strBuilder.append(",  Balance: ");
		strBuilder.append(getBalance());
		strBuilder.append("\n");
		strBuilder.append(ANSI_RESET);
		
		this.log.add(strBuilder.toString());
	}

	
	public String getLog() {
		StringBuilder strBuilder = new StringBuilder();
		
		for(String event: this.log) {
			strBuilder.append(event);			
		}
	
		return strBuilder.toString();
	}
	
	public String getLog(int items) {
		StringBuilder strBuilder = new StringBuilder();
		
		if (items <= 0)
			strBuilder.append("Numero de movimientos a visualizar no valido");
		else if(items > this.log.size()) { 
			strBuilder.append("Solo cuentas con: ");
			strBuilder.append(this.log.size());
			strBuilder.append(" movimientos.\n");
			for(int i = this.log.size() - 1; i >= 0; i--) {
				strBuilder.append(this.log.get(i));			
			}
		} else {
			for(int i = this.log.size() - 1; i >= this.log.size() - items; i--) {
				strBuilder.append(this.log.get(i));			
			}
		}
		
		return strBuilder.toString();		
	}
	
	public void withdraw(double amount) throws IllegalArgumentException, IllegalStateException{
		if(amount <= 0 )
			throw new IllegalArgumentException("La cantidad no puede ser menor o igual a 0");
		else if(amount > getBalance())
			throw new IllegalStateException("Fondos insuficientes");
		else {
			withdrawLog(amount);
			setBalance( getBalance() - amount);
		}
	}
	
	private String getDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/DD hh:mm:ss");
		return dateFormat.format(date);
	}
	
	public String displayInfo() {
		// return "Serial number: " + getSerialNumber() + ", Amount: $ " + getBalance();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Serial number: ");
		strBuilder.append(getSerialNumber());
		strBuilder.append(", Amount: $ ");
		strBuilder.append(getBalance());
		return strBuilder.toString();
	}
	
}
