package clases;

import java.util.Scanner;

public class Calculadora {
	Scanner sc = new Scanner(System.in);
	// Constructor de la calculadora
	public Calculadora() {}
	
	// Métodos para calcular la suma, resta, multiplicación, división, potencia, raíz cuadrada y cúbica
	public void suma() {
		try {
			double n1, n2, res;
			System.out.println("Suma");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextDouble();
			res = n1+n2;
			System.out.println("El resultado es: "+res);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void resta() {
		
		double n1, n2, res;
		System.out.println("Resta");
		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextDouble();
		res = n1-n2;
		System.out.println("El resultado es: "+res);
		
	}
	
	public void multiplicacion() {
		
		double n1, n2, res;
		System.out.println("Multiplicación");
		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextDouble();
		res = n1*n2;
		System.out.println("El resultado es: "+res);
		
	}
	
	public void division() {
		
		double n1, n2, res;
		System.out.println("División");
		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextDouble();
		res = n1/n2;
		System.out.println("El resultado es: "+res);
		
	}
	
	public void potencia() {
		
		double n1, n2, res;
		System.out.println("Potencia");
		System.out.println("Introduce la base: ");
		n1 = sc.nextDouble();
		System.out.println("Introduce el exponente: ");
		n2 = sc.nextDouble();
		res =  Math.pow(n1, n2);
		System.out.println("El resultado es: "+res);
		
	}
	
	public void raiz2() {
		
		double n1, res;
		System.out.println("Raíz cuadrada");
		System.out.println("Introduce el numero: ");
		n1 = sc.nextDouble();
		res =  Math.sqrt(n1);
		System.out.println("El resultado es: "+res);

	}
	
	public void raiz3() {
		
		double n1, res;
		System.out.println("Raíz cúbica");
		System.out.println("Introduce el numero: ");
		n1 = sc.nextDouble();
		res =  Math.cbrt(n1);
		System.out.println("El resultado es: "+res);
		
	}
}
