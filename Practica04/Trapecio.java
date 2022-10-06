public class Trapecio {
	float base1, base2, altura;

	public float area(){
		return (float)((base1+base2)*altura/2);
	}

	public float area(int base1, int base2, int altura){
		return (float)((base1+base2)*altura/2);
	}

	public float area(float base1, float base2, float altura){
		return (float)((base1+base2)*altura/2);
	}
}
