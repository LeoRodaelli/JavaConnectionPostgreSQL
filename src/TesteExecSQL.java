
public class TesteExecSQL {

    public static void main(String[] args) {
        conexao con = new conexao();

        String sql = "INSERT into cliente (id, nome, email)"+
                "values (default, 'Alpha7',"+
                "'a@alpha7.com')";

        int res = con.executaSQL(sql);

        if(res > 0) {
            System.out.println("Cadastrado com sucesso!!");
        } else {
            System.out.println("Erro durante o cadastro!!");
        }
    }
}
 	