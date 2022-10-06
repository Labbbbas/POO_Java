public class Esfera{
	float radio;
	
	public float area(float radio){
		return (float)(4*Math.PI*(radio*radio));
	}

	public float volumen(float radio){
		return (float)(1.33333*Math.PI*Math.pow(radio,3));
	}
}
