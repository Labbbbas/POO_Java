public class InstrumentoViento extends Object implements InstrumentoMusical{

	// Por defecto, todos los metodos de la interfaz son publicos,
	// por lo tanto, asi se deben implementar
	
	public void tocar(){
		System.out.println("Tocando instrumento de viento.");
	}

	public void afinar(){
		System.out.println("Afinando instrumento de viento.");
	}

	public String tipoInstrumento(){
		return "Instrumento de viento";
	}
}
