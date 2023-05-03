package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 06;
		d1.ano = 1990;
		

		var d2 = new Data();
		d2.dia = 23;
		d2.mes = 11;
		d2.ano = 1982;
		
		System.out.println(d1.obterDataFornatada());
		
		System.out.println(d2.obterDataFornatada());
		
		d1.imprimirDataFormatada();
		

	}

}
