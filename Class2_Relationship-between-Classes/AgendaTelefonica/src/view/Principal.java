package view;

import model.AgendaTelefonica;
import model.Contato;

public class Principal {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
        contato1.setNome("João");
        contato1.setTelefone("123456789");
        contato1.setEmail("joao@email.com");

        Contato contato2 = new Contato();
        contato2.setNome("Maria");
        contato2.setTelefone("987654321");
        contato2.setEmail("maria@email.com");

        Contato contato3 = new Contato();
        contato3.setNome("Ana");
        contato3.setTelefone("456123789");
        contato3.setEmail("ana@email.com");
        
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.setProprietario("Maycon");
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        
        System.out.println("Proprietário: " + agenda.getProprietario());
        agenda.buscarContato(contato2);
        agenda.removerContato(contato3);
        agenda.buscarContato(contato3);
	}

}
