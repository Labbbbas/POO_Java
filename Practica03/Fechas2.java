import java.time.LocalDate; // Importamos la clase LocalDate del paquete java.time

public class Fechas2 {  // Creamos la clase Fechas2
	public static void main(String[] args){  // Creamos la clase Fechas2
		LocalDate hoy = LocalDate.now();  // Guardamos el contenido del metodo now() de la clase LocalDate dentro de la variable hoy. Se guardara la fecha actual del sistema
		System.out.println(hoy);  // Imprimimos el valor de la variable hoy, el cual es la fecha actual
		System.out.println(hoy.plusWeeks(1));  // Imprimimos la fecha dentro de 7 dias con el metodo plusWeeks() pasandole como argumento 1 (semana)
	}
}

