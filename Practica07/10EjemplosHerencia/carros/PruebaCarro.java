public class PruebaCarro{
	public static void main(String[] args){
		Carro carro = new Carro();
		carro.setMarca("Tesla");
		carro.setModelo("Model 3");
		carro.setPrecio(1168300);
		carro.setColor("Rojo");
	
		System.out.println("\n" + carro + "\n");
	}
}
