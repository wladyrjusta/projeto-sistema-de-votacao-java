package com.betrybe.sistemadevotacao;

abstract class Pessoa {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String novoNome) {
    nome = novoNome;
  }
}
