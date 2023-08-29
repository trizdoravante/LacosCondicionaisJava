package ListadeExerciciosFor1;

import java.util.Scanner;

public class ExerciciosFor1 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		Scanner  leia = new Scanner(System.in);
		System.out.println("\nInsira o primeiro número:");
		num1 = leia.nextInt();
		System.out.println("\nInsira o segundo número:");
		num2 = leia.nextInt();
		if(num1 >= num2) {
			System.out.println("\nO número inserido é inválido. Por favor, insira um número válido.");
			System.out.println("Para ser considerado um número válido, o primeiro precisa ser menor que o segundo.");
		System.exit(0);
		}
		
		System.out.println("\n\tNo intervalo entre "+num1+" e "+num2+",");
		boolean encontrado=false;
		for(int x=num1; x<=num2;x++) {
			
			if (x % 3 ==0 && x % 5 ==0) {
				
				System.out.println(x+ "\n é múltiplo de 3 e de 5");
				encontrado = true;
			} 
			if(!encontrado) {
				
				System.out.println("nenhum número é múltiplo de 3 e de 5.");
				break;
				
			}
		
		
	}
	}
}




