package Lista2;

import java.util.Scanner;

public class InteiroDecimal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num;
		
		System.out.print("Digite um número: ");
		num = entrada.nextFloat();
		
		if (num == Math.round(num)) {
			System.out.println("O número informado é um numero inteiro.");
		} else {
			System.out.println("O número informado é um número decimal.");
		}
		
		entrada.close();
	}

	

}
