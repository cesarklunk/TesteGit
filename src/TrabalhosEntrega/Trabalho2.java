package TrabalhosEntrega;

import java.util.Scanner;

public class Trabalho2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o nome completo: ");
		String nomeCompleto = in.nextLine();
		String nomePedacos[] = nomeCompleto.split(" ");
		int n;
		String saida = (" ");
		
		for(n=0 ; n<nomePedacos.length ; n++)
		{
			if(n == 0 || n == (nomePedacos.length-1))
				saida = saida + nomePedacos[n];
			else
				saida = saida + " " + nomePedacos[n].charAt(0) + " ";
			
		}
		System.out.println("Nome abreviado: ");
		System.out.println(saida);

	}
	
	}


