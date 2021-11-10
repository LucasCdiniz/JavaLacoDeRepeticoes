package pkgLacosDeRepeticao;

public class exercicio01 {

	public static void main(String[] args) {
		
		System.out.println("Informando todos os números entre 1000 a 1999 que quando divididos por 11 o resto da divisão é igual a 5");
		
		for(int x=1000;x<=1999;x++) {
			if(x%11==5) {
				System.out.println(x);
			}
		}

	}

}
