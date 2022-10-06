public class Cilindro {
	float altura, radio;

	public float areaBase(){
		return (float)(Math.PI*(this.radio*this.radio));
	}
	
	public float areaLateral(float radio, float altura){
		return (float)(2*Math.PI*radio*altura);
	}

	public float areaTotal(){
		return (float)(2*areaBase()+areaLateral(radio, altura));
	}
}
