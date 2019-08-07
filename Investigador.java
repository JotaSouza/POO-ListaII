package Lista2;

import java.beans.Encoder;
import java.util.Scanner;

public class Investigador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String perg1, perg2, perg3, perg4, perg5;
		int contador;
		
		System.out.println("==== Responda SIM ou NÃO sobre o crime ====");
		System.out.println("Telefonou para a vítima? R: ");
		perg1 = entrada.nextLine();
		//entrada.nextLine();
		System.out.println("Esteve no local do crime? R: ");
		perg2 = entrada.nextLine();
		//entrada.nextLine();
		System.out.println("Mora perto da vítima? R: ");
		perg3 = entrada.nextLine();
		//entrada.hasNextLine();
		System.out.println("Devia para vítima? R: ");
		perg4 = entrada.nextLine();
		//entrada.nextLine();
		System.out.println("Já trabalhou com a vítima? R: ");
		perg5 = entrada.nextLine();
		
		if (perg1 == "SIM" || perg1 == "sim") {
			contador = 1;
		} else {
			contador = 0;
		}
		
		if (perg2 == "SIM" || perg2 == "sim") {
			contador = contador + 1;
		} else {
			contador = 0;
		}
		
		if (perg3 == "SIM" || perg3 == "sim") {
			contador = contador + 1;
		} else {
			contador = 0;
		}
		
		if (perg4 == "SIM" || perg4 == "sim") {
			contador = contador + 1;
		} else {
			contador = 0;
		}
		
		if (perg5 == "SIM" || perg5 == "sim") {
			contador = contador + 1;
		} else {
			contador = 0;
		}
		
		switch (contador) {
		case 1:
		case 2:
			System.out.println("Status: Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Status: Cúmplice");
			break;
		case 5:
			System.out.println("Status: Assassino(a)");
			break;
			default:
				System.out.println("Status: Inocente");
				break;				
		}
		
		entrada.close();

	}

}
