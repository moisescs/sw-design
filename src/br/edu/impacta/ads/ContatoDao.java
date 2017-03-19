package br.edu.impacta.ads;

import java.util.List;
import java.util.ArrayList;

public class ContatoDao {
	private List<Contato> contatos = new ArrayList<>();
	
	public List<Contato> buscar(String nome){
		List<Contato> resultado = new ArrayList<>();
		for (Contato c : contatos){
			if(nome.equals(c.getNome())){
				resultado.add(c);
			}
		}
		return resultado;
	}
	
	public void inserir(Contato c){
		contatos.add(c);
	}
	
	public boolean existe(Contato c){
		return contatos.contains(c);
	}
}
