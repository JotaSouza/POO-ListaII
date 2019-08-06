package Lista2;

import java.util.Scanner;

public class CenDezUni {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, uni, dez, cent;
		
		System.out.print("Digite um numero > 0 e < 1000: ");
		num = entrada.nextInt();
		
		uni = num % 10;
		num = (num - uni)/10;
		dez = num % 10;
		num = (num - dez)/10;
		cent = num;
		
		System.out.println(cent+" centena(s), "+dez+" dezena(s) "+uni+" unidade(s).");
		
		entrada.close();

	}

}
