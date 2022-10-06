public class PruebaCelular{
	public static void main(String[] args){
		Celular celular = new Celular();
		celular.setMarca("Apple");
		celular.setModelo("iPhone 13");
		celular.setPrecio(20999);
		celular.setColor("Space Gray");

		System.out.println("\n" + celular + "\n");
	}
}
