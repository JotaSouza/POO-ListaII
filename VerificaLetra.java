package Lista2;

import java.util.Scanner;

public class VerificaLetra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char sexo = 0;
		System.out.print("Informe o sexo no formato F ou M: ");
		sexo = entrada.next() .charAt(sexo);
		
		if(sexo == 'F' || sexo =='f') {
			System.out.println("F - Feminino");
		} else if (sexo =='M' || sexo == 'm') {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido!");
		}
		
		entrada.close();
	}

}
