public class PruebaVideojuego{
	public static void main(String[] args){
		Videojuego videojuego = new Videojuego();
		videojuego.setEstudio("Insomniac Games");
		videojuego.setNombre("Marvel's Spiderman");
		videojuego.setPrecio(800);
		videojuego.setGenero("Acción y Aventura");

		System.out.println("\n" + videojuego + "\n");
	}
}

