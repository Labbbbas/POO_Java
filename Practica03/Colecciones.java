import java.util.ArrayList;  // Importamos la clase ArrayList que se encuentra dentro del paquete java.util

public class Colecciones {  // Creamos la clase publica Colecciones 

	public static void main(String[] args) {  // Declaramos el metodo main
		ArrayList<Integer> arreglo = new ArrayList<Integer>();  // Instanciamos el objeto llamado arreglo de tipo ArrayList<Integer> con ayuda del operador new y el metodo ArrayList<Integer>()
		arreglo.add(1);  // Agregamos el numero 1 a nuestro objeto llamado arreglo con el operador punto del metodo add()
		arreglo.add(8);  // Agregamos el numero 8 a nuestro objeto llamado arreglo con el operador punto del metodo add()
		arreglo.add(5);  // Agregamos el numero 5 a nuestro objeto llamado arreglo con el operador punto del metodo add()
		arreglo.add(1, 9);  // Agregamos el numero 1 y 9 a nuestro objeto llamado arreglo con el operador punto del metodo add()
		System.out.println("Tamaño del array list: " + arreglo.size());  // Imprimimos en pantalla el tamano del arreglo con el metodo size()
		System.out.println("Elemento en la posicion 3: " + arreglo.get(3));  // Imprimimos en pantalla el elemento del arreglo que se encuentra en la posicion 3 con el metodo get()
		for (Integer elemento : arreglo){  // Creamos un metodo for para recorrer el arreglo mediante la variable elemento
			System.out.println(elemento);  // Imprimimos en pantalla el valor de la variable elemento cada vuelta de ciclo
		}
	}	
}
