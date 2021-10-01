package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {
	
	public static void main(String[] args) {
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.setNumeroAgencia("4214-9");;
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setNumeroAgencia("4214-9");
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setNumeroAgencia("4214-9" );
		
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
