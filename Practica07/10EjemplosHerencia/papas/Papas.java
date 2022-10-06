public class Papas{
	private String grupo, nombre;
	private int precio;
	
	public void setGrupo(String grupo){
		if(grupo.length() != 0){
			this.grupo = grupo;
		}
		else{
			this.grupo = "No introdujiste ningún grupo";
		}
	}

	public String getGrupo(){
		return this.grupo;
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
		return "Grupo: " + this.grupo +
			"\nNombre: " + this.nombre +
			"\nPrecio: $" + this.precio + " MXN";
	}
}

