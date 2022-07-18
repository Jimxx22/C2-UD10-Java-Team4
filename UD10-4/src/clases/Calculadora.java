package clases;

public class Calculadora {

	private double n1;
	private double n2;
	
	// Constructor de la calculadora con 2 números
	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// Constructor de la calculadora con 1 número
	public Calculadora(int n1) {
		this.n1 = n1;
	}

	// Geters y seters
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	// Métodos para calcular la suma, resta, multiplicación, división, potencia, raíz cuadrada y cúbica
	public double suma() {
		return n1+n2;
	}
	
	public double resta() {
		return n1-n2;
	}
	
	public double multiplicacion() {
		return n1*n2;
	}
	
	public double division() {
		return n1/n2;
	}
	
	public double potencia() {
		return Math.pow(n1, n2);
	}
	
	public double raiz2() {
		return Math.sqrt(n1);
	}
	
	public double raiz3() {
		return Math.cbrt(n1);
	}
}
