package com.senati.eti;

public class Caso6 {
	
	public static void main(String[] args) {
		// CAST	-> Convertir de un tipo de dato a otro
		int rpta1 = (int)Math.pow(5,3);
		// Raiz cuadrada -> base elevada a la inversa del exponente
		float rpta2 = (float)Math.pow(81, 1/2.0);
		
		float rpta3 = (float)Math.pow(125, 1/3.0);
		float rpta4 = (float)Math.pow(25, 1/4.0);
		
		System.out.println("Resultados");
		System.out.println("\nRespuesta 1: " + rpta1);
		System.out.println("Respuesta 2: " + rpta2);
		System.out.println("Respuesta 3: "+ rpta3);
		System.out.println("Respuesta 4: "+ rpta4);
		
	}

}
