package Switch1;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		int item, quantidade;
		double valor=0, valortotal=0;
		double item1=10, item2=15, item3=18, item4=12, item5=8, item6=13;
		Scanner ler = new Scanner(System.in);
		System.out.println("\n\t\tMenu de Restaurante");
		System.out.println("\n1- Cachorro Quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de Laranja");
		System.out.println("\nDigite sua opção: ");
		item = ler.nextInt();
		switch (item) {
		case 1:
			valor=item1;
			break;
		case 2:
			valor=item2;
			break;
		case 3:
			valor=item3;
			break;
		case 4:
			valor=item4;
			break;
		case 5:
			valor=item5;
			break;
		case 6:
			valor=item6;
			break;
		default:
			System.out.println("Por favor, digite uma opção válida.");
		}
		System.out.println("Insira a quantidade desejada:");
		quantidade = ler.nextInt();
		valortotal=valor*quantidade;
		System.out.println("O valor total de sua compra é: R$ "+ valortotal);
		

	}



	}


