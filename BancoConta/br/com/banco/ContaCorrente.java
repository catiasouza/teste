package br.com.banco;

public class ContaCorrente extends ContaBancaria{
		
	public ContaCorrente() {
		this.setSaldo(saldo);
		this.setNunConta(nunConta);
		
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double quantidade) {
		this.saldo += quantidade ;
	}
	public void sacar(double quantidade) {
		quantidade = quantidade + 10;
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	public void transferir(ContaBancaria destino, double valor) {
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
		destino.saldo = novoSaldo;
	}
	

	

}
