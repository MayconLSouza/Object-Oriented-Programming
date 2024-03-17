package model;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	
	public Funcionario() {
		this.nome = "";
		this.salario = 0.00;
		this.cargo = "";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(salario < 1412.00) {
			this.salario = 1412.00;
		} else {
			this.salario = salario;
		}
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioLiquido(double descontos, double beneficios) {
		double salarioBruto = getSalario();
		double salarioLiquido = salarioBruto - descontos + beneficios;
		return salarioLiquido;
	}
}
