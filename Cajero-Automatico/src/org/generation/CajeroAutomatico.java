package org.generation;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		/**
		 * Fecha de entrega: Miercoles 24 de mayo, 22 h.
		 * Entrega: Link de replit
		 * 
		 * Hacer un menu de un cajero automático:
		 * 
		 * condiciones iniciales: $10,000.00
		 * 
		 * Opciones del cajero:
		 * 		1) Retirar dinero
		 * 			- Mostrar cantidad disponible a retirar
		 * 			- No se puede retirar más de $ 6,000.00
		 * 			- Solo retirar multiplos de $50
		 * 			- Preguntar si desea donar $200 para los Gatetes
		 * 		2) Hacer depósitos
		 * 			Mostrar un menú con las opciones:
		 * 			1> Cuenta de cheques 
		 * 				- Sumar al saldo disponible
		 * 				- Solo multiplos de $50
		 * 			2> Depósito a Tarjeta de Crédito
		 * 				- Restar al saldo disponible
		 * 				- Se puede incluir decimales (2 decimales)
		 * 		3) Consultar saldo
		 * 			- Indicar el saldo disponible.
		 * 		4) Quejas
		 * 			- "No disponible por el momento"
		 * 		5) Ver último movimiento
		 * 			- El último movimiento (depósitos o retiros)
		 * 			- YYYY / MM / DD hh:mm Retiro de $500
		 * 			- YYYY / MM / DD hh:mm Deposito a TC de $300.12
		 * 			- YYYY / MM / DD hh:mm Deposito a CC de $500
		 * 		9) Salir del cajero
		 * 			- Se despide y se sale del sistema.
		 * 
		 * 		nota:
		 * 			- Si se pulsa una opción inválida (ej. 6, 7, 8)
		 * 			  "Opción inválida y nos pide que volvamos a intentar"
		 * 			- Si por 3 veces consecutivas se pulsa una opción inválida
		 * 				Se despide y se sale del sistema.
		 * 			- En caso de que se pulsó una opción inválida y luego
		 * 			  se pulsa una opcón válida, esto no debería contar
		 * 			  como parte de las veces consecutivas.
		 * 
		 */
		
		double saldo = 10_000.00;
		boolean continuar = true;
		int intentos = 3;
		int opcion;
		Scanner sc = new Scanner(System.in);
		FuncionesCajero FunCaj = new FuncionesCajero(saldo,sc);
			do {
				FuncionesCajero.bienvenida();
				int verificacion=intentos;
				if(sc.hasNextInt()) {
					opcion = sc.nextInt();
					sc.nextLine();
					switch (opcion) {
						case 1: 
							saldo = FunCaj.retirarDinero();
							break;
						case 2:
							saldo = FunCaj.hacerDepositos();
							break;
						case 3:
							FunCaj.consultarSaldo();
							break;
						case 4:
							FuncionesCajero.quejas();
							break;
						case 5:
							FunCaj.verUltimoMovimiento();
							break;
						case 6,7,8:
							System.out.println("Opcion invalida intente de nuevo.");
							intentos--;
							break;
						case 9:
							continuar = FuncionesCajero.despedida();
							break;
						default:
							System.out.println("Opcion invalida intente de nuevo.");
							intentos--;
							break;
					}
					if (continuar && intentos == verificacion ) {
						System.out.println("Desea Hacer otro movimiento? (1 para si)");
						int otroMovimiento = sc.nextInt();
						sc.nextLine();
						if(otroMovimiento != 1) 
							continuar = FuncionesCajero.despedida();
					}
					if (intentos <=0) {
						System.out.println("Demasiados intentos no validos, saliendo del sistema.");
						continuar=false;					
					}
			}else {
				sc.nextLine();
				if (intentos <= 1) {
					System.out.println("Demasiados intentos no validos, saliendo del sistema.");
					continuar=false;					
				} else {
					System.out.println("Opcion invalida intente de nuevo.");
					intentos--;
				}
			}
			}while(continuar);
			sc.close();
		} 

}
