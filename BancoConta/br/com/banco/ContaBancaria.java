package br.com.banco;


public class ContaBancaria {
	
	public int nunConta;
	protected String dono;
	protected double saldo;
	protected String tipo;
	

	public ContaBancaria() {
		super();
		
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getTipo() {
		
			return tipo;
		}
	

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
	
	public void descontar(double taxa) {
		double novoSaldo = this.saldo + taxa;
		this.saldo = novoSaldo;
		 
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	}
	

