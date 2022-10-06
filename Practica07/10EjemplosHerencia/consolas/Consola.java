public class Consola extends ConsolasVideojuegos{
	private String color;

	public void setColor(String color){
		if(color.length() != 0){
			this.color = color;
		}
		else{
			this.color = "No introdujiste ningún color";
		}
	}

	public String getColor(){
		return this.color;
	}

	public String toString(){
		return super.toString() +
			"\nColor: " + this.color;
	}
}
