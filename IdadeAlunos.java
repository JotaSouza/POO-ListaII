package Lista2;

import java.util.Scanner;

public class IdadeAlunos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade1, idade2, idade3;
		float mediaIdade;
		
		System.out.print("Informe a idade do primeiro aluno: ");
		idade1 = entrada.nextInt();
		System.out.print("Informe a idade do segundo aluno: ");
		idade2 = entrada.nextInt();
		System.out.print("Informe a idade do terceiro aluno: ");
		idade3 = entrada.nextInt();
		
		mediaIdade = (idade1 + idade2 + idade3)/3;
		
		if (mediaIdade < 25) {
			System.out.println("Turma Jovem");
		} else if (mediaIdade >= 25 && mediaIdade < 40) {
			System.out.println("Turma Adulta");
		} else {
			System.out.println("Turma Idosa");
		}
		
		entrada.close();
	}

}
