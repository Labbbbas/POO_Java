public class Cuadrado {
	float lado;

	public float area(){
		return (float)(this.lado*this.lado);
	}

	public float area(int lado){
		return (float)(lado*lado);
	}

	public float area(float lado){
		return (float)(lado*lado);
	}
}
