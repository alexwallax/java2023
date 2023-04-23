package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0)); //verifica qual a letra no indice zero
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); //concatena 3 esclamações
		System.out.println(s + "!!!"); //concatena 3 esclamações
		System.out.println(s.startsWith("Boa")); //se string "s" inicia com "Boa" - true
		System.out.println(s.startsWith("boa")); //se string "s" inicia com "boa" - false
		System.out.println(s.endsWith("dia")); //se string "s" termina com "dia" - false
		System.out.println(s.length()); //quantos caracteres tem a string s
		
		System.out.println(s.equals("boa tarde")); //comparação de igualdade - false b minusculo
		System.out.println(s.equalsIgnoreCase("boa tarde")); //comparação de igualdade - true
		
		var nome = "pedro"; // String
		
		var sobreNome = "Santos"; // String
		
		var idade = 33; // int
		var salario = 123456.789; // double
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("Nome %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobreNome, idade, salario);
		
		String frase = String.format("\nNome %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobreNome, idade, salario);
		System.out.println(frase);
	}

}
