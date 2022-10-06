public class Ejemplo{  // creamos la clase publica Ejemplo

	public static void main(String[] args) {  // creamos el metodo main
		System.out.println(args[0]);  // Imprimimos en pantalla el primer argumento
		System.out.println(args[1]);  // Imprimimos en pantalla el segundo argumento
		System.out.println(args[2]);  // Imprimimos en pantalla el tercer argumento

		// Ahora se imprimira todo en una sola linea:
		System.out.println("Ahora imprimiendolo todo en una sola linea:");  // texto indicandole al usuario lo que sucedera
		System.out.println(args[0] + " " + args[1] + " " + args[2]);  // Concatenamos los argumentos con el operador + y  le damos un espacio entre cada uno con " "
	}
}
