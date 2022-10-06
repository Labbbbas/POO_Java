public class PruebaConsola{
	public static void main(String[] args){
		Consola consola = new Consola();
		consola.setMarca("Sony");
		consola.setNombre("PS5");
		consola.setPrecio(14000);
		consola.setColor("Blanco");

		System.out.println("\n" + consola + "\n");
	}
}
