import exceptions.ExcepcionCustom;

public class MainApp {

	public static void main(String[] args) {
		
		// try catch que lanza una execepción de la clase ExcepcionCustom
		// Mostrará el mensaje de dependiendo del código pasado será uno u otro
		try {
			System.out.println("Generando número aleatorio...");
			Numero numero = new Numero();
			System.out.println(numero);
			throw new ExcepcionCustom(numero.parImpar());
		} catch (ExcepcionCustom e) {
			System.out.println(e.getMessage());
		}
	}

}
