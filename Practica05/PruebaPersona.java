public class PruebaPersona{
	
	public static void main(String[] args){
		Persona per1 = new Persona();
		Fecha nac1 = new Fecha();
                Domicilio dom1 = new Domicilio();

		per1.setNombre("Juan");
		per1.setApellido("López");
		nac1.setDia(28);
		nac1.setMes(8);
		nac1.setAnio(2001);
		/*
		dom1.setCalle("");
		dom1.setNumero(14);
		dom1.setColonia("Narvarte");
		dom1.setEstado("CDMX");
		dom1.setDelegacion("Benito Juarez");
		dom1.setCodPos("03000");*/
		per1.setFNacimiento(nac1);
		//per1.setDomicilio(dom1);
		
		//System.out.println("\nDATOS PERSONA 1");
                System.out.println("Nombre: " + per1.getNombre());
                System.out.println("Apellido: " + per1.getApellido());
                System.out.println("Fecha de Nacimiento: " + per1.getFNacimiento().getDia() + "/" + per1.getFNacimiento().getMes() + "/" + per1.getFNacimiento().getAnio());
                //System.out.println("Domicilio: Calle " +per1.getDomicilio().getCalle() + " #" + per1.getDomicilio().getNumero() + " Colonia " + per1.getDomicilio().getColonia() + " Estado " + per1.getDomicilio().getEstado() + " Delegación " + per1.getDomicilio().getDelegacion() + " Código Postal " + per1.getDomicilio().getCodPos() + "\n");

		/*System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		Persona per2 = new Persona();
                Fecha nac2 = new Fecha();
                Domicilio dom2 = new Domicilio();

                per2.setNombre("Juana");
                per2.setApellido("Sanchez");
                nac2.setDia(-27);
                nac2.setMes(2);
                nac2.setAnio(2002);
                dom2.setCalle("22");
                dom2.setNumero(15);
                dom2.setColonia("Juan Escutia");
                dom2.setEstado("CDMX");
                dom2.setDelegacion("Iztapalapa");
                dom2.setCodPos("09000");
                per2.setFNacimiento(nac2);
                per2.setDomicilio(dom2);

                System.out.println("\nDATOS PERSONA 2");
                System.out.println("Nombre: " + per2.getNombre());
                System.out.println("Apellido: " + per2.getApellido());
                System.out.println("Fecha de Nacimiento: " + per2.getFNacimiento().getDia() + "/" + per2.getFNacimiento().getMes() + "/" + per2.getFNacimiento().getAnio());
                System.out.println("Domicilio: Calle " +per2.getDomicilio().getCalle() + " #" + per2.getDomicilio().getNumero() + " Colonia " + per2.getDomicilio().getColonia() + " Estado " + per2.getDomicilio().getEstado() + " Delegación " + per2.getDomicilio().getDelegacion() + " Código Postal " + per2.getDomicilio().getCodPos() + "\n");*/
	}
}
