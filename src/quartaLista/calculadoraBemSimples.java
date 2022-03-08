package quartaLista;

public class calculadoraBemSimples {
	private double x, y;
	private char z;
	public calculadoraBemSimples(double x, double y, char z) {
		if(y == 0) {
			System.out.println("Division by 0 is impossivel, sorry :(");
			return;
		}
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double operacao() {
		if(z == '+') {
			return x + y;
		}
		
		if(z == '-') {
			return x - y;
		}
		
		if(z == '*') {
			return x * y;
		}
		
		if(z == '/') {
			return x / y;
		}
		else System.out.println("z is not a operation");
		return 0;
	}
	
	
	
	
}
