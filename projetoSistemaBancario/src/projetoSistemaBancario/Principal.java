package projetoSistemaBancario;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(0);
		cliente.setNome("Lorena dos Anjos");
		
		Conta conta = new Conta();
		conta.setCliente("Lorena dos Anjos");
		conta.setCodigo(0);
		conta.setSaldo(100);
		
		
		//Chamada de ação "Crédito ou Débido"
		//conta.creditar(200);
		//conta.debitar(0);
		
	}
}
