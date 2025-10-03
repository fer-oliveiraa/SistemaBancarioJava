public class Conta {

    // Atributos protegidos para que as classes filhas (herança) possam acessá-los.
    protected  int agencia;
    protected  int numero;
    protected  double saldo;

    // Construtor para inicializar os dados essenciais da conta.
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0; // Toda conta começa com saldo zero
    }

    // Métodos (as ações que uma conta pode realizar)

    /**
     * Tentar sacar um valor do saldo da conta.
     * Verificar se o saldo é suficiente.
     * @param valor 0 valor a ser sacado.
     * @return true se o saque for bem-sucedido, false caso contrário.
     */
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
            return true;
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor de depósito inválido.");
            return false;
        }
    }

    /**
     * Deposita um valor na conta.
     * @param valor 0 valor a ser depositado (deve ser positivo).
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    /**
     * Transfere um valor desta conta para uma conta de destino.
     * Reutiliza os métodos sacar() e depositar().
     * @param valor 0 valor a ser transferido.
     * @param contaDestino 0 objeto Conta para onde o dinheiro será enviado.
     */
    public void transferir(double valor, Conta contaDestino) {
        // Tenta sacar o valor da conta de origem (this)
        boolean saqueRealizado = this.sacar(valor);

        // Se o saque foi bem-sucedido, deposita na conta de destino
        if (saqueRealizado) {
            contaDestino.depositar(valor);
            System.out.println("transferência de R$ " + valor + "para a conta " + contaDestino.numero + " realizada.");
        } else {
            System.out.println("Transferência não realizada.");
        }
    }

    //Método para consultar o saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Getters para agência e número, caso precisemos deles.
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
}
