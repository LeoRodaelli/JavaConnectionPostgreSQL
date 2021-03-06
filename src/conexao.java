import java.sql.*;

public class conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    conexao(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "L$r1601192228";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão Realizada com Sucesso!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int executaSQL(String sql) {
        try {
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


    public ResultSet executaBusca(String sql) {
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            con.close();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int executaDelete(String sql) {
        try {
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int executaUpdate(String sql) {
        try {
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}



