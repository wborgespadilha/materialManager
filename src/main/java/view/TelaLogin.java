
package view;

import controller.UsuarioController;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JDialog
{
    
    UsuarioController controller;

    public TelaLogin(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        controller = new UsuarioController();
        labelErro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jToggleButton1 = new javax.swing.JToggleButton();
        painelCabeçalho = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        painelCorpo = new javax.swing.JPanel();
        labelIdUsuario = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        botaoLogar = new javax.swing.JButton();
        labelErro = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        painelCabeçalho.setBackground(new java.awt.Color(0, 51, 255));
        painelCabeçalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLogin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelLogin.setText("LOGIN");

        javax.swing.GroupLayout painelCabeçalhoLayout = new javax.swing.GroupLayout(painelCabeçalho);
        painelCabeçalho.setLayout(painelCabeçalhoLayout);
        painelCabeçalhoLayout.setHorizontalGroup(
            painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabeçalhoLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(labelLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCabeçalhoLayout.setVerticalGroup(
            painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabeçalhoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelLogin)
                .addContainerGap())
        );

        painelCorpo.setBackground(new java.awt.Color(153, 153, 153));

        labelIdUsuario.setText("ID Usuário:");

        labelSenha.setText("Senha:");

        botaoLogar.setText("Logar");
        botaoLogar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                botaoLogarMouseClicked(evt);
            }
        });

        labelErro.setForeground(new java.awt.Color(255, 0, 0));
        labelErro.setText("ID ou senha incorretos");

        javax.swing.GroupLayout painelCorpoLayout = new javax.swing.GroupLayout(painelCorpo);
        painelCorpo.setLayout(painelCorpoLayout);
        painelCorpoLayout.setHorizontalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCorpoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelSenha)
                            .addComponent(labelIdUsuario)
                            .addComponent(campoID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(campoSenha)))
                    .addGroup(painelCorpoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(botaoLogar))
                    .addGroup(painelCorpoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(labelErro)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        painelCorpoLayout.setVerticalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelIdUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelErro)
                .addGap(19, 19, 19)
                .addComponent(botaoLogar)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoLogarMouseClicked
    {//GEN-HEADEREND:event_botaoLogarMouseClicked
        if(campoID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Você deve inserir o id do usuário!");
            return;
        }
        if(campoSenha.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Você deve inserir a senha!");
            return;
        }
        try
        {
            if(controller.Login(Integer.parseInt(campoID.getText()),Integer.parseInt(campoSenha.getText())) == 1)
            {
                labelErro.setVisible(true);
            }
            else
            {
                TelaListagem dialogo = new TelaListagem();
                dialogo.PassarUsuario(Integer.parseInt(campoID.getText()));
                dialogo.setVisible(true);
                this.setVisible(false);
                dialogo.toFront();
                dialogo.requestFocus();
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_botaoLogarMouseClicked

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogar;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelIdUsuario;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painelCabeçalho;
    private javax.swing.JPanel painelCorpo;
    // End of variables declaration//GEN-END:variables
}
