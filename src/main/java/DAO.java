import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
 public boolean existeUsuario (Usuario usuario) throws Exception{
     String sql = "SELECT * FROM usuario WHERE nickname = ? AND senha = ?;";
     try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
         ps.setString(1, usuario.getNickname());
         ps.setString(2, usuario.getSenha());
         try(ResultSet rs = ps.executeQuery()) {
             return rs.next();
         }
     }
 }
 public boolean recuperarUsuario (Usuario usuario) throws Exception{
     String sql = "SELECT * FROM usuario WHERE nickname = ? AND perguntaPessoal = ?;";
     try (Connection conn = ConexaoBD.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
         ps.setString(1, usuario.getNickname());
         ps.setString(2, usuario.getPerguntaPessoal());
         try(ResultSet rs = ps.executeQuery()){
             return rs.next();
         }
     }
 }
 public boolean alteraSenha (Usuario usuario) throws Exception {
      String sql = "SELECT * FROM usuario WHERE nickname = ?;";
     try (Connection conn = ConexaoBD.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
         ps.setString(1, usuario.getNickname());
         try(ResultSet rs = ps.executeQuery()){
             return rs.next();
        }
    }
 }
}
