package model;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AgendaTelefonica {

	private String proprietario;
	private List<Contato> agendaTelefonica = new LinkedList<Contato>();

	public AgendaTelefonica() {
		super();
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public void adicionarContato(Contato contato) {
		agendaTelefonica.add(contato);
		ordemAlfabetica();
	}
	
	public void removerContato(Contato contatoProcurado) {
		boolean contatoEncontrado = false;
		if(agendaTelefonica.isEmpty()) {
			System.out.println("A agenda telefônica está vazia");
		} else {
			int tamanho = agendaTelefonica.size();
			for(int i = 0; i < tamanho; i++) {
				if(contatoProcurado.equals(agendaTelefonica.get(i))){
					contatoEncontrado = true;
					System.out.println("Contato " + contatoProcurado.getNome() + " removido");
					agendaTelefonica.remove(i);
					ordemAlfabetica();
					break;
				}
			}
			if (!contatoEncontrado) {
				System.out.println("Contato " + contatoProcurado.getNome() + " não encontrado");
			}
		}
	}
	
	public void buscarContato(Contato contatoProcurado) {
		boolean contatoEncontrado = false;
		if(agendaTelefonica.isEmpty()) {
			System.out.println("A agenda telefônica está vazia");
		} else {
			int tamanho = agendaTelefonica.size();
			for(int i = 0; i < tamanho; i++) {
				if(contatoProcurado.equals(agendaTelefonica.get(i))){
					contatoEncontrado = true;
					System.out.println(agendaTelefonica.get(i).toString());
					break;
				}
			}
			if (!contatoEncontrado) {
				System.out.println("Contato " + contatoProcurado.getNome() + " não encontrado");
			}
		}
	}

    private void ordemAlfabetica() {
        Collections.sort(agendaTelefonica, new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                return c1.getNome().compareTo(c2.getNome());
            }
        });
    }
    
}
