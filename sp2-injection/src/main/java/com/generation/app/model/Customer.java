package com.generation.app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * @Component es una anotación genérica que se utiliza
 * para indicar que la clase es un componenete de Spring
 * y debe ser gestionada por el contenedor de
 * inversión de control (IoC).
 * 
 * @Component se aplica a una clase para que Spring la detecte automáticamente
 * y le registre como un bean en el contexto de la aplicación.
 * 
 * @Qualifier se usa para resolver amigüedades cuando hay varias clases(beans) del mismo
 * tipo en el contexto de la aplicación y se necesita especificar cuál bena se debe
 * inyectar
 * 
 * Bean: es un objeto administrado por el contenedor de Spring
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Qualifier ("customer")
public class Customer {
	private static int counter;
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	
	{
		this.id = ++counter;
		log.info("Se inicializa Customer " + this.id);
	}
	
}
