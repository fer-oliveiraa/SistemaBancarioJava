//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando os objetos das contas
        // Uma ContaCorrente pode ser tratada como uma conta (polimorfismo)
        Conta cc = new ContaCorrente(101, 202, 500.0);

        // Uma ContaPoupança pode ser tratada como uma conta (polimorfismo)
        Conta poupanca = new ContaPoupanca(101, 303, 0.01);

        System.out.println("--- Operações na Conta Corrente ---");
        cc.depositar(1000.00);
        System.out.println("Saldo CC: R$ " + cc.getSaldo());
        poupanca.sacar(500.00);
        System.out.println("Saldo CC: R$ " + cc.getSaldo());

        System.out.println("\n--- Operações na Conta Poupança ---");
        poupanca.depositar(2000.00);
        System.out.println("Saldo Poupança: R$ " + poupanca.getSaldo());
        poupanca.sacar(500.00);
        System.out.println("Saldo Poupança: R$ " + poupanca.getSaldo());

        // Testando o saque da Conta Corrente com cheque especial
        System.out.println("\n--- Testando Limite da Conta Corrente ---");
        cc.sacar(1000.00); // Isso vai usar o cheque especial
        System.out.println("Saldo CC após usar limite: R$ " + cc.getSaldo()); // Saldo ficará negativo

        // Testando a transferência (Polimorfismo em ação!)
        // O método transferir() da classe Conta funciona perfeitamente
        // com diferentes tipos de contas.
        System.out.println("\n--- Realizando Transferência ---");
        cc.transferir(100.0, poupanca);
        System.out.println("Saldo Final CC: R$ " + cc.getSaldo());
        System.out.println("Saldo Final Poupança: R$ " + poupanca.getSaldo());

        // Testando o método específico da Poupança
        // Aqui, precisamos dizer ao compilador que 'poupanca' é uma ContaPoupanca
        // para acessar o método aplicarRendimento(). Isso se chama "casting".
        if (poupanca instanceof ContaPoupanca) {
            ((ContaPoupanca) poupanca).aplicarRendimento();
        }
        System.out.println("Saldo Poupança após rendimento: R$ " + poupanca.getSaldo());
    }
}


