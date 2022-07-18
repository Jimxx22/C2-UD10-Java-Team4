
public class Numero {

	int numero;

	// Constructor que genera número de 1 a 500
	public Numero() {
		this.numero = (int) (Math.random()*500)+1;
	}

	// Geter del número
	public int getNumero() {
		return numero;
	}
	
	// Método para comparar el número entrado para el usuario y el generado aleatoriamente
	public int masMenos(int n) {
		if(n>numero) {
			return 1;
		}else if(n<numero){
			return 0;
		}else {
			return -1;
		}
	}
}
