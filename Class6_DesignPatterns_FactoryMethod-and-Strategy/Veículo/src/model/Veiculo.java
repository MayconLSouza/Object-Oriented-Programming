package model;

public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qtdRoda;
	private Motor motor;
	
	public Veiculo() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public final void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQtdRoda() {
		return qtdRoda;
	}

	public final void setQtdRoda(int qtdRoda) {
		this.qtdRoda = qtdRoda;
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	public abstract float calcVel(float velocMax);
	
}
