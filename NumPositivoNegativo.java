package Lista2;

import java.util.Scanner;

public class NumPositivoNegativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num;
		System.out.print("Informe um n�mero: ");
		num = entrada.nextFloat();
		
		if(num > 0) {
			System.out.println("O valor informado � positivo");
		} else if (num < 0) {
			System.out.println("O valor informado � negativo");
		} else {
			System.out.println("O valor informado � zero");
		}
		
		entrada.close();
	}

}
