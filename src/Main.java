
public class Main {

	public static void main (String[] args ) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jose");
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		corrente.depositar(200);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		
		corrente.sacar(200);
		


		
		
		
		
		

		poupanca.imprimirExtrato();
	}
}
