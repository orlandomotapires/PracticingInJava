package terceiraLista;

public class Data {
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "dia=" + dia + ", mes=" + mes + ", ano=" + ano;
	}
	
	public String retornaMes(Data data) {
		return ", mes=" + data.getMes() + ", ano=" + data.getAno();
	}
	
}
