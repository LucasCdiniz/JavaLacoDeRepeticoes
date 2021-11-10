package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int i,num,par =0, impar=0;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			System.out.print("Informe um número: ");
			num = ler.nextInt();
			
			if(num%2==0) {
				par+=1;
			}else {
				impar+=1;
			}
		}
		
		System.out.println("A quantidade de pares foi de " + par);
		System.out.println("A quantidade de ímpares foi de " + impar);
		
	}

}
