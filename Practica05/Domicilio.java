public class Domicilio{
	private String calle;
	private int numero;
	private String colonia;
	private String estado;
	private String delegacion;
	private String codPos;

	public Domicilio(){
	}

	public Domicilio(String calle, int numero, String colonia, String estado, String delegacion, String codPos){
		setCalle(calle);
		setNumero(numero);
		setColonia(colonia);
		setEstado(estado);
		setDelegacion(delegacion);
		setCodPos(codPos);
	}

	public String getCalle(){
		return calle;
	}

	public void setCalle(String calle){
		if(calle.length() > 0){
			this.calle = calle;
		}
		else{
			System.out.println("No ingresaste una calle");
		}
	}

	public int getNumero(){
		return numero;
	}

	public void setNumero(int numero){
		if(numero > 0){
			this.numero = numero;
		}
		else{
			System.out.println("Número no válido");
		}
	}

	public String getColonia(){
		return colonia;
	}

	public void setColonia(String colonia){
		if(colonia.length() > 0){
			this.colonia = colonia;
		}
		else{
			System.out.println("No ingresaste una colonia");
		}
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		if(estado.length() > 0){
			this.estado = estado;
		}
		else{
			System.out.println("No ingresaste un estado");
		}
	}

	public String getDelegacion(){
		return delegacion;
	}

	public void setDelegacion(String delegacion){
		if(delegacion.length() > 0){
			this.delegacion = delegacion;
		}
		else{
			System.out.println("No ingresaste una delegación");
		}
	}

	public String getCodPos(){
		return codPos;
	}

	public void setCodPos(String codPos){
		if(codPos.length() == 5){
			this.codPos = codPos;
		}
		else{
			System.out.println("Código Postal no válido");
		}
	}
}
