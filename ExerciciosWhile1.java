package ListadeExerciciosWhile1;

import java.util.Scanner;

public class ExerciciosWhile1 {

	public static void main(String[] args) {
		int idade=1, contMenor=0, contMaior=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade>=0){
        System.out.println("Insira uma idade qualquer.");
        idade = leia.nextInt();
		
		if(idade<21 && idade>0) {
			contMenor++;
		} else if (idade>50) {
			contMaior++;
		}

}
		System.out.println("\nO Total de pessoas menor de 21 anos é: "+contMenor);
		System.out.println("\nO Total de pessoas maior de 50 anos é: "+contMaior);
}
}

