public class Videojuegos{
	private String estudio, nombre;
	private int precio;
	
	public void setEstudio(String estudio){
		if(estudio.length() != 0){
			this.estudio = estudio;
		}
		else{
			this.estudio = "No introdujiste ningún estudio";
		}
	}

	public String getEstudio(){
		return this.estudio;
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

	public void setPrecio(int precio){
		if(precio > 0){
			this.precio = precio;
		}
		else{
			System.out.println("Precio no válido");
		}
	}

	public int getPrecio(){
		return this.precio;
	}

	public String toString(){
		return "Estudio: " + this.estudio +
			"\nNombre: " + this.nombre +
			"\nPrecio: $" + this.precio + " MXN";
	}
}

