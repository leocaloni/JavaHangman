
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 23.01328-0
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginTela() {
        super("JavaHangman");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NicknameLoginTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        VoltarLoginButton = new javax.swing.JButton();
        RecuperarSenhaButton = new javax.swing.JButton();
        SenhaLoginPasswordField = new javax.swing.JPasswordField();
        TitulojHLabel = new javax.swing.JLabel();
        nickanmeLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        NicknameLoginTextField.setBackground(new java.awt.Color(51, 102, 255));
        NicknameLoginTextField.setForeground(new java.awt.Color(255, 255, 255));
        NicknameLoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicknameLoginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NicknameLoginTextField);
        NicknameLoginTextField.setBounds(510, 190, 200, 61);

        LoginButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(630, 360, 100, 40);

        VoltarLoginButton.setBackground(new java.awt.Color(51, 102, 255));
        VoltarLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLoginButton.setText("Voltar");
        VoltarLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarLoginButton);
        VoltarLoginButton.setBounds(490, 360, 100, 40);

        RecuperarSenhaButton.setBackground(new java.awt.Color(51, 102, 255));
        RecuperarSenhaButton.setForeground(new java.awt.Color(255, 255, 255));
        RecuperarSenhaButton.setText("Recuperação de senha");
        RecuperarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RecuperarSenhaButton);
        RecuperarSenhaButton.setBounds(490, 410, 240, 23);

        SenhaLoginPasswordField.setBackground(new java.awt.Color(51, 102, 255));
        SenhaLoginPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        SenhaLoginPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaLoginPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SenhaLoginPasswordField);
        SenhaLoginPasswordField.setBounds(510, 290, 200, 60);

        TitulojHLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/javahangmantxt.png"))); // NOI18N
        getContentPane().add(TitulojHLabel);
        TitulojHLabel.setBounds(410, 20, 400, 60);

        nickanmeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nickname.png"))); // NOI18N
        getContentPane().add(nickanmeLabel);
        nickanmeLabel.setBounds(510, 170, 100, 16);

        senhaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/senha.png"))); // NOI18N
        getContentPane().add(senhaLabel);
        senhaLabel.setBounds(510, 270, 60, 16);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(-590, -190, 2350, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    String login = NicknameLoginTextField.getText();
    String senha = new String (SenhaLoginPasswordField.getPassword());
    try {
        Usuario usuario = new Usuario (login, senha);
        DAO DAO = new DAO();
        if(DAO.existeUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario.getNickname());
            this.dispose();
            MenuTela jogo = new MenuTela();
            MenuTela.Instance.lblr.setText(login);
            jogo.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "nickname ou senha incorretos");
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void NicknameLoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicknameLoginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicknameLoginTextFieldActionPerformed

    private void VoltarLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarLoginButtonActionPerformed
       CadastroLoginTela clt = new CadastroLoginTela();
        clt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarLoginButtonActionPerformed

    private void RecuperarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarSenhaButtonActionPerformed
       PerguntaPessoalTela ppt = new PerguntaPessoalTela();
       ppt.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_RecuperarSenhaButtonActionPerformed

    private void SenhaLoginPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaLoginPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaLoginPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField NicknameLoginTextField;
    private javax.swing.JButton RecuperarSenhaButton;
    private javax.swing.JPasswordField SenhaLoginPasswordField;
    private javax.swing.JLabel TitulojHLabel;
    private javax.swing.JButton VoltarLoginButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel nickanmeLabel;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
