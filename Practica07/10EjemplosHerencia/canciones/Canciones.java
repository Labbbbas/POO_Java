public class Canciones{
	private String artista, nombre, duracion;
	
	public void setArtista(String artista){
		if(artista.length() != 0){
			this.artista = artista;
		}
		else{
			this.artista = "No introdujiste ningún artista";
		}
	}

	public String getArtista(){
		return this.artista;
	}

	public void setNombre(String nombre){
		if(nombre.length() != 0){
			this.nombre = nombre;
		}
		else{
			this.nombre = "No introdujiste ningún nombre";
		}
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setDuracion(String duracion){
		if(duracion.length() != 0){
			this.duracion = duracion;
		}
		else{
			System.out.println("No introdujiste ninguna duración");
		}
	}

	public String getDuracion(){
		return this.duracion;
	}

	public String toString(){
		return "Artista: " + this.artista +
			"\nNombre: " + this.nombre +
			"\nDuración: " + this.duracion + " min";
	}
}

