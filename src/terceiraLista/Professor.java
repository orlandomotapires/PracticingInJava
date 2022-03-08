package terceiraLista;


public class Professor {
	private String nomeProfessor;
	private String nomeDepartamento;
	private Data dataAdmissao;
	private String numeroRegistro;
	
	public Professor(String nomeProfessor, String nomeDepartamento, Data dataAdmissao, String numeroRegistro) {
		this.nomeProfessor = nomeProfessor;
		this.nomeDepartamento = nomeDepartamento;
		this.dataAdmissao = dataAdmissao;
		this.numeroRegistro = numeroRegistro;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nomeProfessor + ", NomeDepartamento: " + nomeDepartamento + ", DataAdmissão: " + dataAdmissao + ", NumeroRegistro: " + numeroRegistro;
	}
	
}
