package Lista2;

import java.util.Scanner;

public class Investigador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String perg1 = " ", perg2 = " ", perg3 = " ", perg4 = " ", perg5 = " ";
		int contador = 0;
		
		System.out.println("==== Responda SIM ou N�O sobre o crime ====");
		System.out.print("Telefonou para a v�tima? R: ");
		perg1 = entrada.nextLine().toUpperCase();
		if (perg1.equals("SIM")) {
			contador = contador + 1;
		}
		
		System.out.print("Esteve no local do crime? R: ");
		perg2 = entrada.nextLine().toUpperCase();
		if (perg2.equals("SIM")) {
			contador = contador + 1;
		}
		
		System.out.print("Mora perto da v�tima? R: ");
		perg3 = entrada.nextLine().toUpperCase();
		if (perg3.equals("SIM")) {
			contador = contador + 1;
		}
		
		System.out.print("Devia para v�tima? R: ");
		perg4 = entrada.nextLine().toUpperCase();
		if (perg4.equals("SIM")) {
			contador = contador + 1;
		}
		
		System.out.print("J� trabalhou com a v�tima? R: ");
		perg5 = entrada.nextLine().toUpperCase();
		if (perg5.equals("SIM")) {
			contador = contador + 1;
		}
		
		/*if (contador == 1 || contador == 2) {
			System.out.println("Status: Suspeito(a)");
		} else if (contador == 3 || contador == 4) {
			System.out.println("Status: C�mplice");
		} else if (contador == 5) {
			System.out.println("Status: Assassino(a)");
		} else {
			System.out.println("Status: Inocente");
		}*/
				
		switch (contador) {
		case 1:
		case 2:
			System.out.println("Status: Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Status: C�mplice");
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
