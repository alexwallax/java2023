package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFornatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}
