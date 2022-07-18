import java.util.Scanner;

public class MainApp {
	
	static Password[] passwords; 
	static Boolean[] fuerte;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//Iniciamos la generar passwords
		generarPassword();

	}
	
	public static void generarPassword() {
		
		int lArray, lPass;
		try {
			//Indicamos el numero de passwords que queremos crear y su longitud
			System.out.print("Indica cuantas contrasenas quieres generar: ");
			lArray=Integer.parseInt(sc.nextLine());
			
			passwords = new Password[lArray];
			
			System.out.print("Indica la longitud de las contrasenas: ");
			lPass=Integer.parseInt(sc.nextLine());
			
			//Rellenamos los arrays con las contraseñas y los booleanos
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
