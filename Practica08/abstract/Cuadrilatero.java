public class Cuadrilatero extends Poligono{
	
	private int alfa, beta;

	private float a, b;

	private float base, altura;

	// La clase Cuadrilatero esta obligada a sobrescribir los metodos
	// abstractos que definio la clase abstracta de la que hereda.
	
	public double area(){
		return base*altura;
	}

	public double perimetro(){
		return 2*a*b;
	}

	public String toString(){
		return "Cuadrilatero";
	}
}
