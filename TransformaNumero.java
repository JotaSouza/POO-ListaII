package Lista2;

import java.util.Scanner;

public class TransformaNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int num;
		 System.out.print("Informe um número inteiro: ");
		 num = entrada.nextInt();
		 
		 if(num % 2 == 0) {
			 num = num + 1;
			 System.out.println("Você informou um número par, mas eu mudei ele para o número ímpar "+num);
		 } else if (num % 2 != 0) {
			 num = num + 1;
			 System.out.println("Você informou um número ímpar, mas eu mudei ele para o número par "+num);
		 }
		 
		 entrada.close();
		 

	}

}
