package Luiza;

import java.util.Scanner;

// Criando noddas pr�prias fun��es

/* 
 * Fa�a um programa, que receba diversos nomes
 * de frutas do usu�rio e no final imprima essas
 * frutas em ordem contr�rias. O programa deve
 * solicitar ao usu�rio quantas frutas ele quer informar
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
	// vari�veis globais
	
	// somente inicializa o vetor
	static String arrayFrutas[];

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd; // vari�vel local

		System.out.println("Informe a quantidade de frutas para cadastro:");
		qtd = Integer.parseInt(teclado.nextLine()); //qtd = teclado.nextInt();	
		
		cadastrarDados(qtd);
		
		mostrarDados(qtd);
		
		teclado.close();
	}
	
	// Uma fun��o que realiza o cadastro do nome das frutas
	static void cadastrarDados(int quantidade) {
		// definindo tamanho do vetor
		arrayFrutas = new String[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe o nome de uma fruta:");
			arrayFrutas[i] = teclado.nextLine();
		}
	}
	
	// Uma fun��o que mostra as frutas cadastradas
	static void mostrarDados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(arrayFrutas[i]);
		}
	
	}
	
}
