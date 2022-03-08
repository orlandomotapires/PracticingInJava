package terceiraLista;

import java.util.Date;

public class Livro {
	private String nome;
	private String codigo;
	private Date dataDePublicacao;
	
	public Livro() {
		
	}
	
	public Livro(String nome, String codigo, Date dataDePublicacao){
		this.nome = nome;
		this.codigo = codigo;
		this.dataDePublicacao = dataDePublicacao;
	}
	
	public int igual(String nome) {
		if(nome.equals(this.nome)) return 1;
		return 0;
	}
	
	
}
