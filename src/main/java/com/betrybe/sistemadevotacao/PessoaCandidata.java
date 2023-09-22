package com.betrybe.sistemadevotacao;

/**
 * Classe que representa uma pessoa candidata em um sistema de votação.
 * Extende a classe Pessoa.
 */
public class PessoaCandidata extends Pessoa {
  private int numero; // O número da candidata.
  private int votos; // A quantidade de votos recebidos pela candidata.

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome   O nome da candidata.
   * @param numero O número da candidata.
   */
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
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
   * Obtém o número da candidata.
   *
   * @return O número da candidata.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Obtém a quantidade de votos recebidos pela candidata.
   *
   * @return A quantidade de votos recebidos pela candidata.
   */
  public int getVotos() {
    return votos;
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
   * Define o número da candidata.
   *
   * @param numero O número da candidata.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Define a quantidade de votos recebidos pela candidata.
   *
   * @param votos A quantidade de votos recebidos pela candidata.
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }

  /**
   * Registra um voto recebido pela candidata, aumentando a contagem de votos em 1.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}
