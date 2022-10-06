public class PruebaMeses{
	
	public static void main(String[] args){
		
		// Se puede acceder a las variables de la interfaz sin crear instancias
		System.out.println("El mes " + Meses.DOS + " corresponde a:");
		System.out.println(Meses.NOMBRES_MESES[Meses.DOS]);
	}
}
