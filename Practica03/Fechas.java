import java.text.SimpleDateFormat;  // Importamos la clase SimpleDateFormat del paquete java.text
import java.util.Calendar;  // Importamos la clase Calendar del paquete java.util
import java.util.Date;  // Importamos la clase Date del paquete java.util

public class Fechas{  // Creamos la clase publica Fechas
	public static void main(String[] args){  // Creamos el metodo main
		Date fecha = new Date();  // Instanciamos el objeto fecha de la clase Date
		System.out.println(fecha.toString());  // Imprimimos el metodo toString() del objeto fecha en pantalla, lo cual imprimira la fecha de hoy con un formato por defecto
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");  // Instanciamos el objeto formateador de la clase SimpleDateFormat con parametro "dd-MM-yyyy"
		System.out.println(formateador.format(fecha));  // Imprimimos en pantalla el metodo format() del objeto formateador pasandole por parametro el objeto fecha, lo cual imprimira la fecha de hoy con el formato indicado

		Calendar calendario = Calendar.getInstance();  // Guardamos el valor de Calendar.getInstance() dentro de calendario
		String miFecha = "Hoy es dia ";  // Declaramos la variable miFecha de tipo String y la inicializamos con un texto
		miFecha += calendario.get(Calendar.DAY_OF_MONTH) + " del mes ";  // Concatenamos el dia actual mas un texto a la variable miFecha con el metodo get(Calendar.DAY_OF_MONTH)
		miFecha += calendario.get(Calendar.MONTH) + 1 + " de ";  // Concatenamos el mes actual mas 1 porque los meses estan almacenados a partir del indice 0, entonces se suma 1 para que los numeros de los meses coincidan con los reales, mas texto, a la variable miFecha con ayuda del metodo get(Calendar.MONTH)
		miFecha += calendario.get(Calendar.YEAR);  // Concatenamos el ano actual a la variable miFecha con ayuda del metodo get(Calendar.YEAR)
		System.out.println(miFecha);  // Imprimimos el valor de la variable miFecha, la cual contendra toda la fecha actual con formato gracias a los metodos utilizados y la concatenacion de texto
	}
}
