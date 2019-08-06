package Lista2;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int saque, notaCem, notaCinqu, notaDez, notaCinco, notaUm;
		
		System.out.println("========= Caixa Eletrôico ==========");
		System.out.print("Informe o valor do saque: ");
		saque = entrada.nextInt();
		
		if (saque >= 10 && saque <= 600) {
			notaCem = saque /100;
			saque = saque % 100;
			notaCinqu = saque / 50;
			saque = saque % 50;
			notaDez = saque / 10;
			saque = saque % 10;
			notaCinco = saque / 5;
			saque = saque % 5;
			notaUm = saque;
			if (notaCem > 0) {
			System.out.println("Notas de R$ 100,00: "+notaCem);
			}
			if (notaCinqu > 0) {
			System.out.println("Notas de R$ 50,00: "+notaCinqu);
			} 
			if (notaDez > 0) {
			System.out.println("Notas de R$ 10,00: "+notaDez);
			} 
			if (notaCinco > 0) {
			System.out.println("Notas de R$ 5,00: "+notaCinco);
			} 
			if (notaUm > 0) {
			System.out.println("Notas de R$ 1,00: "+notaUm);
			}			
		} else {
			System.out.println("Não é possível realizar o saque neste valor.");
		}
		
		entrada.close();

	}

}
