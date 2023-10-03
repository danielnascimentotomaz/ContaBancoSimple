/*
Sintaxe - Desafio


Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
Revise sobre regras de declaração de variáveis.

Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48

Revise sobre terminal, main args e a classe Scanner
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está
disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.


*/

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // variaveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer

        System.out.println("Por favor, digite o número da Agência !: ");
        agencia = teclado.next();
        teclado.nextLine(); // limpa o buffer

        System.out.println("Por favor, digite seu nome!: ");
        nomeCliente =  teclado.next();
        teclado.nextLine(); // limpa o buffer

        System.out.println("Por favor, digite seu saldo!: ");
        saldo = teclado.nextFloat();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é " + agencia +", numero da conta " + numeroConta + " e seu saldo \n" +
                "é " + saldo + " reais já está disponível para saque");

        System.out.println("Obrigado por utilizar nossos serviços");
        System.out.println("Até logo!");





    }
}