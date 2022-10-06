public class Animales{
	private String nombreComun, nombreCientifico, familia;
	
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

	public void setFamilia(String familia){
		if(familia.length() != 0){
			this.familia = familia;
		}
		else{
			System.out.println("No introdujiste ninguna familia");
		}
	}

	public String getFamilia(){
		return this.familia;
	}

	public String toString(){
		return "Nombre Común: " + this.nombreComun +
			"\nNombre Científico: " + this.nombreCientifico +
			"\nFamilia: " + this.familia;
	}
}

