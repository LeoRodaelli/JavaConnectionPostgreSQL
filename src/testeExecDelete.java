import java.sql.SQLException;

public class testeExecDelete {

    public static void main(String[] args) throws SQLException {

        conexao con = new conexao();

        String sql = "delete from cliente where id = 10";

        int res = con.executaDelete(sql);

        if(res > 0) {
            System.out.println("Delete com sucesso!!");
        } else {
            System.out.println("Erro durante o delete!!");
        }
    }
}
