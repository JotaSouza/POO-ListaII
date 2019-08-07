package Lista2;

import java.util.Scanner;

public class VendaFrutas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float kgMorango, kgMaca, totKg, valTotalMor, valTotalMac, valTotal;
		float precMoran1 = (float) 2.50, precMoran2 = (float) 2.20, precMac1 = (float) 1.80, precMac2 = (float) 1.50;
		
		System.out.println(" ==== Fruteira Verde ==== ");
		System.out.println("Quantos quilos de morango o senhor(a) vai comprar?");
		System.out.print("Kg/Morango: ");
		kgMorango = in.nextFloat();
		System.out.println("Quantos quilos de maçã o senhor(a) vai comprar?");
		System.out.print("Kg/Maçã: ");
		kgMaca = in.nextFloat();
		
		if(kgMorango <= 5) {
			valTotalMor = (kgMorango * precMoran1);
		} else {
			valTotalMor = (kgMorango * precMoran2);
		}
		
		if(kgMaca <= 5 ) {
			valTotalMac = (kgMaca * precMac1);
		} else {
			valTotalMac = (kgMaca * precMac2);
		}
			
		totKg = kgMaca + kgMorango;
		
		valTotal = valTotalMac + valTotalMor;
		
		if (totKg > 8 || valTotal > 25) {
			float desc = (valTotal * 10) /100;
			valTotal = valTotal - desc;
			System.out.println("Total a pagar: R$ "+valTotal);
		} else {
			System.out.println("Total a pagar: R$ "+valTotal);
		}
		
		in.close();
	}

}
