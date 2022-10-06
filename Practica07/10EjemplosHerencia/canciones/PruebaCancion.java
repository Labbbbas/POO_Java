public class PruebaCancion{
	public static void main(String[] args){
		Cancion cancion = new Cancion();
		cancion.setArtista("Cuarteto de Nos");
		cancion.setNombre("Lo malo de ser bueno");
		cancion.setDuracion("4:02");
		cancion.setGenero("Rock");

		System.out.println("\n" + cancion + "\n");
	}
}

