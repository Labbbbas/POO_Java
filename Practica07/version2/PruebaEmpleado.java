public class PruebaEmpleado{
        public static void main(String[] args){
                Gerente gerente = new Gerente();
                gerente.setNombre("Luis Aguilar");
                gerente.setNumEmpleado(8524);
                gerente.setSueldo(16000);
                gerente.setPresupuesto(50000);
		// Se manda a llamar el metodo toString, el cual
		// fue sobrescrito en la clase Empleado
		System.out.println(gerente);
        }
}

