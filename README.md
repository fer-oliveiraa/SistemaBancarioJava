# Sistema Bancário - Simulação em Java

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

## Sobre o Projeto

Este projeto é uma simulação de um sistema bancário desenvolvido em Java, com o objetivo de aplicar e solidificar os conceitos fundamentais da Programação Orientada a Objetos (POO). 
A aplicação simula operações financeiras básicas como saques, depósitos e transferências entre diferentes tipos de contas.

Este é um projeto de aprendizado para praticar:
* Criação de classes e objetos.
* Encapsulamento de dados.
* Relações de Herança e Polimorfismo.
* Associação entre classes (Composição).

## Funcionalidades

Atualmente, o sistema implementa as seguintes funcionalidades:

* **Criação de Clientes:** Capacidade de criar clientes com nome e CPF.
* **Criação de Contas:**
    * **Conta Corrente:** Uma conta padrão que permite um limite de cheque especial.
    * **Conta Poupança:** Uma conta que possui uma taxa de rendimento sobre o saldo.
* **Operações Financeiras:**
    * **Depositar:** Adicionar um valor ao saldo da conta.
    * **Sacar:** Retirar um valor do saldo. A `ContaCorrente` considera o limite do cheque especial nesta operação.
    * **Transferir:** Mover um valor de uma conta para outra, utilizando as operações de saque e depósito.
* **Rendimento:** A `ContaPoupanca` possui um método específico para aplicar o rendimento com base em sua taxa.

## Conceitos de POO Aplicados

O projeto foi estruturado para demonstrar os pilares da Programação Orientada a Objetos:

* **Herança:** A `ContaCorrente` e a `ContaPoupanca` herdam atributos e métodos da classe base `Conta`, reutilizando código e estabelecendo uma relação "É-UM".
* **Polimorfismo:** O método `sacar()` é sobrescrito na classe `ContaCorrente` para ter um comportamento diferente da classe `Conta`. A aplicação demonstra como objetos de tipos diferentes (`ContaCorrente`, `ContaPoupanca`) podem ser tratados de forma genérica como `Conta`.
* **Encapsulamento:** Os atributos das classes são protegidos (`protected` ou `private`), e o acesso a eles é feito através de métodos públicos (`getters`), garantindo a integridade dos dados.
* **Composição:** A classe `Conta` "TEM-UM" `Cliente`, demonstrando a relação de composição entre objetos, onde um objeto é parte de outro.


## Como Executar

O projeto não requer dependências externas. Para executá-lo:
1.  Clone o repositório.
2.  Abra o projeto em sua IDE Java da sua escolha (como IntelliJ IDEA ou Eclipse).
3.  Execute o método `main` na classe `Main.java`.

A classe `Main` contém uma simulação completa que cria dois clientes, duas contas, e realiza uma série de transações para demonstrar todas as funcionalidades do sistema. 
O resultado das operações é impresso no console.

---
_Este projeto foi desenvolvido como parte de um estudo prático sobre Programação Orientada a Objetos com Java._
