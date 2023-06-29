
import java.net.URL;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 23.01328-0
 */
public class CadastroLoginTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLogin
     */
    public CadastroLoginTela() {
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

        CadastroTelaButton = new javax.swing.JButton();
        LoginTelaButton = new javax.swing.JButton();
        MetAutenticLabel = new javax.swing.JLabel();
        SairButton = new javax.swing.JButton();
        TituloJHLabel = new javax.swing.JLabel();
        BackgroundCLTLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        CadastroTelaButton.setBackground(new java.awt.Color(51, 102, 255));
        CadastroTelaButton.setForeground(new java.awt.Color(255, 255, 255));
        CadastroTelaButton.setText("Cadastro");
        CadastroTelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroTelaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroTelaButton);
        CadastroTelaButton.setBounds(480, 370, 220, 50);

        LoginTelaButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginTelaButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginTelaButton.setText("Login");
        LoginTelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTelaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginTelaButton);
        LoginTelaButton.setBounds(480, 300, 220, 50);

        MetAutenticLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/metautetic.png"))); // NOI18N
        getContentPane().add(MetAutenticLabel);
        MetAutenticLabel.setBounds(350, 230, 530, 70);

        SairButton.setBackground(new java.awt.Color(51, 102, 255));
        SairButton.setForeground(new java.awt.Color(255, 255, 255));
        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SairButton);
        SairButton.setBounds(480, 440, 220, 50);

        TituloJHLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/javahangmantxt.png"))); // NOI18N
        getContentPane().add(TituloJHLabel);
        TituloJHLabel.setBounds(400, 20, 390, 80);

        BackgroundCLTLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.jpg"))); // NOI18N
        BackgroundCLTLabel.setText("y");
        getContentPane().add(BackgroundCLTLabel);
        BackgroundCLTLabel.setBounds(-90, -40, 1480, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginTelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTelaButtonActionPerformed
        LoginTela lt = new LoginTela();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginTelaButtonActionPerformed

    private void CadastroTelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroTelaButtonActionPerformed
      CadastroTela ct = new CadastroTela();
      ct.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CadastroTelaButtonActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundCLTLabel;
    private javax.swing.JButton CadastroTelaButton;
    private javax.swing.JButton LoginTelaButton;
    private javax.swing.JLabel MetAutenticLabel;
    private javax.swing.JButton SairButton;
    private javax.swing.JLabel TituloJHLabel;
    // End of variables declaration//GEN-END:variables
}
