public class PruebaTrapecio {
	public static void main (String[] args){
		Trapecio trapecio = new Trapecio();
		trapecio.base1 = 7;
		trapecio.base2 = 5;
		trapecio.altura = 4;
		System.out.println("Base Mayor = " + trapecio.base1);
		System.out.println("Base Menor = " + trapecio.base2);
		System.out.println("Altura = " + trapecio.altura);
		// Metodo de area sobrecargado
		System.out.println("area() -> " + trapecio.area());
		System.out.println("area(6,4,3) -> " + trapecio.area(6,4,3));
		System.out.println("area(10.2f,8.5f,5.6f) -> " + trapecio.area(10.2f,8.5f,5.6f));
	}
}
