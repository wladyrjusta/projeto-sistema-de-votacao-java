# Sistema de Votação

## Visão Geral
Este projeto implementa um sistema de votação eletrônico em Java. Ele permite o cadastro de pessoas candidatas e eleitoras, bem como a coordenação do processo de votação e a exibição dos resultados parciais e finais.

## Estrutura do Projeto
O projeto está organizado em classes e interfaces Java:

- `GerenciamentoVotacao`: Esta classe implementa a lógica do sistema de votação. Ela possui métodos para cadastrar pessoas candidatas, pessoas eleitoras, registrar votos e exibir resultados.
- `GerenciamentoVotacaoInterface`: Uma interface que define os métodos que a classe `GerenciamentoVotacao` deve implementar.
- `Pessoa`: Uma classe abstrata que representa uma pessoa. Ela contém o atributo `nome` e os métodos getter e setter para o nome.
- `PessoaCandidata`: Uma classe que representa uma pessoa candidata. Ela estende a classe `Pessoa` e possui atributos adicionais, como `numero` e `votos`.
- `PessoaEleitora`: Uma classe que representa uma pessoa eleitora. Ela também estende a classe `Pessoa` e possui o atributo `cpf`.

## Como Usar
O programa principal está na classe `Principal`. Ele oferece um menu interativo para:

1. Cadastrar pessoas candidatas.
2. Cadastrar pessoas eleitoras.
3. Iniciar o processo de votação.
4. Exibir resultados parciais.
5. Finalizar a votação e exibir o resultado final.

Siga as instruções no console para interagir com o sistema.

## Requisitos
- Java Development Kit (JDK)

## Como Executar
1. Compile o código-fonte Java usando seu IDE ou o comando `javac`:

   ```sh
   javac com/betrybe/sistemadevotacao/*.java
