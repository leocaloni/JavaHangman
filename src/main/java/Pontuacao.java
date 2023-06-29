
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pontuacao extends Usuario {
  private int idPartida;
  private int pontuacaoJogador;

    public Pontuacao(int pontuacaoJogador, int id) {
        super(id);
        this.pontuacaoJogador = pontuacaoJogador;
    }    

    public Pontuacao(int id) {
        super(id);
    }

    public Pontuacao() {
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public int getPontuacaoJogador() {
        return pontuacaoJogador;
    }

    public void setPontuacaoJogador(int pontuacaoJogador) {
        this.pontuacaoJogador = pontuacaoJogador;
    }
    public void inserirRecorde () {
        String sql = "INSERT INTO pontuacao (pontuacaoJogador, idJogador) VALUES (?, ?) ";
        try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pontuacaoJogador);
            ps.setInt(2, id);
            ps.execute();
        }
      catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void alterarRecorde () {
      String sql = "UPDATE pontuacao SET pontuacaoJogador = ? WHERE idJogador = ?;";
       try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pontuacaoJogador);
            ps.setInt(2, id);
            ps.execute();
        }
      catch (Exception e) {
            e.printStackTrace();
        } 
    }
    public String listarRecorde () {
        String sql = "SELECT pontuacaoJogador FROM pontuacao WHERE idJogador = ?;";
        String s = "";
         try (Connection conn = ConexaoBD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                s = Integer.toString(rs.getInt("pontuacaoJogador"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return s;
        
    }
}
