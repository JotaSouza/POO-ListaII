package Lista2;

import java.util.Scanner;

public class FormaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.print("Informe o tamanho do primeiro lado: ");
		lado1 = entrada.nextInt();
		System.out.print("Informe o tamanho do segundo lado: ");
		lado2 = entrada.nextInt();
		System.out.print("Informe o tamanho do terceiro lado: ");
		lado3 = entrada.nextInt();
		
		if(lado1 + lado2 > lado3){
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Triângulo Isósceles");
			}else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é possível formar um triângulo");
		}
		
		entrada.close();
	}

}
