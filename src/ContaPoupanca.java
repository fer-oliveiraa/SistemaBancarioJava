public class ContaPoupanca extends Conta{

    // A taxa de juros pode ser um atributo da conta poupança.
    private double taxaRendimento;

    public ContaPoupanca(int agencia, int numero, double taxaRendimento) {
        super(agencia, numero);
        this.taxaRendimento = taxaRendimento;
    }

    // Método específico da Conta Poupança
    public void aplicarRendimento() {
        double rendimento = this.saldo * this.taxaRendimento;
        this.saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado.");
    }

    //  Não e preciso sobreescrever o método sacar(), pois a regra
    // da classe mãe (Conta) já serve para a poupança.
}
