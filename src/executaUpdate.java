import java.sql.SQLException;

public class executaUpdate {
    public static void main(String[] args) throws SQLException {

        conexao con = new conexao();

        String sql = "update cliente set nome = 'Souza Rodaelli' where id = 9";

        int res = con.executaUpdate(sql);

        if(res > 0) {
            System.out.println("Update com sucesso!!");
        } else {
            System.out.println("Erro durante o update!!");
        }
    }
}
