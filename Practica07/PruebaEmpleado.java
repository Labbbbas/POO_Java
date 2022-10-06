public class PruebaEmpleado{
	public static void main(String[] args){
		Gerente gerente = new Gerente();
		// Gerente hereda todos los atributos y metodos
		// de la clase Empleado (reutiliza codigo)
		gerente.setNombre("Luis Aguilar");
		gerente.setNumEmpleado(8524);
		gerente.setSueldo(16000);
		System.out.println("Nombre: " + gerente.getNombre());
		System.out.println("Numero de Empleado: " + gerente.getNumEmpleado());
		System.out.println("Sueldo: " + gerente.getSueldo());
		gerente.aumentarSueldo(10);
		System.out.println("Nuevo sueldo: " + gerente.getSueldo());
		// Y tiene metodos y atributos propios
		gerente.setPresupuesto(50000);
		System.out.println("Presupuesto: " + gerente.getPresupuesto());
		gerente.asignarPresupuesto(65000);
		System.out.println("Nuevo presupuesto: " + gerente.getPresupuesto());
	}
}
