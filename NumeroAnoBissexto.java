package Lista2;

import java.util.Scanner;

public class NumeroAnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.print("Informe um número correspondente ao ano para saber se é ano bissexto: ");
		num = entrada.nextInt();
		
		if ((num % 400 == 0) || (num % 4 == 0 ) && (num % 100 != 0)) {
			System.out.println("O número informado corresponde a um ano bissexto.");
		} else {
			System.out.println("O número informado de não corresponde a um ano bissexto.");
		}
		
		entrada.close();
	}
}
