
public class Conta {
	
	private static int SEQUENCIAL = 1;
	private static final int AG_PADRAO = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = AG_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente para saque !!!");
		}
		else {
		this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Valor deve ser maior que 0");
		}
	}
	
	
	public void transferir(double valor, Conta contaDestino) {
		if (valor > 0 && valor <= saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		else {
			System.out.println("Valor deve ser maior que 0");
		}

	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirExtratos() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	protected void imprimirExtrato() {
	}
}
