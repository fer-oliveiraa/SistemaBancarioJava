public class Cliente {

    // Atributos privados para garantir o encapsulamento
    //Só podem ser acesados através de métodos (getters)
    private String nome;
    private String cpf;

    // Construtur para obrigar que todo ciente tenha um nome e cpf ao ser cadastrados
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Metodos "Getters" para permitir a leitura dos atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
