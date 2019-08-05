package Lista2;

import java.util.Scanner;

public class TurnoAula {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char op = 0;
		
		System.out.println("Em que turno você estuda?");
		System.out.print("Responda da seguinte forma: ");
		System.out.println(" M - Matutino, V-Vespertino ou N- Noturno.");
		System.out.print("Opção -> ");
		op = entrada.nextLine() .charAt(op);
		
		if(op == 'M' || op == 'm') {
			System.out.println("Bom Dia!");
		} else if (op == 'V' || op == 'v') {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		
		entrada.close();
	}

}
