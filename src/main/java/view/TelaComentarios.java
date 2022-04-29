
package view;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Comentario;

public class TelaComentarios extends javax.swing.JDialog
{
    int idmaterial;
    int IDLogado;
    SimpleDateFormat format;
    
    public TelaComentarios(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        painelCabecalho = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        painelCorpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABELA = new javax.swing.JTable();
        botaoAdicionarComentario = new javax.swing.JButton();
        iconeSair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        painelCabecalho.setBackground(new java.awt.Color(0, 51, 255));
        painelCabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelTitulo.setText("Comentários");

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCorpo.setBackground(new java.awt.Color(153, 153, 153));

        TABELA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Usuário", "Data de Inclusão", "Descrição"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABELA);
        if (TABELA.getColumnModel().getColumnCount() > 0)
        {
            TABELA.getColumnModel().getColumn(0).setResizable(false);
            TABELA.getColumnModel().getColumn(0).setPreferredWidth(20);
            TABELA.getColumnModel().getColumn(1).setResizable(false);
            TABELA.getColumnModel().getColumn(1).setPreferredWidth(100);
            TABELA.getColumnModel().getColumn(2).setResizable(false);
            TABELA.getColumnModel().getColumn(2).setPreferredWidth(600);
        }

        botaoAdicionarComentario.setText("Adicionar Comentário");
        botaoAdicionarComentario.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                botaoAdicionarComentarioMouseClicked(evt);
            }
        });

        iconeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_sair.png"))); // NOI18N
        iconeSair.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                iconeSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCorpoLayout = new javax.swing.GroupLayout(painelCorpo);
        painelCorpo.setLayout(painelCorpoLayout);
        painelCorpoLayout.setHorizontalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(botaoAdicionarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeSair)
                .addGap(149, 149, 149))
        );
        painelCorpoLayout.setVerticalGroup(
            painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAdicionarComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(iconeSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarComentarioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoAdicionarComentarioMouseClicked
    {//GEN-HEADEREND:event_botaoAdicionarComentarioMouseClicked
        TelaCadastroComentarios dialogo = new TelaCadastroComentarios(null,true);
        dialogo.ReceberDados(idmaterial,IDLogado);
        dialogo.setVisible(true);
        if(dialogo.flag() == 0)//Ao fechar a tela filha essa verificação é feita, assim usamos como listener
        {
            dispose();
        }
    }//GEN-LAST:event_botaoAdicionarComentarioMouseClicked

    private void iconeSairMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_iconeSairMouseClicked
    {//GEN-HEADEREND:event_iconeSairMouseClicked
        dispose();
    }//GEN-LAST:event_iconeSairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                TelaComentarios dialog = new TelaComentarios(new javax.swing.JFrame(), true);
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
    
    public void passarLista(int id,List<Comentario> lista,int idlogado)
    {
        this.idmaterial = id;
        this.IDLogado = idlogado;
        
        Comentario comentario;
        int tamanho = lista.size() - 1;
        
        DefaultTableModel model = (DefaultTableModel) TABELA.getModel();
        
        //Como os comentários mais recentes tem o id maior, basta gerarmos a lista do final para o começo
        //Assim ficaremos com os comentários mais recentes em cima
        
        for(int i = tamanho; i >= 0 ; i--)
        {
            comentario = lista.get(i);
            int Usuario = comentario.getIdUsuario();
            String Data = format.format(comentario.getData());
            String Descricao = comentario.getComentario();
            
            Object[] row = { Usuario, Data, Descricao };
            model.addRow(row); 
        }     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABELA;
    private javax.swing.JButton botaoAdicionarComentario;
    private javax.swing.JLabel iconeSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelCorpo;
    // End of variables declaration//GEN-END:variables
}
