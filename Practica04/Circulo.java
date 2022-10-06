public class Circulo {
	float radio, diametro;
	
	public float area(){
		return (float)(Math.PI*(this.radio*this.radio));
	}
	
	public float area (int radio){
		return (float)(Math.PI*(radio*radio));
	}
		
	public float area (float radio){
		return (float)(Math.PI*(radio*radio));
	}

	public float areaDiametro (float diametro){
		return (float)(Math.PI*(diametro/2*diametro/2));
	}

	public float circunferenciaRadio(float radio){
		return(float)(2*Math.PI*radio);
	}

	public float circunferenciaDiametro(int diametro){
		return (float)(2*Math.PI*(diametro/2));
	}
}
