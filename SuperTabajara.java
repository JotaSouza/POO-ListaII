package Lista2;

import java.util.Scanner;

public class SuperTabajara {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int opcao;
		String tipoCarne = " ", tipoPag = " ";
		float qtdCarne = 0, valCompra = 0, desconto = 0, precoFinal;
		
		System.out.println("=== Promo��o de Carnes Super Tabajara ===");
		System.out.println("            At� 5kg --- Acima de 5kg");
		System.out.println("Fil� Duplo:   R$ 4,90 | R$ 5,80");
		System.out.println("Alcatra:      R$ 5,90 | R$ 6,80");
		System.out.println("Picanha:      R$ 6,90 | R$ 7,80");
		System.out.println("==========================================");
		System.out.println("Escolha o tipo de carne.");
		System.out.println("Digite 1 - Fil� Duplo");
		System.out.println("Digite 2 - Alcatra");
		System.out.println("Digite 3 - Picanha");
		System.out.print("Op��o-> ");
		opcao = in.nextInt();
		
		switch(opcao) {
		case 1:
			tipoCarne = "Fil� Duplo";
			System.out.print("Quantidade desejada: ");
			qtdCarne = in.nextFloat();
			if (qtdCarne <= 5) {
				valCompra = (float) (qtdCarne * 4.90);
			} else {
				valCompra = (float) (qtdCarne * 5.80);
			}			
			break;
		case 2:
			tipoCarne = "Alcatra";
			System.out.print("Quantidade desejada: ");
			qtdCarne = in.nextFloat();
			if (qtdCarne <= 5) {
				valCompra = (float) (qtdCarne * 5.90);
			} else {
				valCompra = (float) (qtdCarne * 6.80);
			}			
			break;
		case 3:
			tipoCarne = "Picanha";
			System.out.print("Quantidade desejada: ");
			qtdCarne = in.nextFloat();
			if (qtdCarne <= 5) {
				valCompra = (float) (qtdCarne * 6.90);
			} else {
				valCompra = (float) (qtdCarne * 7.80);
			}			
			break;
			default:
				System.out.println("Op��o inv�lida!");
		}
		
		System.out.println("Forma de pagamento:");
		System.out.println("1 - Cart�o de Cr�dito");
		System.out.println("2 - � Vista");
		System.out.print("Op��o-> ");
		opcao = in.nextInt();
		
		if(opcao == 1) {
			desconto = (float) (valCompra * 0.05);
			precoFinal = valCompra - desconto;
			tipoPag = "Cart�o de Cr�dito";
		} else {
			precoFinal = valCompra;
			tipoPag = "� Vista";
		}
		System.out.println("===============================");
		System.out.println("======== Super Tabajara =======");
		System.out.println("===============================");
		System.out.println("Tipo de carne: "+tipoCarne);
		System.out.println("Quantidade comprada:"+qtdCarne+"kg");
		System.out.println("Valor total da compra: R$ "+valCompra);
		System.out.println("Tipo de pagamento: "+tipoPag);
		System.out.println("Desconto: R$ "+desconto);
		System.out.printf("Valor a pagar: R$ %.2f",precoFinal);
		
		in.close();

	}

}
