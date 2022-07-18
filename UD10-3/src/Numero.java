
public class Numero {

	int numero;

	// Constructor que genera número de 1 a 500
	public Numero() {
		this.numero = (int) (Math.random()*999);
	}

	// Geter del número
	public int getNumero() {
		return numero;
	}
	
	// Método para comparar el número entrado es par o impar
	public int parImpar() {
		return numero%2;
	}

	// Método toString
	@Override
	public String toString() {
		return "El numero aleatorio generado es: "+ numero;
	}
	
	
}
