package Lista2;

import java.util.Scanner;

public class AtualizaSalario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salAtual, salNovo, aumento;
		
		System.out.print("Informe o salário atual do colaborador: ");
		salAtual = entrada.nextFloat();
		
		if(salAtual <= 280) {
			aumento = ((salAtual *20)/100);
			salNovo = salAtual + aumento;
			System.out.println("Salário antes do reajuste: R$ "+salAtual);
			System.out.println("Percentual de aumento aplicado foi de 20%");
			System.out.println("Valor do aumento: R$ "+aumento);
			System.out.println("Novo salario, após o aumento: R$ "+salNovo);
		} else if (salAtual > 280 && salAtual <= 700) {
			aumento = ((salAtual *15)/100);
			salNovo = salAtual + aumento;
			System.out.println("Salário antes do reajuste: R$ "+salAtual);
			System.out.println("Percentual de aumento aplicado foi de 15%");
			System.out.println("Valor do aumento: R$ "+aumento);
			System.out.println("Novo salario, após o aumento: R$ "+salNovo);
		} else if (salAtual > 700 && salAtual <= 1500) {
			aumento = ((salAtual *10)/100);
			salNovo = salAtual + aumento;
			System.out.println("Salário antes do reajuste: R$ "+salAtual);
			System.out.println("Percentual de aumento aplicado foi de 10%");
			System.out.println("Valor do aumento: R$ "+aumento);
			System.out.println("Novo salario, após o aumento: R$ "+salNovo);
		} else {
			aumento = ((salAtual *5)/100);
			salNovo = salAtual + aumento;
			System.out.println("Salário antes do reajuste: R$ "+salAtual);
			System.out.println("Percentual de aumento aplicado foi de 5%");
			System.out.println("Valor do aumento: R$ "+aumento);
			System.out.println("Novo salario, após o aumento: R$ "+salNovo);
		}
		
		entrada.close();

	}

}
