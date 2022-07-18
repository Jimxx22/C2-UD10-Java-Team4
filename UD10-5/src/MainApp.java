import java.util.Scanner;

public class MainApp {
	
	static Password[] passwords; 
	static Boolean[] fuerte;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		generarPassword();

	}
	
	public static void generarPassword() {
		
		int lArray, lPass;
		try {
			System.out.print("Indica cuantas contrasenas quieres generar: ");
			lArray=Integer.parseInt(sc.nextLine());
			
			passwords = new Password[lArray];
			
			System.out.print("Indica la longitud de las contrasenas; ");
			lPass=Integer.parseInt(sc.nextLine());
			
			for (int i = 0; i < passwords.length; i++) {
				passwords[i]=new Password(lPass);
				fuerte[i]=passwords[i].esFuerte();
				
				System.out.println(passwords[i].getContraseña()+" - "+fuerte[i]);
			}
			
			
		} catch (NumberFormatException nfe) { // Miramos si la entrada es un número
			System.out.println("No se ha podido reconocer la entrada del numero");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
