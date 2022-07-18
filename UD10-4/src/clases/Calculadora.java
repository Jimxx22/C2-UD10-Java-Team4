package clases;

import java.util.Scanner;
import exceptions.ExceptionCustom;

public class Calculadora {
	Scanner sc = new Scanner(System.in);
	
	// Constructor de la calculadora
	public Calculadora() {}
	
	// Métodos para calcular la suma, resta, multiplicación, división, potencia, raíz cuadrada y cúbica
	public void suma(){
		try {
			String n1,n2;
			double res;
			System.out.println("Suma");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextLine();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextLine();
			res = Double.parseDouble(n1)+Double.parseDouble(n2);
			System.out.println("El resultado es: "+res);
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void resta(){
		try {
			String n1,n2;
			double res;
			System.out.println("Resta");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextLine();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextLine();
			res = Double.parseDouble(n1)-Double.parseDouble(n2);;
			System.out.println("El resultado es: "+res);
		}catch (NumberFormatException nfe) { // Miramos si la entrada es un número
				System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void multiplicacion(){
		try {
			String n1,n2;
			double res;
			System.out.println("Multiplicación");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextLine();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextLine();
			res = Double.parseDouble(n1)*Double.parseDouble(n2);;
			System.out.println("El resultado es: "+res);
		}catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void division(){
		try {
			String n1,n2;
			double res;
			System.out.println("División");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextLine();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextLine();
			res = Double.parseDouble(n1)/Double.parseDouble(n2);;
			System.out.println("El resultado es: "+res);
		} catch (ArithmeticException ae) { // Comprobamos que lel divisor no es 0
			System.out.println("No se puede dividir entre 0");
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void potencia(){
		try {
			String s1,s2;
			double res, n1, n2;
			System.out.println("Potencia");
			System.out.println("Introduce la base: ");
			s1 = sc.nextLine();
			System.out.println("Introduce el exponente: ");
			s2 = sc.nextLine();
			n1=Double.parseDouble(s1);
			n2=Double.parseDouble(s2);
			res =  Math.pow(n1, n2);
			System.out.println("El resultado es: "+res);
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void raiz2(){
		try {
			String n1;
			double res, n2;
			System.out.println("Raíz cuadrada");
			System.out.println("Introduce el numero: ");
			n1 = sc.nextLine();
			n2=Double.parseDouble(n1);
			if(n2<=0) {
				throw new ExceptionCustom(111);
			}
			
			res =  Math.sqrt(n2);
			System.out.println("El resultado es: "+res);
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (ExceptionCustom ec) { // Comprobamos que la entrada es mayor a 0
			System.out.println(ec.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void raiz3(){
		try {
			String n1;
			double res, n2;
			System.out.println("Raíz cúbica");
			System.out.println("Introduce el numero: ");
			n1 = sc.nextLine();
			n2=Double.parseDouble(n1);
			if(n2<=0) {
				throw new ExceptionCustom(111);
			}
			
			res =  Math.cbrt(n2);
			System.out.println("El resultado es: "+res);
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (ExceptionCustom ec) { // Comprobamos que la entrada es mayor a 0
			System.out.println(ec.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
