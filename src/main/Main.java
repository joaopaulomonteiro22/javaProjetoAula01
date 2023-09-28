
//identificacao do pacote

package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Cliente;

//declaracao da classe 
public class Main {
	// método /funcao executar a classe
	public static void main(String[] args) {
		// imprimindo mensagem
		
		System.out.println(" \n** CADASTRO DE CLIENTE:***\n ");
		Cliente cliente = new Cliente();

		Scanner scanner = new Scanner(System.in);

		cliente.setName(scanner.nextLine());
		cliente.setCpf(scanner.nextLine());
		cliente.setId(UUID.randomUUID());
		cliente.setEmail(scanner.nextLine());
		// imprimindo os dados do cliente
		System.out.println("\n Dados do cliente:");
		System.out.println("id......:" + cliente.getId());
		System.out.println("nome....." + cliente.getName());
		System.out.println("cpf... " + cliente.getCpf());
		System.out.println("email...." + cliente.getEmail());

	}

}
