package Lista2;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		float delta, raiz, raiz1, raiz2;
		
		System.out.println("==== Calcula equação de 2º grau na forma ax²+bx+c ====");
		System.out.print("Informe um valor para o coeficiente A: ");
		a = entrada.nextInt();
		
		if (a == 0) {
			System.out.println("Coeficiente A igual a zero. A equação não é do segundo grau!");
			System.out.println("Encerrando o sistema...");
		} else {
			System.out.print("Informe um valor para o coeficiente B: ");
			b = entrada.nextInt();
			System.out.print("Informe um valor para o coeficiente C: ");
			c = entrada.nextInt();
			delta = (b * b) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
				System.out.println("Encerrando o sistema...");
			} else if (delta == 0) {
				raiz = (-1)*b / (2 * a);
				System.out.println("Equação possui apenas uma raiz real. Delta = 0, raiz = "+raiz);
			} else {
				raiz1 = (float) (((-1)*b + Math.sqrt(delta)) / (2 * a));
				raiz2 = (float) (((-1)*b - Math.sqrt(delta)) / (2 * a));
				System.out.println("Equação possui duas raízes reais. Delta > 0, raizes: "+raiz1+" e "+raiz2);
			}
		}
		
		entrada.close();
		
		

	}

}
