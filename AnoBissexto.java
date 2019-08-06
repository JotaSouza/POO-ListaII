package Lista2;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		System.out.print("Informe um ano no formato XXXX para saber se é ano bissexto: ");
		ano = entrada.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 ) && (ano % 100 != 0)) {
			System.out.println("O ano informado de "+ano+" é um ano bissexto.");
		} else {
			System.out.println("O ano informado de "+ano+" não é uma no bissexto.");
		}
		
		entrada.close();
	}

}
