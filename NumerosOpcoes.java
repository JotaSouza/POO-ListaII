package Lista2;

import java.util.Scanner;

public class NumerosOpcoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num1, num2, result;
		String operacao;
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextFloat();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextFloat();
		System.out.println("Informe qual operação você deseja realizar: (+, -, * ou /)");
		entrada.nextLine();
		System.out.print("Operação-> ");
		operacao = entrada.nextLine();
		
		switch(operacao) {
		case "+":
			result = num1 + num2;
			
			if(result % 2 == 0) {
				System.out.println("O número "+result+" é par");
			} else {
				System.out.println("O número "+result+" é ímpar");
			}
			
			if(result >= 0) {
				System.out.println("O número "+result+" é positivo");
			} else {
				System.out.println("O número "+result+" é negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O número "+result+" é inteiro");
			} else {
				System.out.println("O número "+result+" é decimal");
			}
			break;
			
		case "-":
			result = num1 - num2;
			
			if(result % 2 == 0) {
				System.out.println("O número "+result+" é par");
			} else {
				System.out.println("O número "+result+" é ímpar");
			}
			
			if(result >= 0) {
				System.out.println("O número "+result+" é positivo");
			} else {
				System.out.println("O número "+result+" é negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O número "+result+" é inteiro");
			} else {
				System.out.println("O número "+result+" é decimal");
			}
			break;
			
		case "*":
			result = num1 * num2;
			
			if(result % 2 == 0) {
				System.out.println("O número "+result+" é par");
			} else {
				System.out.println("O número "+result+" é ímpar");
			}
			
			if(result >= 0) {
				System.out.println("O número "+result+" é positivo");
			} else {
				System.out.println("O número "+result+" é negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O número "+result+" é inteiro");
			} else {
				System.out.println("O número "+result+" é decimal");
			}
			break;
			
		case "/":
			result = num1 / num2;
			
			if(result % 2 == 0) {
				System.out.println("O número "+result+" é par");
			} else {
				System.out.println("O número "+result+" é ímpar");
			}
			
			if(result >= 0) {
				System.out.println("O número "+result+" é positivo");
			} else {
				System.out.println("O número "+result+" é negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O número "+result+" é inteiro");
			} else {
				System.out.println("O número "+result+" é decimal");
			}
			break;
			
			default:
				System.out.println("Operação inválida.");
		}
		
		entrada.close();
	}

}
