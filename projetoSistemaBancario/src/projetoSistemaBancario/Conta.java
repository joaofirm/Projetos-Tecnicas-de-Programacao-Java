package projetoSistemaBancario;

public class Conta {
	private int codigo;
	private double saldo;
	private String cliente;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	public void creditar(double credito) {
		saldo = saldo + credito;
		System.out.println("Saldo atual R$: " + saldo);
	}
	
	public void debitar(double debito) {
		if (saldo < debito) {
			System.out.println("Saldo insuficiente.");
		}else {
			saldo = saldo - debito;
			System.out.println("Saldo atual é R$:" + saldo);
		}
	}

}
