import java.util.Enumeration;  // Importamos la clase Enumeration del paquete java.util
import java.util.Hashtable;  // Importamos la clase Hashtable del paquete java.util

public class Colecciones3{  // Creamos la clase publica Colecciones3
	public static void main(String[] args){  // Creamos el metodo main
		
		Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();  // 
		miTabla.put("uno", 1);  // Ingresamos elementos a miTabla con el metodo put()
		miTabla.put("dos", 2);  // Ingresamos elementos a miTabla con el metodo put()
		miTabla.put("cinco", 5);  // Ingresamos elementos a miTabla con el metodo put()

		String clave;  // Declaramos la variable clave de tipo String
		Integer valor;  // Declaramos la variable valor de tipo Integer
		Enumeration<String> claves = miTabla.keys();  // Con ayuda del metodo keys() de la clase Enumeration guardamos todas las claves de miTabla dentro de la variable claves
		while(claves.hasMoreElements()){  // Con un ciclo while recorreremos todos los elementos de la variable clave mediante el metodo hasMoreElements(), el cual comprobara si el ciclo debe continuar o finalizar
			clave = claves.nextElement();  // Guardamos un elemento de claves a la vez en la variable clave por cada vuelta de ciclo con el metodo nextElement()
			valor = miTabla.get(clave);  // Guardamos un numero entero a la vez en la variable valor dependiendo del match que haga en miTabla en base a la clave proporcionada, gracias al metodo get()
			System.out.println("Clave: " + clave + "\tValor: " + valor);  // Imprimimos los valores correspondientes en cada vuelta de ciclo de la variable clave y  valor
		}
	}
}	
