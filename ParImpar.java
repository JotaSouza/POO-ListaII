package Lista2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, verificador;
		
		System.out.print("Digite um numero inteiro: ");
		num = entrada.nextInt();
		
		verificador = num % 2;
		
		if (verificador == 0) {
			System.out.println("O número digitado é par.");
		}else {
			System.out.println("O número digitado é ímpar.");
		}
		
		entrada.close();
	}

}
