package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int idade=0, jovem=0, velho=0, cont=1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\t\tDigite -99 para finalizar o programa e conferir o somat�rio\n\n");
		
		while(idade != -99) {
			
			System.out.print("Informe a idade da " + (cont++) + "� pessoa: ");
			idade = ler.nextInt();
			
			if(idade<21 && idade!=-99) {
				jovem++;
			}else if(idade>50) {
				velho++;
			}
			
		}
		
		
		System.out.println("A quantidade de pessoas com a idade abaixo de 21 anos � igual a " + jovem + " pessoas");
		
		System.out.println("A quantidade de pessoas com a idade acima de 50 anos � igual a " + velho + " pessoas");

	}

}
