package Lista3;

import java.util.Scanner;

public class MediaNPessoas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numP = 0, soma = 0, media = 0;
		
		System.out.println("::.. Clacula média de idade da Turma ..::");
		System.out.print("\nInforme a quantidade de alunos: ");
		numP = entrada.nextInt();
		
		int [] vetor = new int [numP];
		
		for(int i = 0; i < numP; i++) {
			System.out.print("Informe a idade da "+(i+1)+"º pessoa: ");
			vetor[i] = entrada.nextInt();
			soma = soma + vetor[i];
		}
		
		media = soma / numP;
		
		System.out.println("\nA média de idade da turma é de "+media+" anos.");
		
		if(media > 0 && media <= 25)
			System.out.println("A turma é jovem.");
		else if (media >= 26 && media <= 60)
			System.out.println("A turma é adulta.");
		else
			System.out.println("A turma é idosa.");
		
		entrada.close();

	}

}
