package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	private Cliente cliente;
	private Agencia agencia;
	private TipoConta tipo;
	private String numero;
	private double saldo;
	
	// Construtor
	public Conta(String numero) {
		this.numero = numero;
	}
	
	// set-get
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	// Metodos comportamentais/especificos
	public void depositar(double valorDeposito) {
		System.out.println("Depositando R$" + valorDeposito + " na "
						+ "\nconta de " + this.cliente.getNome() + "...\n");
		
		if (valorDeposito < 0) {
			System.out.println("Valor incorreto!"
							+ "\nnão foi possivel efetuar o"
							+ "\ndeposito.");
		} else {
			saldo += valorDeposito;
			
			System.out.println("Deposito realizado com \nsucesso\n");
		}
	}

	public boolean sacar(double valorSaque) {
		System.out.println("Sacando R$" + valorSaque + " na conta "
						+ "\nde " + this.cliente.getNome() + "...\n");
		
		if (valorSaque < 0) {
			System.out.println("Valor incorreto!"
						+ "\nnão foi possivel efetuar o"
						+ "\nsaque.\n");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Valor incorreto!"
						+ "\nsaldo insuficiente.\n");
			return false;
		} else {
			saldo -= valorSaque;

			System.out.println("Saque realizado com \nsucesso\n");
			return true;
		}
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		System.out.println("Transferindo R$" + valorTransferencia + " da "
					+ "\nconta de " + this.cliente.getNome() + "\npara a conta de \n" + contaDestino.getCliente().getNome() + "...\n");
		
		boolean resultado = this.sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Impossivel realizar \ntransferencia!\n");
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("--------------------------");
		System.out.printf("Titular: %s\n", this.cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumero());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
		System.out.println("--------------------------\n");
	}
}