package main;

import java.util.Scanner;

import clases.Calculadora;

public class MainApp {
	
	static Calculadora calculadora;
	static Scanner sc;

	public static void main(String[] args) {
		
		char opcion = ' ';
		sc = new Scanner(System.in);
		
	}
	
	private static void seleccionarOpcion() {
		char opcion = ' ';
		
		switch (opcion) {
		case '1':
			calculadora.suma();
			break;
		case '2':
			calculadora.suma();
			break;
		case '3':
			
			break;
		case '4':
			
			break;
		case '5':
			
			break;
		case '6':
			
			break;
		case '7':
			
			break;
		case '8':
			
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

}
