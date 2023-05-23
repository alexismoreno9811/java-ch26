package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
		System.out.println("Counter Atm: " + Atm.getCounterAtm());
		
		Atm cajeroA = new Atm(9_000.00);
		// Al usar el constructor por default, se agregue
		// 100_000 al atributo balance.
		Atm cajeroB = new Atm();
		Atm cajeroC = new Atm("777000");
		
		
//		System.out.println(cajeroA.serialNumber);
//		System.out.println(cajeroA.balance);
//		System.out.println(cajeroB.serialNumber);
//		System.out.println(cajeroB.balance);
//		System.out.println(cajeroC.serialNumber);
//		System.out.println(cajeroC.balance);
		
	}

}
