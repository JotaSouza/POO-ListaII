package Lista2;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.print("Informe a primeira nota do aluno: ");
		nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota do aluno: ");
		nota2 = entrada.nextFloat();
		
		media = ((nota1 + nota2)/2);
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
