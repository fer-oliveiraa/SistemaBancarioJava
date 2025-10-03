// A palavra "extends" estabelece a herança.
// ContaCorrente é uma subclasse de Conta.

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente titular, int agencia, int numero, double limiteChequeEspecial) {
        // "super(...)" chama o construtur da classe mãe (Conta)
        super(titular, agencia, numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //A anotação @Override indica que estamos sobreescrevendo
    //um método da classe mãe. Isso é polimorfismo!
    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = this.saldo + this.limiteChequeEspecial;

        if (valor > 0 && saldoDisponivel >= valor) {
            this.saldo -= valor;
            System.out.println("Saque (CC) de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque não realizado (CC). Saldo e limite insuficientes.");
            return false;
        }
    }
}
