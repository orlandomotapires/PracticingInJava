package quartaLista;

public class SeriesMatematicas {
	private double x, y;

	public SeriesMatematicas(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double elevadoA() {
		int valor = 1;
		for(int i = 0; i < y; i++)  valor *= x;
		return valor ;
	}
	
	public void imprimeResultado() {
		System.out.println(elevadoA());
	}
	
	public void piQuadradosSobre8(int N) {
		int cont = 1;
		double k=0;
		do {
			k = 1/(cont*cont);
			cont += 2;
		}while(cont < N);
	}
	
	public double calculaPi1(int N) {
		double pi = 2;
		double cont = 1, aux = 2, k = 1;
		do {
			pi = pi * aux/k; 
			
			if(cont > 1) {
				if(cont%2 != 0) {
					k+=2;
				} else aux += 2;
			} else k+=2;
			cont++;
		}while(cont <= N);
		return pi;
		
	}
	
	public double calculaPi2(int N) {
		double pi = 0, aux1 = 1;
		for(int i=1;i<=N;i++){
            if(i%2!=0)
            pi=pi+4/aux1;
            else
            pi=pi-4/aux1;
            aux1=aux1+2;
        }
		return pi;
	}
}

