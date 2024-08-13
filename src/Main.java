
public class Main {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente();
		gustavo.setNome("Gustavo");
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.depositar(500);
		poupanca.sacar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
