package Lista3;

import java.util.Scanner;

public class Eleição {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cand1 = 0, cand2 = 0, cand3 = 0, nVotantes = 0;
		
		System.out.println("::.. Eleições para Representante ..::");
		System.out.print("\nInforme a quantidade de votantes: ");
		nVotantes = entrada.nextInt();
		
		int [] vetor = new int [nVotantes];
		
		for(int i = 0; i < nVotantes; i++) {
			System.out.println("Escolha o candidato que deseja votar.");
			System.out.println("[1] - Fulano");
			System.out.println("[2] - Ciclano");
			System.out.println("[3] - Beltrano");
			System.out.print("Opção-> ");
			vetor[i] = entrada.nextInt();
			
			if(vetor[i] == 1) {
				cand1 = cand1 + 1;
			} else if (vetor[i] == 2) {
				cand2 = cand2 + 1;
			} else {
				cand3 = cand3 + 1;
			}
		}
		
		System.out.println("\nO candidato nº 1 recebeu "+cand1+" votos");
		System.out.println("O candidato nº 2 recebeu "+cand2+" votos");
		System.out.println("O candidato nº 3 recebeu "+cand3+" votos");
		
		entrada.close();

	}

}
