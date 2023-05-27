import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ValidacaoIdadeHomem validacaoIdadeHomem = new ValidacaoIdadeHomem();
		ValidacaoIdadeMulher validacaoIdadeMulher = new ValidacaoIdadeMulher();
		
		
		validacaoIdadeHomem.idadeValidacao();
		validacaoIdadeMulher.idadeValidacao();

		System.out.print("Informe o sexo do cliente (M/F): ");
		String sexo = scanner.next();

		

		if (sexo.equalsIgnoreCase("M")) {
			
			
		} else if (sexo.equalsIgnoreCase("F")) {
			
		} else {
			System.out.println("Sexo inválido.");
			mensalidade = 0.0;
		}

		System.out.println("Valor da mensalidade: R$" + mensalidade);

		scanner.close();
	}
}