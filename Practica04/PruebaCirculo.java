public class PruebaCirculo {
	public static void main (String [] args){
		Circulo circulo = new Circulo();
		Circulo circulo2 = new Circulo();
		Circulo circulo3 = new Circulo();
		Circulo circulo4 = new Circulo();
		circulo.radio = 3;
		circulo2.radio = 5;
		circulo3.radio = 7;
		circulo4.radio = 10;

		System.out.println("\nradio: " + circulo.radio);
		System.out.println("pi: " + Math.PI);
		// Metodo area sobrecargado
		System.out.println("area(3) -> " + circulo.area());
		System.out.println("area(3) -> " + circulo.area(3));
		System.out.println("area(3f) -> " + circulo.area(3f));
		System.out.println("area(6f) -> " + circulo.areaDiametro(6f));
		// Metodo circunferencia/perimetro sobrecargado
		System.out.println("circunferenciaRadio(3f) -> " + circulo.circunferenciaRadio(3f));
		System.out.println("circunferenciaDiametro(6) -> " + circulo.circunferenciaDiametro(6) + "\n");

		System.out.println("\nradio: " + circulo2.radio);
                System.out.println("pi: " + Math.PI);
                // Metodo area sobrecargado
                System.out.println("area(5) -> " + circulo2.area());
                System.out.println("area(5) -> " + circulo2.area(5));
                System.out.println("area(5f) -> " + circulo2.area(5f));
                System.out.println("area(10f) -> " + circulo2.areaDiametro(10f));
                // Metodo circunferencia/perimetro sobrecargado
                System.out.println("circunferenciaRadio(5f) -> " + circulo2.circunferenciaRadio(5f));
                System.out.println("circunferenciaDiametro(10) -> " + circulo2.circunferenciaDiametro(10) + "\n");

		System.out.println("\nradio: " + circulo3.radio);
                System.out.println("pi: " + Math.PI);
                // Metodo area sobrecargado
                System.out.println("area(7) -> " + circulo3.area());
                System.out.println("area(7) -> " + circulo3.area(7));
                System.out.println("area(7f) -> " + circulo3.area(7f));
                System.out.println("area(14f) -> " + circulo3.areaDiametro(14f));
                // Metodo circunferencia/perimetro sobrecargado
                System.out.println("circunferenciaArea(7f) -> " + circulo3.circunferenciaRadio(7f));
                System.out.println("circunferenciaDiametro(14) -> " + circulo3.circunferenciaDiametro(14) + "\n");

		System.out.println("\nradio: " + circulo4.radio);
                System.out.println("pi: " + Math.PI);
                // Metodo area sobrecargado
                System.out.println("area(10) -> " + circulo4.area());
                System.out.println("area(10) -> " + circulo4.area(10));
                System.out.println("area(10f) -> " + circulo4.area(10f));
                System.out.println("area(20f) -> " + circulo4.areaDiametro(20f));
                // Metodo circunferencia/perimetro sobrecargado
                System.out.println("circunferenciaArea(10f) -> " + circulo4.circunferenciaRadio(10f));
                System.out.println("circunferenciaDiametro(20) -> " + circulo4.circunferenciaDiametro(20) + "\n");
	}
}
