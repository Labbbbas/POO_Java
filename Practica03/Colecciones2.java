import java.util.Hashtable;  // Importamos la clase Hashtable del paquete java.util

public class Colecciones2 {  // Creamos la clase publica Colecciones 2
	public static void main(String[] args){  // Creamos el metodo main
		Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();  // Instanciamos el objeto miTabla de tipo Hashtable<String, Integer> con ayuda del operador new y el metodo Hashtable<String, Integer>()
		miTabla.put("uno", 1);  // Insertamos los valores String e Integer en el objeto hashtable con el metodo put()
		miTabla.put("dos", 2);  // Insertamos los valores String e Integer en el objeto hashtable con el metodo put()
		miTabla.put("cinco", 5);  // Insertamos los valores String e Integer en el objeto hashtable con el metodo put()

		System.out.println("Contiene a cuatro?" + miTabla.containsKey("cuatro"));  // Imprimimos en pantalla el la respuesta a si nuestra hashtable contiene la llave "cuatro" con el metodo containsKey()
	
		for (String clave : miTabla.keySet()){  // Aplicamos un for each para recorrer todas las llaves de nuestra hashtable con el metodo keySet() mediante la variable clave
			System.out.println(clave);  // Imprimimos en pantalla el valor de la variable clave por cada ciclo
		}
		
		for (Integer valor : miTabla.values()){  // Aplicamos un for each para recorrer todas las llaves de nuestra hashtable con el metodo values() mediante la variable valor
			System.out.println(valor);  // Imprimimos la variable valor por cada ciclo
		}
	}
}
