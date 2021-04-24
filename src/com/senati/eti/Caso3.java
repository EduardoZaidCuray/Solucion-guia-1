package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Ingrese primer numero.: ");
		num1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = sc.nextFloat();
		
		System.out.println("Numero ingresados");
		System.out.println("-----------------");
		System.out.println("Numero 1........:"+num1);
		System.out.println("Numero 2........:"+num2);
	}

}
