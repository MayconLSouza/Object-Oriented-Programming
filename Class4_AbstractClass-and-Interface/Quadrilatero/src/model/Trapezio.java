package model;

public class Trapezio extends Quadrilatero {

	private float baseMenor;
	
	public Trapezio() {
		super();
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	@Override
	public float calcularArea() {
		float area = ( ( (getQuadrilateroBase() + baseMenor) * getQuadrilateroAltura() ) / 2);
		return area;
	}

}
