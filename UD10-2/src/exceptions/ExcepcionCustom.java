package exceptions;

public class ExcepcionCustom extends Exception {
	
	private String mensaje;

	// Constructor de la excepción con el mensaje
	public ExcepcionCustom() {
		super();
		this.mensaje = "Esto es un Objeto Exception";
	}
	
	// Método getMessatge retornando el mensaje de error
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}

}
