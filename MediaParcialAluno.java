package Lista2;

import java.util.Scanner;

public class MediaParcialAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		float mediaNota;
		
		System.out.print("Informe a idade do primeiro aluno: ");
		nota1 = entrada.nextInt();
		System.out.print("Informe a idade do segundo aluno: ");
		nota2 = entrada.nextInt();
		System.out.print("Informe a idade do terceiro aluno: ");
		nota3 = entrada.nextInt();
		
		mediaNota = (nota1 + nota2 + nota3)/3;
		
		if (mediaNota >= 7) {
			if (mediaNota == 10) {
				System.out.println("Aprovado com Distinção");
			} else {
			System.out.println("Aprovado com média "+mediaNota);
			}
		} else{
			System.out.println("Reprovado com média "+mediaNota);
		} 
		
		entrada.close();
	}
}
