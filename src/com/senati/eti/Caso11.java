package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine(); // crea un objeto de tipo string
		
		System.out.println("Resultado");
		System.out.println("Sus caracteros son: " + nombre.length());

	}

}
