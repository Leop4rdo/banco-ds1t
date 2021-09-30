package br.senai.sp.jandira.model;

public class Conta {
	public String tipo;
	public String numeroAgencia;
	public String titular;
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public void depositar(double valorDeposito) {
		//System.out.println("Depositando R$" + valorDeposito + " na "
		//				+ "\nconta de " + titular + "...\n");
		
		if (valorDeposito < 0) {
			System.out.println("Valor incorreto!"
							+ "\nnão foi possivel efetuar o"
							+ "\ndeposito.");
			
		} else {
			saldo += valorDeposito;
			
			//System.out.println("Deposito realizado com \nsucesso\n");
		}
		
		//System.out.println();
	}
	
	public boolean sacar(double valorSaque) {
		System.out.println("Sacando R$" + valorSaque + " na conta "
						+ "\nde " + titular + "...\n");
		
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
				+ "\nconta de " + titular + "\npara a conta de \n"+ contaDestino.titular + "...\n");
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Impossivel realizar \ntransferencia!\n");
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("--------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
		System.out.println("--------------------------\n");
	}
}



