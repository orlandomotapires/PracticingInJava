package quartaLista;

public class Comparavel {
	private int valorInteiro;

	public Comparavel(int valorInteiro) {
		this.valorInteiro = valorInteiro;
	}
	
	public int maiorOuIgual(int valor){
		if(valor >= valorInteiro) return 1;
		return 0;
	}
	
	public int menorOuIgual(int valor){
		if(valor <= valorInteiro) return 1;
		return 0;
	}
	
	public int diferenteDe(int valor){
		if(valor != valorInteiro) return 1;
		return 0;
	}
	
	
}
