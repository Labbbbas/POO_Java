package mx.unam.fi.poo;

public class Persona{
	private String nombre;
	private String apellido;
	private Fecha fNacimiento;

	public Persona(){
		fNacimiento = new Fecha();
	}

	public Persona(String nombre, String apellido, int fDia, int fMes, int fAnio){
		this.nombre = nombre;
		this.apellido = apellido;
		fNacimiento.setDia(fDia);
		fNacimiento.setMes(fMes);
		fNacimiento.setAnio(fAnio);
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

	public void setFNacimiento(int dia, int mes, int anio){
		fNacimiento.setDia(dia);
		fNacimiento.setMes(mes);
		fNacimiento.setAnio(anio);
	}

	public Fecha getFNacimiento(){
                return fNacimiento;
        }
}
