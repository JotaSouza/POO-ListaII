package Lista2;

import java.util.Scanner;

public class TransformaNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int num;
		 System.out.print("Informe um n�mero inteiro: ");
		 num = entrada.nextInt();
		 
		 if(num % 2 == 0) {
			 num = num + 1;
			 System.out.println("Voc� informou um n�mero par, mas eu mudei ele para o n�mero �mpar "+num);
		 } else if (num % 2 != 0) {
			 num = num + 1;
			 System.out.println("Voc� informou um n�mero �mpar, mas eu mudei ele para o n�mero par "+num);
		 }
		 
		 entrada.close();
		 

	}

}
