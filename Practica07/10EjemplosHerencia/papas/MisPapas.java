public class MisPapas extends Papas{
	private String sabor;

	public void setSabor(String sabor){
		if(sabor.length() != 0){
			this.sabor = sabor;
		}
		else{
			this.sabor = "No introdujiste ningún sabor";
		}
	}

	public String getSabor(){
		return this.sabor;
	}

	public String toString(){
		return super.toString() +
			"\nSabor: " + this.sabor;
	}
}

