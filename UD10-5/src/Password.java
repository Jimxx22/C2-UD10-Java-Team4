
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
	
	public boolean esFuerte() {
		int numMayu = 0, numMinu = 0, numNum = 0;
		char caracter;
		
		for(int i = 0; i < longitud; i++) {
			caracter = contraseña.charAt(i);
			if(caracter > 64 && caracter < 91) {					//Si es mayuscula
				numMayu++;
			} else if ( caracter > 96 && caracter < 123 ) {			//Si es minuscula
				numMinu++;
			} else if( caracter > 47 && caracter < 58 ) {			//Si es numero
				numNum++;
			}
		}
		
		if( numMayu > 2 && numMinu > 1 && numNum > 5 ) {
			return true;
		} else {
			return false;
		}
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
