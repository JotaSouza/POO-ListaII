package Lista2;

import java.util.Scanner;

public class DadosPesoIdeal {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		float pesoA, pesoH, pesoF, altura;
		char sexo = 0;
		System.out.println("==== Calcula Peso Ideal =====");
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		entrada.nextLine();
		System.out.print("Informe seu peso: ");
		pesoA = entrada.nextFloat();
		entrada.hasNextLine();
		System.out.print("Digite H ou M para especificar o sexo: ");
		sexo = entrada.next().charAt(sexo);
		
		if(sexo == 'H' || sexo == 'h') {
			pesoH = (float) ((72.7*altura)-58);
			System.out.println("=== Seus dados ===");
			System.out.println("Altura: "+altura);
			System.out.println("Peso: "+pesoA);
			System.out.println("Sexo: "+sexo);			
			System.out.println("Seu peso ideal é de "+pesoH+"kg.");
			if(pesoA > pesoH) {
				System.out.println("Você está acima do peso");
			} else if (pesoA < pesoH) {
				System.out.println("Você está abaixo do peso");
			} else {
				System.out.println("Você está no peso ideal");
			}
		} else if (sexo == 'M' || sexo == 'm') {
			pesoF = (float) ((62.1*altura)-44.7);
			System.out.println("=== Seus dados ===");
			System.out.println("Altura: "+altura);
			System.out.println("Peso: "+pesoA);
			System.out.println("Sexo: "+sexo);			
			System.out.println("Seu peso ideal é de "+pesoF+"kg.");
			if(pesoA > pesoF) {
				System.out.println("Você está acima do peso");
			} else if (pesoA < pesoF) {
				System.out.println("Você está abaixo do peso");
			} else {
				System.out.println("Você está no peso ideal");
			}
			System.out.println("Seu peso ideal é de "+pesoF+"kg.");
		} else {
			System.out.println("Opção inválida");
		}
		
		entrada.close();


	}

}
