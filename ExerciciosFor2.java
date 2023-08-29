package ListadeExerciciosFor2;

import java.util.Scanner;

public class ExerciciosFor2 {

	public static void main(String[] args) {
		int[] num = new int[11];
		int contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int x= 0; x<10; x++) {
			System.out.println("Insira o "+(x+1)+"º número da sequência");
			num[x] = leia.nextInt();
	
			}
		for (int i=0; i<=10; i++) {
		if (num[i]%2==0) {
			contPar++;
			
		}else {
			contImpar++;
		}
			
	}
		System.out.println("\n\tOs números pares inseridos são: " +contPar);
		System.out.println("\n\tOs números ímpares inseridos são: " +contImpar);
		
	}

}

