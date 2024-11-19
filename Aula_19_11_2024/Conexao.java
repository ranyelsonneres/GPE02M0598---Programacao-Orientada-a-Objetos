package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost/cadastro2";
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";
    private static Connection conexao;

    private Conexao() {
        // Previne a criação de instâncias
    }

    public static Connection getConnection() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao conectar ao banco de dados", e);
            }
        }
        return conexao;
    }

    public static void closeConnection() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
