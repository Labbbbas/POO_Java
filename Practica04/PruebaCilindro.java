public class PruebaCilindro {
	public static void main(String[] args){
		Cilindro cilindro = new Cilindro();
		cilindro.altura = 10;
		cilindro.radio = 2;
		System.out.println("Altura = " + cilindro.altura );
		System.out.println("Radio = " + cilindro.radio);
		// Metodo area sobrecargado
		System.out.println("areaBase() -> " + cilindro.areaBase());
		System.out.println("areaLateral(2,10) -> " + cilindro.areaLateral(2,10));
		System.out.println("areaTotal() -> " + cilindro.areaTotal());
	}
}
