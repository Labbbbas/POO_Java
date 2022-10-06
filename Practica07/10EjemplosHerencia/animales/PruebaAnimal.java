public class PruebaAnimal{
	public static void main(String[] args){
		Animal animal = new Animal();
		animal.setNombreComun("Tigre de Bengala");
		animal.setNombreCientifico("Panthera Tigris Tigris");
		animal.setFamilia("Felidae (Felinos)");
		animal.setGenero("Panthera");

		System.out.println("\n" + animal + "\n");
	}
}

