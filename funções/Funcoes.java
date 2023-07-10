package Luiza;

import java.util.Scanner;

// Criando noddas próprias funções

/* 
 * Faça um programa, que receba diversos nomes
 * de frutas do usuário e no final imprima essas
 * frutas em ordem contrárias. O programa deve
 * solicitar ao usuário quantas frutas ele quer informar
 * 
 * Informe quantas frutas deseja cadastrar:
 * 2
 * 
 * Informe o nome de uma fruta:
 * Manga
 * 
 * Informe o nome de uma fruta:
 * Goiaba
 * 
 * Goiaba
 * Manga
 */


import java.util.Scanner;

public class Funcoes {
	// variáveis globais
	
	// somente inicializa o vetor
	static String arrayFrutas[];

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd; // variável local

		System.out.println("Informe a quantidade de frutas para cadastro:");
		qtd = Integer.parseInt(teclado.nextLine()); //qtd = teclado.nextInt();	
		
		cadastrarDados(qtd);
		
		mostrarDados(qtd);
		
		teclado.close();
	}
	
	// Uma função que realiza o cadastro do nome das frutas
	static void cadastrarDados(int quantidade) {
		// definindo tamanho do vetor
		arrayFrutas = new String[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe o nome de uma fruta:");
			arrayFrutas[i] = teclado.nextLine();
		}
	}
	
	// Uma função que mostra as frutas cadastradas
	static void mostrarDados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(arrayFrutas[i]);
		}
	
	}
	
}
