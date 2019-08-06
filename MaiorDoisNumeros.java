package Lista2;

import java.util.Scanner;

public class MaiorDoisNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		System.out.print("Digite um número inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Digite outro número inteiro: ");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("O número "+num1+" é maior que o número "+num2);
		}else {
			System.out.println("O número "+num2+" é maior que o número "+num1);
		}
		
		entrada.close();
	}

}
