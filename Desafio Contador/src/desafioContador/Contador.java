package desafioContador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int parametro1 = terminal.nextInt();
		System.out.println("Digite o segundo número: ");
		int parametro2 = terminal.nextInt();
		
		ParametroInvalidosException parametro = new ParametroInvalidosException();
		parametro.parametro(parametro1, parametro2);
		
	terminal.close();	
	}

}
