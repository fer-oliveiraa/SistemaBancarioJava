public class Main {
    public static void main(String[] args) {

        // 1. CRIAÇÃO DOS CLIENTES
        // Primeiro, criamos as entidades Cliente, que são independentes das contas.
        Cliente cliente1 = new Cliente("Fernanda Oliveira Cardoso", "111.222.333-44");
        Cliente cliente2 = new Cliente("Kawã Baliones", "555.666.777-88");

        // 2. CRIAÇÃO DAS CONTAS
        // Agora, criamos as contas, associando cada uma a um cliente titular.
        Conta cc = new ContaCorrente(cliente1, 101, 202, 500.0);
        Conta poupanca = new ContaPoupanca(cliente2, 101, 303, 0.01);

        // 3. OPERAÇÕES NA CONTA CORRENTE
        System.out.println("--- Bem-vindo(a), " + cc.getTitular().getNome() + " ---");
        System.out.println("--- Operações na Conta Corrente ---");
        cc.depositar(1000.00);
        System.out.println("Saldo CC após depósito: R$ " + cc.getSaldo());
        cc.sacar(200.00); // CORREÇÃO: Fazendo o saque na conta corrente (cc).
        System.out.println("Saldo CC após saque: R$ " + cc.getSaldo());

        // 4. OPERAÇÕES NA CONTA POUPANÇA
        System.out.println("\n--- Olá, " + poupanca.getTitular().getNome() + " ---");
        System.out.println("--- Operações na Conta Poupança ---");
        poupanca.depositar(2000.00);
        System.out.println("Saldo Poupança após depósito: R$ " + poupanca.getSaldo());
        poupanca.sacar(500.00);
        System.out.println("Saldo Poupança após saque: R$ " + poupanca.getSaldo());

        // 5. TESTE DO LIMITE (CHEQUE ESPECIAL)
        // Tentando sacar um valor maior que o saldo, mas dentro do limite.
        System.out.println("\n--- Testando Limite da Conta Corrente de " + cc.getTitular().getNome() + " ---");
        cc.sacar(1000.00); // Saldo era R$800. Saque de R$1000 deve deixar o saldo em -R$200.
        System.out.println("Saldo CC após usar limite: R$ " + cc.getSaldo());

        // 6. TESTE DA TRANSFERÊNCIA
        // Transferindo da conta corrente (que está com saldo negativo) para a poupança.
        System.out.println("\n--- Realizando Transferência ---");
        System.out.println(cc.getTitular().getNome() + " transfere para " + poupanca.getTitular().getNome());
        cc.transferir(100.0, poupanca); // Deve usar mais R$100 do limite. Saldo CC -> -R$300
        System.out.println("Saldo Final CC: R$ " + cc.getSaldo());
        System.out.println("Saldo Final Poupança: R$ " + poupanca.getSaldo()); // Saldo Poupança -> R$1600

        // 7. TESTE DO RENDIMENTO DA POUPANÇA
        System.out.println("\n--- Aplicando Rendimento na Poupança de " + poupanca.getTitular().getNome() + " ---");
        // O "instanceof" verifica se a variável 'poupanca' é realmente um objeto do tipo ContaPoupanca.
        if (poupanca instanceof ContaPoupanca) {
            // O "casting" ((ContaPoupanca)) converte a referência para o tipo específico,
            // permitindo o acesso a métodos que só existem em ContaPoupanca.
            ((ContaPoupanca) poupanca).aplicarRendimento();
        }
        System.out.println("Saldo Poupança após rendimento: R$ " + poupanca.getSaldo());
    }
}