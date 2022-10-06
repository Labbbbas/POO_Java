public class PruebaRefresco{
	public static void main(String[] args){
		MiRefresco mirefresco = new MiRefresco();
		mirefresco.setGrupo("PepsiCo");
		mirefresco.setNombre("Mirinda");
		mirefresco.setPrecio(12);
		mirefresco.setSabor("Naranja");

		System.out.println("\n" + mirefresco + "\n");
	}
}
