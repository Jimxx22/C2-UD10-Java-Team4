package exceptions;

public class ExceptionCustom extends Exception {
	
	private int num;
	
	public ExceptionCustom(int num) {
		super();
		this.num = num;
	}

	//Devuelve el mensaje de error si el numero es negativo;
	@Override
	public String getMessage() {
		String mensaje = "";
		switch (num) {
		case 111:
			mensaje = "El numero es negativo";
			break;
		case 200:
			mensaje = "Entrada no reconocida";
			break;
		default:
			break;
		}
		return mensaje;
		
	}
}
