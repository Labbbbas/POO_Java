public class Cono {
	float altura, radio;

	public float generatriz(){
		return (float)(Math.sqrt((altura*altura)+(radio*radio)));
	}

	public float areaLateral(){
		return (float)(Math.PI*generatriz()*this.radio);
	}

	public float areaBase(){
		return (float)(Math.PI*Math.pow(this.radio,2));
	}

	public float areaTotal(){
		return (float)(areaLateral() + areaBase());
	}
}
