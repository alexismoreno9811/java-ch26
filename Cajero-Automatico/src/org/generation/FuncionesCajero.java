package org.generation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FuncionesCajero {
	double saldo;
	Scanner sc;

	FuncionesCajero(double saldo, Scanner sc) {
		this.saldo = saldo;
		this.sc = sc;
	}

	String ultimoMovimiento = "";
	Date fecha;

	static void bienvenida() {
		System.out.println("Bienvenido");
		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("Opción 1: Retirar dinero");
		System.out.println("Opción 2: Hacer despositos");
		System.out.println("Opción 3: Consultar saldo");
		System.out.println("Opción 4: Quejas");
		System.out.println("Opción 5: Ver último movimiento");
		System.out.println("Opción 9: Salir del cajero");
	}

	double retirarDinero() {
		System.out.printf("Cantidad disponible para retirar: %,1.02f (maximo:$6.000,00) %n", saldo);
		System.out.println("Solo se puede retirar multiplos de $50.");
		System.out.println("Para cancelar ingrese 0");
		boolean continuar = true;
		while (continuar) {
			if (sc.hasNextInt()) {
				int cantidadRetiro = sc.nextInt();
				sc.nextLine();
				if (cantidadRetiro % 50 == 0 && cantidadRetiro <= 6000 && cantidadRetiro > 0
						&& cantidadRetiro <= saldo) {
					fecha = new Date();
					saldo -= cantidadRetiro;
					ultimoMovimiento = " Retiro de $" + cantidadRetiro;
					System.out.println("Deseas donar $200 para los Gatetes (1 para si, cualquier otro boton para no)");
					int response = sc.nextInt();
					sc.nextLine();
					if (response == 1)
						saldo -= 200;
					continuar = false;
				} else if (cantidadRetiro == 0) {
					continuar = false;
				} else
					System.out.println("La cantidad ingresada no es valida, ingrese otra");
			} else {
				System.out.println("La cantidad ingresada no es valida, ingrese otra");
				sc.nextLine();
			}
		}
		return saldo;
	}

	double hacerDepositos() {
		System.out.println("Opciones de depositos:");
		System.out.println("1) Cuenta de cheques");
		System.out.println("2) Tarjeta de credito");
		System.out.println("Para cancelar ingrese 0");
		boolean continuar = true;
		while (continuar) {
			int opcion = sc.nextInt();
			sc.nextLine();
			if (opcion == 1) {
				saldo = depositoCC();
				continuar = false;
			} else if (opcion == 2) {
				saldo = depositoTDC();
				continuar = false;
			} else if (opcion == 0) {
				continuar = false;
			} else {
				System.out.println("La cantidad ingresada no es valida, ingrese otra");
			}
		}
		return saldo;
	}

	double depositoCC() {
		System.out.println("Solo se puede depositar multiplos de $50.");
		System.out.println("Para cancelar ingrese 0");
		boolean continuar = true;
		while (continuar) {
			if (sc.hasNextInt()) {
				int cantidadDeposito = sc.nextInt();
				sc.nextLine();
				if (cantidadDeposito % 50 == 0 && cantidadDeposito >= 0) {
					fecha = new Date();
					saldo += cantidadDeposito;
					ultimoMovimiento = " Deposito a cuenta de cheques de $" + cantidadDeposito;
					continuar = false;
				} else if (cantidadDeposito == 0) {
					continuar = false;
				} else
					System.out.println("La cantidad ingresada no es valida, ingrese otra");
			} else {
				System.out.println("La cantidad ingresada no es valida, ingrese otra");
				sc.nextLine();
			}
		}
		return saldo;
	}

	double depositoTDC() {
		System.out.println("Ingrese la cantidad a depositar (para decimales separar con `,` y maximo 2 decimales):");
		System.out.println("Para cancelar ingrese 0");
		boolean continuar = true;
		while (continuar) {
			if (sc.hasNextDouble()) {
				double cantidadDeposito = sc.nextDouble();
				sc.nextLine();
				if (cantidadDeposito > 0 && cantidadDeposito <= saldo) {
					fecha = new Date();
					saldo = (saldo*100-((int)(cantidadDeposito*100))) / 100;
					ultimoMovimiento = " Deposito a tarjeta de credito de $" + cantidadDeposito;
					continuar = false;
				} else if (cantidadDeposito == 0) {
					continuar = false;
				} else
					System.out.println("La cantidad ingresada no es valida, ingrese otra");
			} else {
				System.out.println("La cantidad ingresada no es valida, ingrese otra");
				sc.nextLine();
			}
		}
		return saldo;
	}

	void consultarSaldo() {
		System.out.printf("Su saldo disponible es de: $ %,1.02f %n", saldo);
	}

	static void quejas() {
		System.out.println("No disponible por el momento");
	}

	void verUltimoMovimiento() {
		if (!ultimoMovimiento.isEmpty()) {
			SimpleDateFormat fechaStr = new SimpleDateFormat("YYYY/MM/dd hh:mm");
			System.out.println(fechaStr.format(fecha) + ultimoMovimiento);
		} else {
			System.out.println("No has realizado un movimiento");
		}
	}

	static boolean despedida() {
		System.out.println("Hasta luego, vuelva pronto");
		return false;
	}

}
