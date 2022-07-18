package clases;

public class Calculadora {
	
	// Constructor de la calculadora
	public Calculadora() {}
	
	// Métodos para calcular la suma, resta, multiplicación, división, potencia, raíz cuadrada y cúbica
	public double suma(double n1, double n2) {
		return n1+n2;
	}
	
	public double resta(double n1, double n2) {
		return n1-n2;
	}
	
	public double multiplicacion(double n1, double n2) {
		return n1*n2;
	}
	
	public double division(double n1, double n2) {
		return n1/n2;
	}
	
	public double potencia(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	public double raiz2(double n1) {
		return Math.sqrt(n1);
	}
	
	public double raiz3(double n1) {
		return Math.cbrt(n1);
	}
}
