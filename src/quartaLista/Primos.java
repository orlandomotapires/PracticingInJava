package quartaLista;

public class Primos {

	public boolean ehPrimo(int N) {
		for(int i = 2; i < N; i++)  if(N % i == 0)return false;
		return true;
		
	}
	
	public void intervaloPrimos(int n, int m) {
		int check;
		for(int i = n; i <= m; i++) {
			check = 1;
			for(int j = 2; j < i; j++) {  
				if(i % j == 0) {
					check = 0;
				}
			}
			if(check == 1) System.out.println(i + " é primo");
		}
	}
}
