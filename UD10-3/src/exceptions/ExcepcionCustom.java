package exceptions;

public class ExcepcionCustom extends Exception {
	
	private String mensaje;

	public ExcepcionCustom(int num) {
		super();
		if(num == 0) {
			mensaje = "Es par";
		} else {
			mensaje = "Es impar";
		}
	}
	
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}

}
