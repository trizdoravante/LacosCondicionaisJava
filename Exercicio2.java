package Exercicios;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int A,B,C, D;
		Scanner leia = new Scanner(System.in);
		System.out.println ("\nInsira o primeiro valor, ou A:");
		A = leia.nextInt();
		System.out.println ("\nInsira o segundo valor, ou B:");
		B = leia.nextInt();
		System.out.println ("\nInsira o terceiro valor, ou C:");
		C = leia.nextInt();
		D= A+B;
		if(D > C) {
			System.out.println ("\nA soma de A e B:"+ D + " é maior do que C");
		}
		else if(D==C) {
			System.out.println("\n A soma de A e B:"+D+ " é igual a C");
		}
			else {
				System.out.println("A soma de A e B:" + D +" é menor que C");
			}
			
				
			}
{

	}

}
