package com.betrybe.sistemadevotacao;

/**
 * Classe que representa uma pessoa eleitora em um sistema de votação.
 * Extende a classe Pessoa.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome   O nome da candidata.
   * @param cpf O número da candidata.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.cpf = cpf;
    this.nome = nome;
  }

  /**
   * Obtém o nome da candidata.
   *
   * @return O nome da candidata.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Obtém o cpf da candidata.
   *
   * @return O cpf da candidata.
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Define o nome da candidata.
   *
   * @param nome O nome da candidata.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Define o cpf da candidata.
   *
   * @param cpf O nome da candidata.
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
