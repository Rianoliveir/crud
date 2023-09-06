
public class conexao {
     import java.sql.Connection;
import java.sql.DriverManager;

    public class conector {
        private static final String dataBaseUrl = "jdbc:mysql://localhost:3308/petshop";
        private static final String user = "root";
        private static final String password = "";

        public static Connection createConnectionToMySQl() throws Exception{

// criando a conexaco com banco de dados
            Connection connection = DriverManager.getConnection(dataBaseUrl, user, password);

            return connection;
        }

        public static void main(String[] args) throws Exception {
            Connection con = createConnectionToMySQl();

            if(con != null){
                System.out.println("Conexão obtida com sucesso");
                con.close();
            }
}
