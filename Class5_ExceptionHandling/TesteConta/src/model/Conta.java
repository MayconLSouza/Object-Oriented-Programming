package model;

public class Conta {

	private int agencia;
	private int codigo;
	private float saldo;
	private float limite;
	
	public Conta() {
		super();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void deposito(float valor) {
		saldo += valor;
		System.out.println("Deposito de $" + valor + " realizado");
		System.out.println("Saldo = $" + saldo);
	}
	
	public void saque(float valor) throws ArithmeticException {
		if(valor >= (saldo + limite) ) {
			throw new ArithmeticException("Saldo insuficiente\nLimite de Saque = $" + (saldo + limite));
		} else {
			saldo -= valor;
			System.out.println("Saque de $" + valor + " realizado");
			System.out.println("Saldo = $" + saldo);
		}
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", codigo=" + codigo + 
				", saldo=" + saldo + ", limite=" + limite + "]";
	}
	
	

}
