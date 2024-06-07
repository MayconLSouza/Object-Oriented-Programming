package model;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {
	
	private int id;
	private String nome;
	private Date data_nasc;
	private double altura;
	private double peso;
	private Time time;
	
	@Override
	public String toString() {
		return id + " - " + nome + " - " + data_nasc + " - " + altura + " - " + peso + " - " + time.getNome();
	}

}
