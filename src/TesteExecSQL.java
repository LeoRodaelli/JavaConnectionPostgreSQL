
public class TesteExecSQL {

    public static void main(String[] args) {
        conexao con = new conexao();

        String sql = "INSERT into cliente (id, nome, email)"+
                "values (default, 'Souza',"+
                "'ls@rodaelli.com')";

        int res = con.executaSQL(sql);

        if(res > 0) {
            System.out.println("Cadastrado com sucesso!!");
        } else {
            System.out.println("Erro durante o cadastro!!");
        }
    }
}
 	