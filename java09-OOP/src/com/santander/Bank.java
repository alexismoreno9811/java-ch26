package com.santander;

import java.util.ArrayList;

public class Bank {
	String address;
	int sucursalNumber;
	ArrayList<ATM> ATMs; // = new ArrayList<>();
	
	{
		ATMs = new ArrayList<>();
	}
	
	static int counterBank = 1;
	
	// Constructor por default
	Bank(){
		this.sucursalNumber = counterBank++;
	}
	
	Bank(String address){
		this(); // invoca al constructos por default
		this.address = address;
	}
	
	String getATMs() {
		String text = "";
		for(ATM Atm: ATMs) {
			text += Atm.serialNumber + " $" + Atm.balance + "\n";
		}
		return text;
	}
	

}
