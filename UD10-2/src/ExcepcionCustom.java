
public class ExcepcionCustom extends Exception {
	
	private String mensaje;

	public ExcepcionCustom() {
		super();
		this.mensaje = "Esto es un Objeto Exception";
	}
	
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}

}
