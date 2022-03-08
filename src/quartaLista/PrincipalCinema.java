package quartaLista;

import java.util.Scanner;

import terceiraLista.Data;

public class PrincipalCinema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Data do filme: Day, month, year");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		System.out.print("Horario do filme: ");
		int horario = sc.nextInt();
		
		System.out.print("Sala: ");
		int sala = sc.nextInt();
		
		System.out.print("Valor: ");
		float valor = sc.nextInt();
		
		Data dataFilme = new Data(day, month, year);
		EntradaCinema entradaCinema = new EntradaCinema(dataFilme, horario, sala, valor);
		
		entradaCinema.calculaDescontoEstudante(valor, horario);
		
		System.out.println(entradaCinema);
		
	}

}
