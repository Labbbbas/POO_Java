public class Laptops{
	private String marca, modelo;
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

	public void setModelo(String modelo){
		if(modelo.length() != 0){
			this.modelo = modelo;
		}
		else{
			this.modelo = "No introdujiste ningún modelo";
		}
	}
	
	public String getModelo(){
		return this.modelo;
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
			"\nModelo: " + this.modelo +
			"\nPrecio: $" + this.precio + " MXN";
	}
}
