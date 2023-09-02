package projetoSistemaBancario;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(0);
		cliente.setNome("Lorena dos Anjos");
		
		Conta conta = new Conta();
		conta.setCliente("Lorena dos Anjos");
		conta.setCodigo(0);
		conta.setSaldo(0);
		
		ContaCorrente cc = new ContaCorrente();
		cc.creditar(1000);
		cc.setLimite(400);
		cc.debitar(1300);
		
		
		System.out.println(cc.getSaldo());
		
	}
}
