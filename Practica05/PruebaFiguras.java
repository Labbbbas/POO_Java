public class PruebaFiguras{

	public static void main(String[] args){
		Circulo cir1 = new Circulo();
		Circulo cir2 = new Circulo();
		cir1.setRadio(7.2f);
		cir2.setRadio(-3);
		System.out.println("El area con radio 7.2 es " + cir1.area());
	//	System.out.println("El area con radio -3 es " + cir2.area());
	}
}
