package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		int num,x=0,cont=0, media;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("\nInforme um número: ");
			num = ler.nextInt();
			if(num%3==0) {
				x+=num;
				cont++;
			}
			
		}while(num !=0);
		
		media=x/cont;
		
		System.out.println("A média dos números múltiplos por 3 que foram inseridos é de: " + media);
	}

}
