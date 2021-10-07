package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {
	
	public static void main(String[] args) {
		////// CRIAÇÃO AGENCIA
		Agencia agenciaTeste = new Agencia();
		agenciaTeste.setCidade("Jandira - SP");
		agenciaTeste.setNomeGerente("Josescrildo Wagner");
		agenciaTeste.setNumero("4214-9");
		agenciaTeste.setTelefone("198310983136");
		
		
		////// CRIAÇÃO CLIENTES
		
		// Criação do cliente maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria.antonieta@cliente.com");
		clienteMaria.setSalario(5800);
		
		// Criação cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro.cabral@cliente.com");
		clientePedro.setSalario(5200);
		
		
		// Criação cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana.gomes@cliente.com");
		clienteAna.setSalario(23100);
		
		////// CRIAÇÃO CONTAS
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agenciaTeste);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agenciaTeste);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agenciaTeste);
		
		// Exibir os detalhes das contas
		// contaMaria.exibirDetalhes();
		// contaPedro.exibirDetalhes();
		// contaAna.exibirDetalhes();
		
		contaMaria.depositar(500);
		
		// contaMaria.sacar(100);
		// contaMaria.exibirDetalhes();
		
		contaMaria.transferir(contaPedro, 200);
		
		System.out.println("Tipo da Conta de Maria:\n"+ contaMaria.getTipo() + "\n");
		
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();	
		contaAna.exibirDetalhes();
	}
}
