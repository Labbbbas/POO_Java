public class Frutas{
	private String nombreComun, nombreCientifico, origen;
	
	public void setNombreComun(String nombreComun){
		if(nombreComun.length() != 0){
			this.nombreComun = nombreComun;
		}
		else{
			this.nombreComun = "No introdujiste ningún nombre común";
		}
	}

	public String getNombreComun(){
		return this.nombreComun;
	}

	public void setNombreCientifico(String nombreCientifico){
		if(nombreCientifico.length() != 0){
			this.nombreCientifico = nombreCientifico;
		}
		else{
			this.nombreCientifico = "No introdujiste ningún nombre científico";
		}
	}

	public String getNombreCientifico(){
		return this.nombreCientifico;
	}

	public void setOrigen(String origen){
		if(origen.length() != 0){
			this.origen = origen;
		}
		else{
			System.out.println("No introdujiste ningún lugar de origen");
		}
	}

	public String getOrigen(){
		return this.origen;
	}

	public String toString(){
		return "Nombre Común: " + this.nombreComun +
			"\nNombre Científico: " + this.nombreCientifico +
			"\nLugar de Origen: " + this.origen;
	}
}

