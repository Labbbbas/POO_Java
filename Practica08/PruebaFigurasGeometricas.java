public class PruebaFigurasGeometricas{

	public static void main(String[] args){
		Poligono poligono = new Poligono();
		// Poligono puede comportarse como Objeto
		Object objeto = poligono;
		System.out.println(objeto);
		
		// Una referencia puede ser reasignada a otros objetos
		poligono = new Triangulo();
		System.out.println(poligono);
		poligono = new Cuadrilatero();
		System.out.println(poligono);

		// Solo se pueden ejecutar los metodos que estan definidos
		// en la referencia, sin embargo, se ejecutaran como estan
		// implementados en la instancia.
		// El metodo toString se puede ejecutar porque esta definido
		// en Poligono, sin embargo, se va a ejecutar como esta
		// implementado en la instancia (Cuadrilatero en este caso).
		System.out.println(poligono);
		// El metodo setBase no esta definido en Poligono, por lo tanto
		// poligono.setBase(5.5);
	}
}
