package Lista2;

import java.util.Scanner;

public class NumerosOpcoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num1, num2, result;
		String operacao;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextFloat();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextFloat();
		System.out.println("Informe qual opera��o voc� deseja realizar: (+, -, * ou /)");
		entrada.nextLine();
		System.out.print("Opera��o-> ");
		operacao = entrada.nextLine();
		
		switch(operacao) {
		case "+":
			result = num1 + num2;
			
			if(result % 2 == 0) {
				System.out.println("O n�mero "+result+" � par");
			} else {
				System.out.println("O n�mero "+result+" � �mpar");
			}
			
			if(result >= 0) {
				System.out.println("O n�mero "+result+" � positivo");
			} else {
				System.out.println("O n�mero "+result+" � negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O n�mero "+result+" � inteiro");
			} else {
				System.out.println("O n�mero "+result+" � decimal");
			}
			break;
			
		case "-":
			result = num1 - num2;
			
			if(result % 2 == 0) {
				System.out.println("O n�mero "+result+" � par");
			} else {
				System.out.println("O n�mero "+result+" � �mpar");
			}
			
			if(result >= 0) {
				System.out.println("O n�mero "+result+" � positivo");
			} else {
				System.out.println("O n�mero "+result+" � negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O n�mero "+result+" � inteiro");
			} else {
				System.out.println("O n�mero "+result+" � decimal");
			}
			break;
			
		case "*":
			result = num1 * num2;
			
			if(result % 2 == 0) {
				System.out.println("O n�mero "+result+" � par");
			} else {
				System.out.println("O n�mero "+result+" � �mpar");
			}
			
			if(result >= 0) {
				System.out.println("O n�mero "+result+" � positivo");
			} else {
				System.out.println("O n�mero "+result+" � negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O n�mero "+result+" � inteiro");
			} else {
				System.out.println("O n�mero "+result+" � decimal");
			}
			break;
			
		case "/":
			result = num1 / num2;
			
			if(result % 2 == 0) {
				System.out.println("O n�mero "+result+" � par");
			} else {
				System.out.println("O n�mero "+result+" � �mpar");
			}
			
			if(result >= 0) {
				System.out.println("O n�mero "+result+" � positivo");
			} else {
				System.out.println("O n�mero "+result+" � negativo");
			}
			
			if(result == Math.round(result)) {
				System.out.println("O n�mero "+result+" � inteiro");
			} else {
				System.out.println("O n�mero "+result+" � decimal");
			}
			break;
			
			default:
				System.out.println("Opera��o inv�lida.");
		}
		
		entrada.close();
	}

}
