public class Persona{
	private String nombre;
	private String apellido;
	private Fecha fNacimiento;
	private Domicilio domicilio;

	public Persona(){
	}

	public Persona(String nombre, String apellido, Fecha fNacimiento, Domicilio domicilio){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.domicilio = domicilio;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		if(nombre.length() > 0){
			this.nombre = nombre;
		}
		else{
			System.out.println("No ingresaste un nombre");
		}
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		if(apellido.length() > 0){
			this.apellido = apellido;
		}
		else{
			System.out.println("No ingresaste un apellido");	
		}
	}

	public Fecha getFNacimiento(){
		return fNacimiento;
	}

	public void setFNacimiento(Fecha fNacimiento){
		this.fNacimiento = fNacimiento;
	}

	public Domicilio getDomicilio(){
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio){
		this.domicilio = domicilio;
	}
}
