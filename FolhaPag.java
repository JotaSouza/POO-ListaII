package Lista2;

import java.util.Scanner;

public class FolhaPag {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salLiquido, salBruto, IR, INSS, FGTS, valHora, valSind, desconto;
		int horasT;
		String info = "ISENTO";
		 System.out.println(" ==== FolhaPag ====");
		 System.out.print("Informe quanto você ganha por hora trabalhada: ");
		 valHora = entrada.nextFloat();
		 System.out.print("Informe o total de horas trabalhadas no mês: ");
		 horasT = entrada.nextInt();
		 
		 salBruto = horasT * valHora;
		 
		 if(salBruto <= 900) {
			 System.out.println("Salário Bruto: R$ "+salBruto);
			 System.out.println("(-)IR (5%): "+info);
			 INSS = (salBruto*10)/100;
			 System.out.println("(-)INSS: R$ "+INSS);
			 FGTS = (salBruto*11)/100;
			 System.out.println("FGTS: R$ "+FGTS);
			 valSind = (salBruto*3)/100;
			 desconto = (INSS + valSind);
			 System.out.println("Total de descontos: R$ "+desconto);
			 salLiquido = salBruto - desconto;
			 System.out.println("Salário Liquido: R$ "+salLiquido);
		 } else if (salBruto > 900 && salBruto <= 1500) {
			 System.out.println("Salário Bruto: R$ "+salBruto);
			 IR = (salBruto*5)/100;
			 System.out.println("(-)IR (5%): "+IR);
			 INSS = (salBruto*10)/100;
			 System.out.println("(-)INSS: R$ "+INSS);
			 FGTS = (salBruto*11)/100;
			 System.out.println("FGTS: R$ "+FGTS);
			 valSind = (salBruto*3)/100;
			 desconto = (INSS + valSind + IR);
			 System.out.println("Total de descontos: R$ "+desconto);
			 salLiquido = salBruto - desconto;
			 System.out.println("Salário Liquido: R$ "+salLiquido);
		 } else if (salBruto > 1500 && salBruto <= 2500) {
			 System.out.println("Salário Bruto: R$ "+salBruto);
			 IR = (salBruto*10)/100;
			 System.out.println("(-)IR (10%): "+IR);
			 INSS = (salBruto*10)/100;
			 System.out.println("(-)INSS: R$ "+INSS);
			 FGTS = (salBruto*11)/100;
			 System.out.println("FGTS: R$ "+FGTS);
			 valSind = (salBruto*3)/100;
			 desconto = (INSS + valSind + IR);
			 System.out.println("Total de descontos: R$ "+desconto);
			 salLiquido = salBruto - desconto;
			 System.out.println("Salário Liquido: R$ "+salLiquido);
		 } else {
				 System.out.println("Salário Bruto: R$ "+salBruto);
				 IR = (salBruto*20)/100;
				 System.out.println("(-)IR (20%): "+IR);
				 INSS = (salBruto*10)/100;
				 System.out.println("(-)INSS: R$ "+INSS);
				 FGTS = (salBruto*11)/100;
				 System.out.println("FGTS: R$ "+FGTS);
				 valSind = (salBruto*3)/100;
				 desconto = (INSS + valSind + IR);
				 System.out.println("Total de descontos: R$ "+desconto);
				 salLiquido = salBruto - desconto;
				 System.out.println("Salário Liquido: R$ "+salLiquido);
		 }
		 
		 entrada.close();

	}

}
