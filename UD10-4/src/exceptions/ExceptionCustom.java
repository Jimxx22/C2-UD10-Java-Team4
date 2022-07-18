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
		if (num < 0) {
			mensaje = "El numero es negativo";
		}
		return mensaje;
		
	}
}
