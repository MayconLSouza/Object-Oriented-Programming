package model;

public abstract class Quadrilatero {

	private float quadrilateroBase;
	private float quadrilateroAltura;
	
	public Quadrilatero() {
		super();
	}

	public float getQuadrilateroBase() {
		return quadrilateroBase;
	}

	public void setQuadrilateroBase(float quadrilateroBase) {
		this.quadrilateroBase = quadrilateroBase;
	}

	public float getQuadrilateroAltura() {
		return quadrilateroAltura;
	}

	public void setQuadrilateroAltura(float quadrilateroAltura) {
		this.quadrilateroAltura = quadrilateroAltura;
	}

	public float calcularPerimetro() {
		float perimetro = (2 * quadrilateroBase) + (2 * quadrilateroAltura);
		return perimetro;
	}
	
	public abstract float calcularArea();
	
}
