package Lista2;

import java.util.Scanner;

public class OrdenacaoDecrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 3;
		int vetor[] = new int[TAM];
		for(int i = 0; i < TAM; i++ ) {
			System.out.print("Informe um numero: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("Os n�meros que voc� informou em forma decrescente s�o: ");
        for(int i = vetor.length - 1; i >= 0; i--)
        System.out.println(vetor[i] +" | ");
        
        entrada.close();

	}

}
