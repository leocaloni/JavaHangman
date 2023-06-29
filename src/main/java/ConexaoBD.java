import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    public static String db = "db_javaHangman";
    private static String user = "root";
    private static String password = "13012005";
    public static Connection obtemConexao() throws Exception {
        String url = String.format(
        "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host,
                porta,
                db);
        return DriverManager.getConnection(url, user, password);
    }
}
