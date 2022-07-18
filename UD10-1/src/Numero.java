
public class Numero {

	int numero;

	public Numero() {
		this.numero = (int) (Math.random()*(499+1))+1;
	}

	public int getNumero() {
		return numero;
	}
	
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
