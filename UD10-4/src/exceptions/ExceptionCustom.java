package exceptions;

public class ExceptionCustom extends Exception {
	
	private int codigoError;
	
	public ExceptionCustom(int codigo) {
		super();
		this.codigoError = codigo;
	}

	//Devuelve el mensaje de error dependiendo el codigo de error;
	@Override
	public String getMessage() {
		String mensaje = "";
		switch (codigoError) {
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
