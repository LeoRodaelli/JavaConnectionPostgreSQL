import java.sql.ResultSet;

public class TesteExecBusca {

    public static void main(String[] args) {
        conexao con = new conexao();

        String sql = "select * from cliente";

        ResultSet rs = con.executaBusca(sql);

        try {
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                System.out.println(id+" - "+nome+" - "+email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
