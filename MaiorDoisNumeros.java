package Lista2;

import java.util.Scanner;

public class MaiorDoisNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		System.out.print("Digite um n�mero inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("O n�mero "+num1+" � maior que o n�mero "+num2);
		}else {
			System.out.println("O n�mero "+num2+" � maior que o n�mero "+num1);
		}
		
		entrada.close();
	}

}
