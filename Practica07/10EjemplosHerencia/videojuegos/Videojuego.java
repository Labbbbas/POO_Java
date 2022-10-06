public class Videojuego extends Videojuegos{
	private String genero;

	public void setGenero(String genero){
		if(genero.length() != 0){
			this.genero = genero;
		}
		else{
			this.genero = "No introdujiste ningún género";
		}
	}

	public String getGenero(){
		return this.genero;
	}

	public String toString(){
		return super.toString() +
			"\nGénero: " + this.genero;
	}
}

