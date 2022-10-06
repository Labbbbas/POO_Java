public class PruebaCuadrado {
	public static void main (String[] args){
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.lado = 5;
		System.out.println("Lado: " + cuadrado.lado);
		// Metodo de area sobrecargado
		System.out.println("area() -> " + cuadrado.area());
		System.out.println("area(10) -> " + cuadrado.area(10));
		System.out.println("area(7.2f) -> " + cuadrado.area(7.2f));
	}
}
