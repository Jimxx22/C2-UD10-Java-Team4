import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startApp();
		
	}
	
	public static void startApp () {
		Scanner sc = new Scanner (System.in);
		Numero num = new Numero();
		int num1, resultado = 0;
		
		try {
			while (resultado != -1) {
				num1 = recogerNumero(sc);
				resultado = num.masMenos(num1);
				if (resultado == 0 ) {
					System.out.println("El numero es mayor al indicado");
				}else if (resultado == 1) {
					System.out.println("El numero es menor al indicado");
				}else if (resultado == -1) {
					System.out.println("Has adivinado el numero");
				}
			}
			
		} catch (InputMismatchException e) {
			System.out.println("No se ha podido reconocer la entrada del numero");
		}
		
	}
	
	public static int recogerNumero (Scanner sc) throws  InputMismatchException {
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		
		return num;
	}
	
	

}
