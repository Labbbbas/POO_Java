public class PruebaInstrumento{

	public static void main(String[] artgs){

		// Se puede crear una referencia de una interfaz.
		InstrumentoMusical instrumento;

		// Pero no es posible crear una instancia de una interfaz.
		// instrumento = new InstrumentoMusical();
		
		// Una referencia a interfaz puede ser asiganada cualquier
		// objeto que la implemente.
		
		instrumento = new Flauta();
		instrumento.tocar();
		System.out.println(instrumento.tipoInstrumento());
	}
}
