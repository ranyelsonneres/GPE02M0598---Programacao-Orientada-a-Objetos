package controller;

import model.Pessoa;
import dao.PessoaDAO;
import java.util.List;

public class PessoaController {
    private PessoaDAO dao;

    public PessoaController() {
        this.dao = new PessoaDAO();
    }

    public boolean salvar(Pessoa pessoa) {
        return pessoa.getId() == 0 ? dao.inserir(pessoa) : dao.atualizar(pessoa);
    }

    public boolean deletar(int id) {
        return dao.deletar(id);
    }

    public List<Pessoa> listar() {
        return dao.listar();
    }
}
