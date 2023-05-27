import java.util.Scanner;

public class ValidacaoIdadeHomem {
	Scanner scanner = new Scanner(System.in);
	
	
	public String idadeValidacao() {
		int idade;
		System.out.print("Informe a idade do cliente: ");
		idade = scanner.nextInt();
		
		if (idade <= 15) {
			return "60.0";
		} else if (idade <= 18) {
			return "75.0";
		} else if (idade <= 30) {
			return "90.0";
		} else if (idade <= 40) {
			return "85.0";
		} else if(idade >= 41 && idade <= 50){
			return "80.0";
		} else if (idade >= 51 && idade <=125) {
			return "60.0";
		} else if (idade <= 0 || idade >= 126) {
			return "Idade invalida";
		}
			return "erro";
		}
	}

