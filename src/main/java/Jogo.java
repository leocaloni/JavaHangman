import java.util.Random;

public class Jogo {
    private String palavraAtual;
    private StringBuilder palavraEscondida;
    private String letra;
    private int tentativas;
    private int palavrasAcertadas;

    public String getPalavraAtual() {
        return palavraAtual;
    }

    public void setPalavraAtual(String palavraAtual) {
        this.palavraAtual = palavraAtual;
    }

    public StringBuilder getPalavraEscondida() {
        return palavraEscondida;
    }

    public void setPalavraEscondida(StringBuilder palavraEscondida) {
        this.palavraEscondida = palavraEscondida;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public String escolherPalavra() {
        String[] palavras = {"JOptionPane", "String", "Scanner", "Integer", "Double", "Classe", "Objeto", "JFrame"};
        return palavras[new Random().nextInt(palavras.length)];
    }
    
    public void iniciarJogo() {
        setPalavraAtual(escolherPalavra());
        palavraEscondida = new StringBuilder();
        for (int i = 0; i < palavraAtual.length(); i++) {
            palavraEscondida.append("_");
        }
         palavrasAcertadas = 0;
    }
    
    public void verificarLetra(String letra) {
    boolean acertou = false;
    for (int i = 0; i < palavraAtual.length(); i++) {
        if (Character.toLowerCase(palavraAtual.charAt(i)) == Character.toLowerCase(letra.charAt(0))) {
            palavraEscondida.setCharAt(i, palavraAtual.charAt(i));
            acertou = true;
        }
    }

    if (!acertou) {
        tentativas++;
    }
    else {
        palavrasAcertadas++;
    }
}
    public boolean jogadorAcertou() {
        return palavraEscondida.toString().equalsIgnoreCase(palavraAtual);
}
    public int getPalavrasAcertadas() {
    return palavrasAcertadas;
}

}
