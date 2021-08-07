package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String empresa, String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.empresa = empresa;
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }
}
