package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("\nInforme um número: ");
			num = ler.nextInt();
			soma+=num;
			
		}while(num !=0);
		
		System.out.println("A soma do números até o momento em que foi informado o zero é de: " + soma);
	}

}
