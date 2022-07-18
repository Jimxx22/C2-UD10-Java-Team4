
public class Password {

	
	private boolean esFuerte() {
		int numMayu = 0, numMinu = 0, numNum = 0;
		int longitud = 0;
		String contrasena = "";
		char caracter;
		
		for(int i = 0; i < longitud; i++) {
			caracter = contrasena.charAt(i);
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
}
