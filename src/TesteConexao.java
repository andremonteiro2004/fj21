import java.sql.Connection;
import java.sql.SQLException;


public class TesteConexao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao Sucesso");
		connection.close();

	}

}
