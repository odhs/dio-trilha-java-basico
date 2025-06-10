# Conta Banco

Este exercício simula uma conta bancária, permitindo que o usuário insira dados via terminal e visualize as informações da conta.

## Objetivo

Criar um programa em _Java_ que receba dados do usuário via terminal e exiba as informações de uma conta bancária com base nos atributos fornecidos.

## Instruções

1. Crie o projeto chamado `ContaBanco`, que será responsável por receber os dados do usuário via terminal.
2. Dentro do projeto, crie a classe `ContaTerminal.java`, onde será implementada toda a lógica do programa.

## Atributos da Conta Bancária

Os atributos da conta bancária e seus respectivos tipos são descritos na tabela abaixo:

| Atributo        | Tipo    | Exemplo         |
| --------------- | ------- | --------------- |
| Número          | Inteiro | 1021            |
| Agência         | Texto   | 067-8           |
| Nome do Cliente | Texto   | SERGIO OLIVEIRA |
| Saldo           | Decimal | 237.48          |

## Funcionalidades

1. O programa solicitará os dados da conta bancária ao usuário via terminal.
2. Para cada atributo, será exibida uma mensagem indicando qual informação deve ser inserida. Por exemplo:

   - Programa: "Por favor, digite o número da Agência:"
   - Usuário: 067-8 _(pressione ENTER para continuar)_

3. Após a inserção de todos os dados, o programa exibirá um resumo das informações da conta bancária.

## Pré-requisitos

- Conhecimento básico sobre:
  - Declaração de variáveis em Java.
  - Uso do terminal e argumentos do método `main`.
  - Utilização da classe `Scanner` para entrada de dados.
  - Utilização da classe `Math` para entrada de dados.

## Exemplo de Execução

```plaintext
Por favor, digite o número da Agência:
067-8
Por favor, digite o número da Conta:
1021
Por favor, digite o Nome do Cliente:
SERGIO OLIVEIRA
Por favor, digite o Saldo (Use . para separar os centavos):
237.48

Olá SERGIO, obrigado por criar uma conta em nosso banco, sua agência é 1021, conta 067-8 e seu saldo 237.48 já está disponível para saque
```

## TODO: Possibilidades Futuras

- [ ] Validar os dados inseridos pelo usuário, garantindo que estejam no formato esperado.
- [ ] Utilizar boas práticas de programação, como organização do código e tratamento de exceções.

<details align="left">
  <summary></summary>

- Baseado em <a href="https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/sintaxe/README.md">Trilha Java Básico</a><br>

</details>
