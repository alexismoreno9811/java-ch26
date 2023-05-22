package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo SET es una colección NO ORDENADA.
		 * No se permiten elementos duplicados
		 * Cualquier elemento duplicado no se insertará en la colección.
		 * 
		 * Sintaxis:
		 * 	HashSet<Object> varName;
		 */
		
		// Definimos una colección HashSet
		HashSet<String> paises = new HashSet<>();
		
		// Agregar valores con add()
		paises.add("México");
		paises.add("Alemania");
		paises.add("Genovia");
		paises.add("Wakanda");
		
		System.out.println(paises);
		paises.add("Genovia"); // Agregando duplicado
		System.out.println(paises); // No se agrego porque ya existia
		
		// Desplegamos el tamaño de la colección, size()
		System.out.println("Elementos: " + paises.size());
		
		// Verificando si existe un elemento, contains()
		System.out.println("Existe USA: " + paises.contains("USA"));
		System.out.println("Existe Alemania: " + paises.contains("Alemania"));
		
		// Removemos un elemento, remove()
		System.out.println("Eliminamos \"Mexico\": " + paises.remove("Mexico"));
		System.out.println(paises);
		
		// Iteramos la colección
		// for each loop
		for (String pais : paises) System.out.println(pais);
		
		// Usando lambda expressions
		paises.forEach( pais -> System.out.println("->" + pais) );

	}

}
