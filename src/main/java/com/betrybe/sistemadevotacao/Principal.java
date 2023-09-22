package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal do Sistema de Votação.
 */
public class Principal {
  private static GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
  private static Scanner scanner = new Scanner(System.in);

  /**
   * O método principal que inicia o programa.
   *
   * @param args Os argumentos de linha de comando (não utilizados).
   */
  public static void main(String[] args) {
    cadastrarPessoaCandidata();
    cadastrarPessoaEleitora();
    votacao();
  }

  /**
   * Permite o cadastro de pessoas candidatas.
   */
  public static void cadastrarPessoaCandidata() {
    System.out.println(
        "Cadastrar pessoa candidata?\n"
            + "1 - Sim\n"
            + "2 - Não\n"
            + "Entre com o número correspondente à opção desejada: "
    );
    String prosseguirCadastro = scanner.next();
    while (prosseguirCadastro.equals("1")) {
      System.out.println("Entre com o nome da pessoa candidata: ");
      String nome = scanner.next();
      System.out.println("Entre com o número da pessoa candidata: ");
      int numero = Integer.parseInt(scanner.next());
      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      System.out.println(
          "Cadastrar pessoa candidata?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada: "
      );
      prosseguirCadastro = scanner.next();
    }
  }

  /**
   * Permite o cadastro de pessoas eleitoras.
   */
  public static void cadastrarPessoaEleitora() {
    System.out.println(
        "Cadastrar pessoa eleitora?\n"
            + "1 - Sim\n"
            + "2 - Não\n"
            + "Entre com o número correspondente à opção desejada: "
    );
    String prosseguirCadastro = scanner.next();
    while (prosseguirCadastro.equals("1")) {
      System.out.println("Entre com o nome da pessoa eleitora: ");
      String nome = scanner.next();
      System.out.println("Entre com o cpf da pessoa eleitora: ");
      String cpf = scanner.next();
      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      System.out.println(
          "Cadastrar pessoa eleitora?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada: "
      );
      prosseguirCadastro = scanner.next();
    }
  }

  /**
   * Inicia o processo de votação.
   */
  public static void votacao() {
    String prosseguirVotacao;
    do {
      System.out.println(
          "Entre com o número correspondente à opção desejada:\n"
              + " 1 - Votar\n"
              + " 2 - Resultado Parcial\n"
              + " 3 - Finalizar Votação"
      );
      prosseguirVotacao = scanner.next();

      switch (prosseguirVotacao) {
        case "1":
          System.out.println("Entre com o cpf da pessoa eleitora: ");
          String cpf = scanner.next();
          System.out.println("Entre com o número da pessoa candidata: ");
          int numero = Integer.parseInt(scanner.next());
          gerenciamentoVotacao.votar(cpf, numero);
          break;
        case "2":
          gerenciamentoVotacao.mostrarResultado();
          break;
        case "3":
          break; // Saia do loop quando a opção 3 for escolhida
        default:
          System.out.println("Opção desconhecida.");
      }

    } while (!prosseguirVotacao.equals("3"));

    gerenciamentoVotacao.mostrarResultado(); // Mostra o resultado final após finalizar a votação
    scanner.close();
  }
}
