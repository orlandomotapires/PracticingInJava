package quartaLista;

public class Fibonacci {
	
	public Fibonacci() {	
	}
	public int sequenciaFibonacci(int N) {
		int atu=1, prox=1, ant = 0;
		for(int i = 1; i < N; i++) {
			System.out.println(prox);
			prox = atu + ant;
			ant = atu;
			atu = prox;
		}
		return prox;		
	}
	
	public boolean pertenceFibonacci(int N) {
		int atu=1, prox=1, ant = 0;
		while(prox <= N){
			if(N == prox) {
				System.out.println(prox);
				return true;	
			}
			System.out.println(prox);
			prox = atu + ant;
			ant = atu;
			atu = prox;
		}
		System.out.println(prox);
		return false;
	}
}
