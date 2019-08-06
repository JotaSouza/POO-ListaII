package Lista2;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char letra = 0;
		
		System.out.println("==== Verifica se vogal ou consoante ====");
		System.out.print("Informe uma letra: ");
		letra = entrada.nextLine() .charAt(letra);
		
		switch(letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("A letra informada é uma vogal");
			break;
			
			default:
				System.out.println("A letra informada é uma consoante");
		}
		
		entrada.close();
	}

}
