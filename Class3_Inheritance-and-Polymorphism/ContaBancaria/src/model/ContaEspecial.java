package model;

public class ContaEspecial extends ContaBancaria {

	private float limite;
	
	public ContaEspecial() {
		super();
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float valorSaque) {
		if ((getSaldo() + limite - valorSaque) < 0) {
			System.out.println("Saque no valor de $" + valorSaque + " nao pode ser realizado");
		} else {
			System.out.println("Saque no valor de $" + valorSaque + " realizado");
			setSaldo(getSaldo() - valorSaque); 
		}
	}
	
}
