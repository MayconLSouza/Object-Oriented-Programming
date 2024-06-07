package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Time {
	
	private int codigo;
	private String nome;
	private String cidade;
	
	@Override
	public String toString() {
		return codigo + " - " + nome + " - " + cidade;
	}

}
