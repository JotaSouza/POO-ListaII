package Lista2;

import java.util.Scanner;

public class NotasConceito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, media;
		
		System.out.print("Digite o valor da primeira nota: ");
		n1 = entrada.nextFloat();
		System.out.print("Digite o valor da segunda nota: ");
		n2 = entrada.nextFloat();
		
		media = (n1 + n2)/2;
		
		if (media >= 9 && media <=10) {
			System.out.println("A primeira nota é: "+n1);
			System.out.println("A segunda nota é: "+n2);
			System.out.println("A média foi de: "+media);
			System.out.println("Conceito do aluno é A");
			System.out.println("APROVADO");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("A primeira nota é: "+n1);
			System.out.println("A segunda nota é: "+n2);
			System.out.println("A média foi de: "+media);
			System.out.println("Conceito do aluno é B");
			System.out.println("APROVADO");
		} else if (media >=6 && media < 7.5) {
			System.out.println("A primeira nota é: "+n1);
			System.out.println("A segunda nota é: "+n2);
			System.out.println("A média foi de: "+media);
			System.out.println("Conceito do aluno é C");
			System.out.println("APROVADO");
		} else if (media >= 4 && media < 6) {
			System.out.println("A primeira nota é: "+n1);
			System.out.println("A segunda nota é: "+n2);
			System.out.println("A média foi de: "+media);
			System.out.println("Conceito do aluno é D");
			System.out.println("REPROVADO");
		} else {
			System.out.println("A primeira nota é: "+n1);
			System.out.println("A segunda nota é: "+n2);
			System.out.println("A média foi de: "+media);
			System.out.println("Conceito do aluno é E");
			System.out.println("REPROVADO");
		}
		
		entrada.close();	

	}

}
