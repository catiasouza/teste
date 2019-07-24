package br.com.banco;

public class Cliente {
	private ContaCorrente cc;
	private ContaPoupanca cp;
	
	private int nunConta;
	private String correntista;
	
	

	public Cliente(ContaCorrente cc, ContaPoupanca cp, int nunConta, String correntista) {
		super();
		this.cc = cc;
		this.cp = cp;
		this.nunConta = nunConta;
		this.correntista = correntista;
	}

	public ContaCorrente getCc() {
		return cc;
	}

	public void setCc(ContaCorrente cc) {
		this.cc = cc;
	}

	public ContaPoupanca getCp() {
		return cp;
	}

	public void setCp(ContaPoupanca cp) {
		this.cp = cp;
	}

	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	
	
	
	
}
