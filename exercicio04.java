package pkgLacosDeRepeticao;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:

*o n�mero de pessoas calmas;
*o n�mero de mulheres nervosas;
*o n�mero de homens agressivos;
*o n�mero de outros calmos;
*o n�mero de pessoas nervosas com mais de 40 anos;
*o n�mero de pessoas calmas com menos de 18 anos.
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
			
			System.out.print("Escolha uma das op��es que combine com sua personalidade\n\n1 - Calma\n2 - Nervoso\n3 - Agressivo\nResposta: ");
			persona = ler.nextInt();
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");

			
			//Valida��o de pessoas da quantidade de pessoas calmas
			if(persona==1) {
				contCalma++;
			}
			//Valida��o de Outros que escolheram calmo
			else if(sexo ==3 && persona ==1) {
				outrosCalmos++;
			}
			//Valida��o da quantidade de mulheres nervosas
			else if(sexo ==1 && persona ==2) {
				mulNerv++;
			}
			//Valida��o da quantidade de homens afressivos
			else if(sexo ==2 && persona ==3) {
				homAgr++;
			}
			//Valida��o de pessoas acima de 40 e nervosas
			else if(idade>40 && persona ==2) {
				nervacm++;
			}
			//Valida��o de pessoas abixo de 18 e calmas
			else if(idade<18 && persona ==1) {
				calmabx++;
			}
			
			//Incrementa o i
			i++;
		}
		
		System.out.println("O n�mero geral de pessoas calmas � de " + contCalma);
		System.out.println("O n�mero de pessoas do sexo 3 - Outros e que s�o calmas � de " + outrosCalmos);
		System.out.println("O n�mero de pessoas do sexo 1 - Feminino e que s�o nervosas � de  " + mulNerv);
		System.out.println("O n�mero de pessoas do sexo 2 - Masculino e que s�o agressivos � de " + homAgr);
		System.out.println("O n�mero de pessoas acima de 40 anos e que s�o nervosas � de " + nervacm);
		System.out.println("O n�mero de pessoas abaixo de 18 anos e que s�o calmas � de " + calmabx);
		
	}
}
