package Lista2;

import java.util.Scanner;

public class PostoAbastecimento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char op = 0;
		int qtdLitros;
		float valLitroAlc = (float) 1.90, valLitroGas = (float) 2.50;
		float indicAlc1 = 3, indicAlc2 = 5, indicGas1 = 4, indicGas2 = 6;
		
		System.out.println("Escolha o tipo de combustível:");
		System.out.print("A - alcool ou G - gasolina -> ");
		op = entrada.nextLine().toUpperCase().charAt(op);
		System.out.println("Quantos litros você quer abastacer?");
		System.out.print("Qtd Litros -> ");
		qtdLitros = entrada.nextInt();
		
		
		switch(op) {
		case 'A':
			if(qtdLitros <= 20) {
				float desc = (qtdLitros * valLitroAlc * indicAlc1) /100;
				float valTotal = (qtdLitros * valLitroAlc) - desc;
				System.out.println("Total: R$ "+valTotal);
			} else {
				float desc = (qtdLitros * valLitroAlc * indicAlc2) /100;
				float valTotal = (qtdLitros * valLitroAlc) - desc;
				System.out.println("Total: R$ "+valTotal);
			}
			break;
		case 'G':
			if(qtdLitros <= 20) {
				float desc = (qtdLitros * valLitroGas * indicGas1) /100;
				float valTotal = (qtdLitros * valLitroGas) - desc;
				System.out.println("Total: R$ "+valTotal);
			} else {
				float desc = (qtdLitros * valLitroGas * indicGas2) /100;
				float valTotal = (qtdLitros * valLitroGas) - desc;
				System.out.println("Total: R$ "+valTotal);
			}
			break;
			default:
				System.out.println("Quantidade não permitida");
				break;
		}
		
		entrada.close();

	}

}
