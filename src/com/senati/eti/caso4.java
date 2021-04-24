package com.senati.eti;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Primer numero.: ");
		num1 = sc.nextFloat();
		
		System.out.print("Segundo numero: ");
		num2 = sc.nextFloat();
		
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float division = num1 / num2;
		float resto_entero = num1 % num2;
		float multiplicacion = num1 * num2;
		
		System.out.println("Suma          :" + suma);
		System.out.println("Resta         :" + resta);
		System.out.println("Division      :" + division);
		System.out.println("Resto entero  :" + resto_entero);
		System.out.println("Multiplicacion:" + multiplicacion);
		
		
	}

}
