package clases;

import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.ExceptionCustom;

public class Calculadora {
	Scanner sc = new Scanner(System.in);
	
	// Constructor de la calculadora
	public Calculadora() {}
	
	// Métodos para calcular la suma, resta, multiplicación, división, potencia, raíz cuadrada y cúbica
	public void suma() throws InputMismatchException{
		try {
			double n1, n2, res;
			System.out.println("Suma");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextDouble();
			res = n1+n2;
			System.out.println("El resultado es: "+res);
		} catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void resta() throws InputMismatchException{
		try {
			double n1, n2, res;
			System.out.println("Resta");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextDouble();
			res = n1-n2;
			System.out.println("El resultado es: "+res);
		}catch (InputMismatchException ime) { // Miramos si la entrada es un número
				System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void multiplicacion() throws InputMismatchException{
		try {
			double n1, n2, res;
			System.out.println("Multiplicación");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextDouble();
			res = n1*n2;
			System.out.println("El resultado es: "+res);
		}catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void division() throws InputMismatchException, ArithmeticException{
		try {
			double n1, n2, res;
			System.out.println("División");
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextDouble();
			res = n1/n2;
			System.out.println("El resultado es: "+res);
		} catch (ArithmeticException ae) { // Comprobamos que lel divisor no es 0
			System.out.println("No se puede dividir entre 0");
		} catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void potencia() throws InputMismatchException{
		try {
			double n1, n2, res;
			System.out.println("Potencia");
			System.out.println("Introduce la base: ");
			n1 = sc.nextDouble();
			System.out.println("Introduce el exponente: ");
			n2 = sc.nextDouble();
			res =  Math.pow(n1, n2);
			System.out.println("El resultado es: "+res);
		} catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void raiz2() throws InputMismatchException, ExceptionCustom{
		try {
			double n1, res;
			System.out.println("Raíz cuadrada");
			System.out.println("Introduce el numero: ");
			n1 = sc.nextDouble();
			
			if(n1<=0) {
				throw new ExceptionCustom(111);
			}
			
			res =  Math.sqrt(n1);
			System.out.println("El resultado es: "+res);
		} catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (ExceptionCustom ec) { // Comprobamos que la entrada es mayor a 0
			System.out.println(ec.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void raiz3() throws InputMismatchException, ExceptionCustom{
		try {
			double n1, res;
			System.out.println("Raíz cúbica");
			System.out.println("Introduce el numero: ");
			n1 = sc.nextDouble();
			
			if(n1<=0) {
				throw new ExceptionCustom(111);
			}
			
			res =  Math.cbrt(n1);
			System.out.println("El resultado es: "+res);
		} catch (InputMismatchException ime) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (ExceptionCustom ec) { // Comprobamos que la entrada es mayor a 0
			System.out.println(ec.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
