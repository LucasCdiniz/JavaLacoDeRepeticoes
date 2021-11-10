package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:

*o número de pessoas calmas;
*o número de mulheres nervosas;
*o número de homens agressivos;
*o número de outros calmos;
*o número de pessoas nervosas com mais de 40 anos;
*o número de pessoas calmas com menos de 18 anos.
*/
		
		int i=0, idade, sexo, persona,
		contCalma=0, outrosCalmos=0, mulNerv=0, homAgr=0, nervacm=0,calmabx=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(i<150) {
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("Informe a sua idade: ");
			idade = ler.nextInt();
			
			System.out.print("Informe o seu sexo\n1 - Feminino\n2 - Masculino\n3 - Outros\nResposta: ");
			sexo = ler.nextInt();
			
			System.out.print("Escolha uma das opções que combine com sua personalidade\n\n1 - Calma\n2 - Nervoso\n3 - Agressivo\nResposta: ");
			persona = ler.nextInt();
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");

			
			//Validação de pessoas da quantidade de pessoas calmas
			if(persona==1) {
				contCalma++;
			}
			//Validação de Outros que escolheram calmo
			else if(sexo ==3 && persona ==1) {
				outrosCalmos++;
			}
			//Validação da quantidade de mulheres nervosas
			else if(sexo ==1 && persona ==2) {
				mulNerv++;
			}
			//Validação da quantidade de homens afressivos
			else if(sexo ==2 && persona ==3) {
				homAgr++;
			}
			//Validação de pessoas acima de 40 e nervosas
			else if(idade>40 && persona ==2) {
				nervacm++;
			}
			//Validação de pessoas abixo de 18 e calmas
			else if(idade<18 && persona ==1) {
				calmabx++;
			}
			
			//Incrementa o i
			i++;
		}
		
		System.out.println("O número geral de pessoas calmas é de " + contCalma);
		System.out.println("O número de pessoas do sexo 3 - Outros e que são calmas é de " + outrosCalmos);
		System.out.println("O número de pessoas do sexo 1 - Feminino e que são nervosas é de  " + mulNerv);
		System.out.println("O número de pessoas do sexo 2 - Masculino e que são agressivos é de " + homAgr);
		System.out.println("O número de pessoas acima de 40 anos e que são nervosas é de " + nervacm);
		System.out.println("O número de pessoas abaixo de 18 anos e que são calmas é de " + calmabx);
		
	}
}
