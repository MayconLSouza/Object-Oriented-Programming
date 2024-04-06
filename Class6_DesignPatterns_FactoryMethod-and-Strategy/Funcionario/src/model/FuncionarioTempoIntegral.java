package model;

public class FuncionarioTempoIntegral extends Funcionario {

	private int bancoHoras;
	
	public FuncionarioTempoIntegral() {
		super();
	}

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("ID: " + getId() + "\n");
		buffer.append("Nome: " + getNome() + "\n");
		buffer.append("Salário: $" + getSalario() + "\n");
		buffer.append("banco de horas: " + bancoHoras + " h\n");
		return buffer.toString();
	}
	
}
