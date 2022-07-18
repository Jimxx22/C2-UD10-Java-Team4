import java.util.InputMismatchException;
import java.util.Scanner;

import oracle.jrockit.jfr.Recording;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Numero num = new Numero();
		int num1 = 0;
		
		try {
			num1 = recogerNumero(sc);
			int resltado = num.masMenos(num1);
			
			
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
