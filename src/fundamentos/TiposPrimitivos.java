package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 127; // maximo 127
		short numeroDeVoos = 32767; // maximo
		int id = 56789;
		long pontosAcumolados = 3_234_845_223L;
		System.out.println(anosDeEmpresa);
		System.out.println(numeroDeVoos);
		System.out.println(id);
		System.out.println(pontosAcumolados);
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = true;
		
		// caractere
		char status = '1'; //apenas um caracter
		
		System.out.println(anosDeEmpresa * 365 + " dias de empresa");
		
		System.out.println(salario);
		System.out.println(vendasAcumuladas);
		System.out.println(estaDeFerias);	
		System.out.println(status);
	}

}
