package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el lado del triangulo: ");
		int lado1 = sc.nextInt();
		
		int area = (int)Math.pow(lado1,2);
		int perimetro = lado1 * 4;
		
		System.out.println("Resultados");
		System.out.println("\nArea del cuadrado: "+ area);
		System.out.println("Perimetro del cuadrado: "+perimetro);
				

	}

}
