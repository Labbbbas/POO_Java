public class PruebaEsfera{
	public static void main(String[] args){
		Esfera esfera = new Esfera();
		esfera.radio = 10;
		System.out.println("Radio = " + esfera.radio);
		// Metodo area y volumen sobrecargado
		System.out.println("area(10) -> " + esfera.area(10));
		System.out.println("volumen(10) -> " + esfera.volumen(10f));
	}
}
