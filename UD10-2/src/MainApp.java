import exceptions.ExcepcionCustom;

public class MainApp {

	public static void main(String[] args) {

		// try catch que lanza una execepción de la clase ExcepcionCustom
		// Mostrará el mensaje de error establecido en el getMessatge
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new ExcepcionCustom();
		} catch (ExcepcionCustom e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Programa terminado");
		}

	}

}
