
public class ExcepcionCustom extends Exception {
	
	private String mensaje;

	public ExcepcionCustom(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}

}
