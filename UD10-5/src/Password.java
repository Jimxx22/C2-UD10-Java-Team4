
public class Password {
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = generarContraseña();
	}
	
	//Constructor pasandole la longitud de la contraseña
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña();
	}
	
	//Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	//Metodo para generar las contraseñas
	private String generarContraseña() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String pwd = "";
		
		for (int i = 0; i < longitud; i++) {
			pwd += chars.charAt((int)(Math.random()*chars.length()));
		}
		
		return pwd;
	}
	
	
}
