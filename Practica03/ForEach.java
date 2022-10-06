public class ForEach{  // declaramos la clase ForEach la cual es publica
	public static void main(String[] args){  // declaramos el metodo main
		int [] nums = {4, 6, 30, 15};  // declaramos e inicializamos un arreglo de tipo entero llamado nums
		for(int n : nums){  // recorremos con un for el arreglo nums con la variable n
			System.out.println(n);  // imprimimos en pantalla el valor de la variable n por cada vuelta de ciclo que de
		}
	}
}
