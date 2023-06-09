package com.generation.app.entity;

import java.sql.Timestamp;

import com.generation.app.config.CustomerParameters;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 *  @Entity marca una clase como entidad que se mapea a una tabla de una base de datos.
 *  Se indica a JPA que la clase representa una tabla en la DB y que sus atributos
 *  se mapearan a columnas en esa tabla. Es importante tener un constructor sin argumentos,
 *  así como setters y getters.
 *  
 *  @NoArgsConstructor le indica a Lombok que cree un constructor sin argumentos.
 *  
 *  @Data le indica a Lombok que genere automáticamente los métodos comunes como
 *  toString(), equals(), hashCode(), Setters y Getters para todos los argumentos.
 *  
 *  @Id indicamos que este campo será nuestra llave primaría.
 *  
 *  @GeneratedValue indica como se generará automáticamente el valor de las claves
 *  primarias.
 */
@NoArgsConstructor
@Data
@Entity
@Table(name="customer")
public class Customer implements CustomerParameters{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="first_name", nullable=false, length=FIRSTNAME_MAX_LENGTH)
	private String firstName;
	@Column(name="last_name", length=LASTNAME_MAX_LENGTH)
	private String lastName;
	@Column(name="address", length=ADDRESS_MAX_LENGTH)
	private String address;
	@Column(name="email", nullable=false, length=EMAIL_MAX_LENGTH, unique=true)
	private String email;
	@Column(name="password",nullable=false, length=PASSWORD_MAX_LENGTH)
	private String password;
	@Column(name="active")
	private boolean active;
	// insertable, updatable: la columna se incluye en las operaciones de inserción
	// columnDefinition: definición personalizada para la columna(tipo específico de dato, restricciones)
	@Column(name="create_at", insertable=false, updatable=false, columnDefinition="timestamp default CURRENT_TIMESTAMP")
	private Timestamp createAt;
	
}
