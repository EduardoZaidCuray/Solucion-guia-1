package com.senati.eti;

// Importando la libreria para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		// Creado un objeto sc a partir de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Primero declaramos la variable
		int numero = 0;
		
		// Lectura, se usa solo print para la lectura de datos
		System.out.print("Ingrese n�mero: ");
		numero = sc.nextInt();
		
		// Impresi�n
		System.out.println("\nN�mero Ingresado");
		System.out.println("-----------------");
		System.out.println("N�mero.....: " + numero);
	}

}
