public class ConsolasVideojuegos{
	private String marca, nombre;
	private int precio;
	
	public void setMarca(String marca){
		if(marca.length() != 0){
			this.marca = marca;
		}
		else{
			this.marca = "No introdujiste ninguna marca";
		}
	}

	public String getMarca(){
		return this.marca;
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
		return "Marca: " + this.marca +
			"\nNombre: " + this.nombre +
			"\nPrecio: $" + this.precio + " MXN";
	}
}
