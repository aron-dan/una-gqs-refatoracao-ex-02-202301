import java.util.Scanner;

public class ValidacaoIdadeMulher {
	Scanner scanner = new Scanner(System.in);
	
	public String idadeValidacao() {
		int idade;
		System.out.print("Informe a idade do cliente: ");
		idade = scanner.nextInt();
		
		if (idade <= 18) {
			return "60.0";
		} else if (idade <= 25) {
			return "90.0";
		} else if (idade <= 40) {
			return "85.0";
		} else if (idade <= 50) {
			return "65.0";
		} else if (idade >= 50 && idade <= 120) {
			return "50.0";
		} else if (idade <= 0 || idade >= 125) {
			return "Idade invalida";
		}
		return "erro";
	}
}
