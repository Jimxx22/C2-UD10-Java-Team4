package main;

import java.util.Scanner;

import clases.Calculadora;
import exceptions.ExceptionCustom;

public class MainApp {
	
	static Calculadora calculadora;
	static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		calculadora = new Calculadora();
		
		try {
			mostrarMenu();
			while(seleccionarOpcion()) {
				mostrarMenu();
			}
		} catch (ExceptionCustom e) {
			System.out.println("Error: "+e);
		}
		
		
	}
	
	private static boolean seleccionarOpcion() throws ExceptionCustom {
		String opcion;
		opcion = sc.next();
		
		switch (opcion) {
		case "1":
			calculadora.suma();
			break;
		case "2":
			calculadora.resta();
			break;
		case "3":
			calculadora.multiplicacion();
			break;
		case "4":
			calculadora.potencia();
			break;
		case "5":
			calculadora.raiz2();
			break;
		case "6":
			calculadora.raiz3();
			break;
		case "7":
			calculadora.division();
			break;
		case "8":
			//Salir del bucle principal
			System.out.println("╔══════════════════════════╗");
			System.out.println("║    Final del programa    ║");
			System.out.println("╚══════════════════════════╝");
			return false;
		default:
			throw new ExceptionCustom(200);
		}
		
		//seguir el bucle principal
		return true;
		
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
		System.out.print("Por favor introduce la selección [1-8]:");
	}

}
