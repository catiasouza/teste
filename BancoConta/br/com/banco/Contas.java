package br.com.banco;

import java.util.Scanner;

public class Contas {
	

	public static void main(String[] args) {
		
		
		ContaBancaria cb = new ContaBancaria();
		ContaBancaria cc = new ContaCorrente();
		ContaBancaria cp = new ContaPoupanca();
		
		Scanner s = new Scanner(System.in);
		
		String saldo;
		int nunConta;
		String dono;
		String tipo;
		int deposito;
		int transferencia;
		int saque;
		
		
		 System.out.println("**** Conta Poupanca ****");
		
		
		 
		 System.out.print("Entre com seu nome:  ");
		 dono = s.next();
		 cp.setDono(dono);
		 
		 System.out.print("Entre com o numero da conta:  ");
		 nunConta = s.nextInt();
		 cp.setNunConta(nunConta);
		 
		 System.out.print("Valor do deposito: ");
		 deposito = s.nextInt();
		 cp.depositar(deposito);
		 
		 System.out.print("Valor a ser transferido: ");
		 transferencia = s.nextInt();
		 cp.transferir(cc, transferencia);
		 
		 System.out.print("Valor de saque: ");
		 saque = s.nextInt();
		 cp.sacar(saque);
		 
		 
		 System.out.println("Correntista  " + cp.getDono());
		 System.out.println("Numero Conta  "+ cp.getNunConta());
		 System.out.println("Valor de deposito " + deposito);
		 System.out.println("Valor da transferencia  " + transferencia);
		 System.out.println("Valor de saque " + saque);
		 System.out.println("Seu novo saldo e  " + cp.getSaldo());
		 
		 
		 
		 System.out.println("");
		 System.out.println("**** CONTA Corrente ****");
		 System.out.print("Entre com seu nome: ");
		 dono = s.next();
		 cc.setDono(dono);
		 
		 System.out.print("Entre com o numero da conta: ");
		 nunConta = s.nextInt();
		 cc.setNunConta(nunConta);
		 
		 System.out.print("Valor deposito: ");
		 deposito = s.nextInt();
		 cc.depositar(deposito);
		 
		 System.out.print("Valor a ser transferido: ");
		 transferencia = s.nextInt();
		 cc.transferir(cc, transferencia);
		 System.out.print("valor de saque: ");
		 saque = s.nextInt();
		 cc.sacar(saque);
		
		
		 System.out.println("Numero Conta  "+ cc.getNunConta());
		 System.out.println("Valor de deposito " + deposito);
		 System.out.println("Valor da transferencia  " + transferencia);
		 System.out.println("Valor de saque " + saque);
		 System.out.println("Seu saldo e  " + cc.getSaldo());
			
		 
	
		
		
		
	}
}
