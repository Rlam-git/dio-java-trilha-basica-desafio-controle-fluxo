package controle;

import java.util.Scanner;

public class Contador {

	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			terminal.close();
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O primeiro parametro é maio que o segundo tente novamente.");
		}
		
	}	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {			
			System.out.println("Número é " + i);
		}
				
	}

}
