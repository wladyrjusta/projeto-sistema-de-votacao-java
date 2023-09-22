package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        break;
      }
    }
    PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novaPessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (cpf.equals(pessoaEleitora.getCpf())) {
        System.out.println("Pessoa eleitora já cadastrada!");
        break;
      }
    }
    PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novaPessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : cpfsComputados) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        break;
      }
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        break;
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado");
    }
    int totalVotos = 0;
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      totalVotos += pessoaCandidata.getVotos();
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      int votosCandidato = pessoaCandidata.getVotos();
      double porcentagemPorCandidato = (votosCandidato * 100.0) / totalVotos;
      System.out.println(
          "Nome: "
              + pessoaCandidata.getNome() + " - "
              + pessoaCandidata.getVotos() + " votos "
              + "( " + Math.round(porcentagemPorCandidato) + "%" + " )"
      );
    }
    System.out.println("Total de votos: " + totalVotos);
  }
}
