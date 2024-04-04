package model;

public class Paralelogramo extends Quadrilatero {

	public Paralelogramo() {
		super();
	}
	
	@Override
	public float calcularArea() {
		float area = getQuadrilateroBase() * getQuadrilateroAltura();
		return area;
	}

}
