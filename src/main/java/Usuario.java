
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario {
    protected int id;
    private String nickname;
    private String senha;
    private String perguntaPessoal;

    public Usuario(String nickname, String senha, String perguntaPessoal) {
        this.nickname = nickname;
        this.senha = senha;
        this.perguntaPessoal = perguntaPessoal;
    }

    public Usuario() {
    }

    public Usuario(String nickname, String senha) {
        this.nickname = nickname;
        this.senha = senha;
    }

    public Usuario(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerguntaPessoal() {
        return perguntaPessoal;
    }

    public void setPerguntaPessoal(String perguntaPessoal) {
        this.perguntaPessoal = perguntaPessoal;
    }
    public void inserir(){
        String sql = "INSERT INTO usuario (nickname, senha, perguntaPessoal) VALUES(?, ?, ?)";
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nickname);
            ps.setString(2, senha);
            ps.setString(3, perguntaPessoal);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro Realizado");
        }
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nickname em uso");
            e.printStackTrace();
        }
    
    } 
    public void alterarSenha(){
        String sql = "UPDATE usuario SET senha = ? WHERE nickname = ?;";
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, senha);
            ps.setString(2, nickname);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Senha alterada");
        }
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nickname incorreto");
            e.printStackTrace();
        }
    }
    public Integer pegarId () {
        String sql = "SELECT idJogador FROM usuario WHERE nickname = ?;";
        int idJog = 0;
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nickname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                idJog = rs.getInt("idJogador");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return idJog;
    }
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nickname=" + nickname + ", senha=" + senha + ", perguntaPessoal=" + perguntaPessoal + '}';
    }
    
}
