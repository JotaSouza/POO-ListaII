package Lista2;

import java.util.Scanner;

public class PrecoArea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float precoCusto;
		String area = " ";
		int codP;
		
		System.out.println("==== Pre�o e proced�ncia do produto ====");
		System.out.print("Informe o valor de custo do produto: ");
		precoCusto = entrada.nextFloat();
		System.out.print("Informe o c�digo de origem do produto: ");
		codP = entrada.nextInt();
		
		switch(codP) {
		case 1:
			area = "Sul";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
		case 2:
			area = "Norte";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
		case 3:
			area = "Leste";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
		case 4:
			area = "Oeste";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
		case 5:
		case 6:
			area = "Nordeste";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
		case 7:
		case 8:
			area = "Centro-Oeste";
			System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
			break;
			default:
				area = "Importado";
				System.out.println("Pre�o: R$ "+precoCusto+"/"+area);
		}
		entrada.close();
	}

}
