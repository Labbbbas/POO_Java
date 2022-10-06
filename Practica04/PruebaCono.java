public class PruebaCono {
	public static void main(String[] args){
		Cono cono = new Cono();
		cono.altura = 15;
		cono.radio = 5;
		System.out.println("Altura = " + cono.altura);
		System.out.println("Radio = " + cono.radio);
		// Metodos de area sobrecargados
		System.out.println("generatriz() -> " + cono.generatriz());
		System.out.println("areaLateral() -> " + cono.areaLateral());
		System.out.println("areaBase() " + cono.areaBase());
		System.out.println("areaTotal() -> " + cono.areaTotal());
	}
}
