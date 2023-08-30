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
	
	
	public double creditar(double credito) {
		saldo += credito;
		return saldo;
	}
	
	public double debitar(double debito) {
		if (saldo >= debito) {
			saldo -= debito;
		}else {
			System.out.println("Saldo Insificiente.");
		}
		return saldo;
	}
}
