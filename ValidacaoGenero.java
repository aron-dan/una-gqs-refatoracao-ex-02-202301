import java.util.Scanner;

public class ValidacaoGenero {
	Scanner scanner = new Scanner(System.in);

	public String genero() {
		System.out.print("Informe o sexo do cliente (M/H): ");
		String sexo = scanner.next();

		if (sexo.equalsIgnoreCase("M")) {
			return "M";

		} else if(sexo.equalsIgnoreCase("H")) {
			return "H";
		}
			return "invalido";
	}

}
