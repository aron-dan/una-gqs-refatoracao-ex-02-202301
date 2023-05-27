import java.util.Scanner;

public class ValidacaoIdadeHomem {
	Scanner scanner = new Scanner(System.in);
	
	
	public int idadeValidacao() {
		int idade;
		double mensalidade;
		System.out.print("Informe a idade do cliente: ");
		idade = scanner.nextInt();
		
		if (idade <= 15) {
			mensalidade = 60.0;
		} else if (idade <= 18) {
			mensalidade = 75.0;
		} else if (idade <= 30) {
			mensalidade = 90.0;
		} else if (idade <= 40) {
			mensalidade = 85.0;
		} else if(idade >= 41 && idade <= 50){
			mensalidade = 80.0;
		} else if (idade >= 51 && idade <=125) {
			mensalidade = 60.0;
		} else if (idade <= 0 || idade >= 126) {
			System.out.println("Idade invalida");
		}
		
		
		return 1;
	}

}
