package projetoSistemaBancario;

public class ContaCorrente extends Conta{
	public double limite;
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double debitar(double debito) {
		if (getSaldo() + limite >= debito) {
			setSaldo(getSaldo() - debito);
		}else {
			System.out.println("Saldo Insificiente.");
		}
		return getSaldo();
	}
}
