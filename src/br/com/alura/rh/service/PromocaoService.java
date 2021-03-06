package br.com.alura.rh.service;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        if (Cargo.GERENTE == funcionario.getDadosPessoais().getCargo()) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if (metaBatida == Boolean.FALSE) {
            throw new ValidacaoException("Funcionario nao bateu a meta.");
        }

        var novoCargo = funcionario.getDadosPessoais().getCargo().proximoCargo();
        funcionario.promover(novoCargo);
    }
}
