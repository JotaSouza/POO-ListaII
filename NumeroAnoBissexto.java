package Lista2;

import java.util.Scanner;

public class NumeroAnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.print("Informe um n�mero correspondente ao ano para saber se � ano bissexto: ");
		num = entrada.nextInt();
		
		if ((num % 400 == 0) || (num % 4 == 0 ) && (num % 100 != 0)) {
			System.out.println("O n�mero informado corresponde a um ano bissexto.");
		} else {
			System.out.println("O n�mero informado de n�o corresponde a um ano bissexto.");
		}
		
		entrada.close();
	}
}
