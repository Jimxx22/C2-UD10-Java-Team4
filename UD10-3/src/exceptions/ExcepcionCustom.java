package exceptions;

public class ExcepcionCustom extends Exception {
	
	private String mensaje;

	// Constructor que pide el código de error, si el código es 0 será par, si es 1 será impar
	public ExcepcionCustom(int num) {
		super();
		if(num == 0) {
			mensaje = "Es par";
		} else {
			mensaje = "Es impar";
		}
	}
	
	// Método que devuelve el mensaje
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}

}
