package com.santander;

public class ATMTest {

	public static void main(String[] args) {
		// Para utilizar los metodos de clase
		// no se requiere una instancia. Se usa directamente
		// de la clase.
		
		System.out.println(ATM.getBankName());
		
		// Instanciar un objeto de la clase
		ATM cajeroA;
		cajeroA = new ATM(50_000.00);
		ATM cajeroB = new ATM(75_000.00);
		ATM cajeroC = new ATM(60_000.00);
		ATM cajeroD= new ATM(65_000.00);
		ATM cajeroE= new ATM(70_000.00);
		
		System.out.println(cajeroA.serialNumber + " $" + cajeroA.getBalance());
		System.out.println(cajeroB.serialNumber + " $" + cajeroB.getBalance());
		System.out.println(cajeroC.serialNumber + " $" + cajeroC.getBalance());
		System.out.println(cajeroD.serialNumber + " $" + cajeroD.getBalance());
		System.out.println(cajeroE.serialNumber + " $" + cajeroE.getBalance());
		
		
	}

}
