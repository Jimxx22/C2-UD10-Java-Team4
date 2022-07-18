package main;

import java.util.Scanner;

import clases.Calculadora;

public class MainApp {
	
	static Calculadora calculadora;
	static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		calculadora = new Calculadora();
		
	}
	
	private static void seleccionarOpcion() {
		String opcion;
		opcion = sc.next();
		
		switch (opcion) {
		case "1":
			sumar();
			break;
		case "2":
			restar();
			break;
		case "3":
			multiplicar();
			break;
		case "4":
			
			break;
		case "5":
			
			break;
		case "6":
			
			break;
		case "7":
			
			break;
		case "8":
			
			break;
		defualt:
			
			break;
		}
		
	}
	
	private static void mostrarMenu() {
		System.out.println("╔══════════════════════════╗");
		System.out.println("║  Calculadora arítmetica  ║");
		System.out.println("╠══════════════════════════╣");
		System.out.println("║                          ║");
		System.out.println("║    1. Suma               ║");
		System.out.println("║    2. Resta              ║");
		System.out.println("║    3. Multiplicación     ║");
		System.out.println("║    4. Potencia           ║");
		System.out.println("║    5. Raíz cuadrada      ║");
		System.out.println("║    6. Raíz cubica        ║");
		System.out.println("║    7. División           ║");
		System.out.println("║    8. Salir del programa ║");
		System.out.println("║                          ║");
		System.out.println("╚══════════════════════════╝");
		System.out.print("Por favor introduce la seleccion [1-8]:");
	}
	
	private static void sumar() {
		double num1, num2, res;
		System.out.println("Suma");
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextDouble();
		res = calculadora.suma(num1, num2);
		System.out.println("El resultado es: "+res);
	}
	
	private static void restar() {
		double num1, num2, res;
		System.out.println("Resta");
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextDouble();
		res = calculadora.resta(num1, num2);
		System.out.println("El resultado es: "+res);
	}
	
	private static void multiplicar() {
		double num1, num2, res;
		System.out.println("Multiplicación");
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextDouble();
		res = calculadora.multiplicacion(num1, num2);
		System.out.println("El resultado es: "+res);
	}

}
