package dao;

import model.Pessoa;
import util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private Connection conexao;

    public PessoaDAO() {
        this.conexao = Conexao.getConnection();
    }

    public boolean inserir(Pessoa pessoa) {
    	String sql = "{CALL cadastrar_pessoa(?, ?)}"; 
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ?, email = ? WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setInt(3, pessoa.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";
        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pessoa pessoa = new Pessoa(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
                pessoas.add(pessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
}
