package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente giselle = new Cliente();
		giselle.setNome("Giselle");
		
		Cliente teste = new Cliente();
		teste.setNome("Teste");
		
		Conta cc = new ContaCorrente(giselle);
		Conta poupanca = new ContaPoupanca(giselle);
		
		Conta cc2 = new ContaCorrente(teste);
		Conta poupanca2 = new ContaPoupanca(teste);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc2.depositar(50);
		cc2.transferir(50, poupanca2);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
