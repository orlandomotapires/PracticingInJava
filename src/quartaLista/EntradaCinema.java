package quartaLista;

import java.util.Scanner;

import terceiraLista.Data;

public class EntradaCinema {
	private Data dataDoFilme;
	private float horario;
	private int sala;
	private double valor;
	
	
	private final Scanner sc = new Scanner(System.in);
	
	
	public EntradaCinema(Data dataDoFilme, float horario, int sala, float valor) {
		this.dataDoFilme = dataDoFilme;
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}
	
	public void calculaDesconto(Data dataCliente, double valorTotal, int horas) {
		if(dataDoFilme.getAno() - dataCliente.getAno() < 12) valor = valorTotal/2;
		calculaDescontoHorario(horas, valorTotal);
	}
	
	public void calculaDescontoEstudante(double valorTotal, int horas) {
		System.out.print("Carteira Estudante: ");
		int carteiraEstudante = sc.nextInt();
		if(carteiraEstudante > 12 && carteiraEstudante < 15) valor = valorTotal*0.6;
		if(carteiraEstudante > 16 && carteiraEstudante < 20) valor = valorTotal*0.7;
		if(carteiraEstudante > 20) valor = valorTotal*0.2;	
		calculaDescontoHorario(horas, valorTotal);
	}
	
	public void calculaDescontoHorario(int horas, double valorTotal){
		if(horas < 16) valor = valorTotal*0.9;
	}

	@Override
	public String toString() {
		return "entradaCinema [dataDoFilme=" + dataDoFilme + ", horario=" + horario + ", sala=" + sala + ", valor=" + valor + "]";
	}
}
