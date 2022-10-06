public class PruebaRombo{
	public static void main (String[] args){
		Rombo rombo = new Rombo();
		rombo.diametroMayor = 10;
		rombo.diametroMenor = 7;
		System.out.println("Diametro Mayor = " + rombo.diametroMayor);
		System.out.println("Diametro Menor = " + rombo.diametroMenor);
		// Metodo de area sobrecargado
		System.out.println("area() -> " + rombo.area());
		System.out.println("area(12,10) -> " + rombo.area(12,10));
		System.out.println("area(8.5f,6.5f) -> " + rombo.area(8.5f,6.5f));
	}
}
