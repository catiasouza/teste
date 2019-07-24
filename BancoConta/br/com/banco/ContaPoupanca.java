package br.com.banco;

public class ContaPoupanca extends ContaBancaria{
	
	
	
		public ContaPoupanca() {
			this.setSaldo(saldo);
			this.setNunConta(nunConta);
		
		
	}
		public double getSaldo() {
			return this.saldo;
		}
		public void depositar(double quantidade) {
			this.saldo += quantidade;
		}
		public void sacar(double quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
		}
		public void transferir(ContaBancaria destino, double valor) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			destino.saldo = destino.saldo -valor;
		}
		
	
		
	}


