
package view;

import controller.ComentarioController;
import controller.MaterialController;
import java.awt.Frame;
import java.awt.Image;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
import model.Comentario;
import model.Material;


public class TelaListagem extends javax.swing.JFrame
{

    int IDLogado;
    MaterialController controller;
    ComentarioController controller2;
    List<Material> lista;
    List<Comentario> lista2;
    int itemSelecionado;
    int lastSelecionado;
    private Frame JFrame;
    SimpleDateFormat format;

    public TelaListagem()
    {
        initComponents();
        controller = new MaterialController();
        controller2 = new ComentarioController();
        LoadMateriais();
        itemSelecionado = -1;
        lastSelecionado = -1;
        format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Cabecalho = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        painelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABELA = new javax.swing.JTable();
        Aviso = new javax.swing.JLabel();
        painelImagem = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        iconImagem = new javax.swing.JLabel();
        painelDescricao = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        descricao = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        CadastrarMaterial = new javax.swing.JButton();
        data = new javax.swing.JLabel();
        textData = new javax.swing.JTextField();
        VerComentarios = new javax.swing.JLabel();
        DeletarMaterial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);

        Cabecalho.setBackground(new java.awt.Color(0, 51, 255));
        Cabecalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelTitulo.setText("Lista de Materiais");

        javax.swing.GroupLayout CabecalhoLayout = new javax.swing.GroupLayout(Cabecalho);
        Cabecalho.setLayout(CabecalhoLayout);
        CabecalhoLayout.setHorizontalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CabecalhoLayout.setVerticalGroup(
            CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabecalhoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLista.setBackground(new java.awt.Color(153, 153, 153));
        painelLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TABELA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nome"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false
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
        TABELA.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TABELAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABELA);
        if (TABELA.getColumnModel().getColumnCount() > 0)
        {
            TABELA.getColumnModel().getColumn(0).setResizable(false);
            TABELA.getColumnModel().getColumn(1).setResizable(false);
            TABELA.getColumnModel().getColumn(1).setPreferredWidth(600);
        }

        Aviso.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Aviso.setText("Selecione da lista para exibir");

        javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
        painelLista.setLayout(painelListaLayout);
        painelListaLayout.setHorizontalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelListaLayout.setVerticalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelImagem.setBackground(new java.awt.Color(153, 153, 153));
        painelImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imagem.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        imagem.setText("IMAGEM");

        javax.swing.GroupLayout painelImagemLayout = new javax.swing.GroupLayout(painelImagem);
        painelImagem.setLayout(painelImagemLayout);
        painelImagemLayout.setHorizontalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemLayout.createSequentialGroup()
                .addGroup(painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(imagem))
                    .addGroup(painelImagemLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(iconImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painelImagemLayout.setVerticalGroup(
            painelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(iconImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDescricao.setBackground(new java.awt.Color(153, 153, 153));
        painelDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        textDescricao.setEnabled(false);
        jScrollPane2.setViewportView(textDescricao);

        descricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        descricao.setText("DESCRIÇÃO");

        javax.swing.GroupLayout painelDescricaoLayout = new javax.swing.GroupLayout(painelDescricao);
        painelDescricao.setLayout(painelDescricaoLayout);
        painelDescricaoLayout.setHorizontalGroup(
            painelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDescricaoLayout.createSequentialGroup()
                        .addGap(0, 185, Short.MAX_VALUE)
                        .addComponent(descricao)
                        .addGap(0, 186, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        painelDescricaoLayout.setVerticalGroup(
            painelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        painelBotoes.setBackground(new java.awt.Color(153, 153, 153));
        painelBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CadastrarMaterial.setText("Novo Material");
        CadastrarMaterial.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CadastrarMaterialMouseClicked(evt);
            }
        });

        data.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        data.setText("Data:");

        textData.setEnabled(false);

        VerComentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comentario.png"))); // NOI18N
        VerComentarios.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                VerComentariosMouseClicked(evt);
            }
        });

        DeletarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deletar.png"))); // NOI18N
        DeletarMaterial.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DeletarMaterialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                        .addComponent(data)
                        .addGap(18, 18, 18)
                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CadastrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelBotoesLayout.createSequentialGroup()
                            .addComponent(VerComentarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeletarMaterial))))
                .addGap(102, 102, 102))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerComentarios)
                    .addComponent(DeletarMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(painelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarMaterialMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CadastrarMaterialMouseClicked
    {//GEN-HEADEREND:event_CadastrarMaterialMouseClicked
        TelaCadastroMaterial dialogo = new TelaCadastroMaterial(this.JFrame,true);
        dialogo.setVisible(true);
        if(dialogo.flag() == 0)//Ao fechar a tela filha essa verificação é feita, assim usamos como um listener
        {
            LoadMateriais();
        }
    }//GEN-LAST:event_CadastrarMaterialMouseClicked

    private void TABELAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TABELAMouseClicked
    {//GEN-HEADEREND:event_TABELAMouseClicked
        itemSelecionado = TABELA.getSelectedRow();
        if(itemSelecionado != lastSelecionado)//roda apenas quando troca o material selecionado
        {
            int IDmaterial = (int) TABELA.getModel().getValueAt(itemSelecionado, 0);
            
            Material material;
            int tamanho = lista.size();
            for(int i = 0;i < tamanho;i++)
            {
                material = lista.get(i);
                //percorre toda a lista carregada até achar o material com o id selecionado na tabela
                
                if(material.getID() == IDmaterial)
                {
                    textData.setText(format.format(material.getData()));
                    
                    //Procedimento para quebrar as linhas da descrição
                    String texto = material.getDescricao();
                    int tamanhotexto = texto.length()/70;
                    int total = (int) Math.ceil(tamanhotexto);
                    
                    String resultado = "";
                    
                    for(int j = 0; j <= total;j++)
                    {
                        if(j == total)
                        {
                            resultado = resultado + texto.substring((70*j), texto.length());
                            //no final só pegamos até o tamanho final da string, texto.lenght()
                        }
                        else
                        {
                            resultado = resultado + texto.substring(0+(70*j), 70+(70*j)) + "\n";  
                            //quebramos o texto de 70 em 70 caracteres
                        }
                    }
                    //Este método, no entanto, não considera a divisão silábica correta
                    //Sendo este um ponto a melhorar
                    
                    textDescricao.setText(resultado);

                    try
                    {
                        Blob blob = material.getImagem();//pegando o blob do objeto
                        int blobLength = (int) blob.length();//Pegando o numero do final do blob
                        ImageIcon imageIcon = 
                                new ImageIcon(//Criando um imageicon a partir de outro imageicon
                                        new ImageIcon(blob.getBytes(1,blobLength))//pois o segundo usa o método getimage
                                                .getImage().getScaledInstance(320, 230, Image.SCALE_DEFAULT)//para podermos redimensionar a imagem
                                                );
                        iconImagem.setIcon(imageIcon);
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }
                    break;
                }
            }
        }
        lastSelecionado = itemSelecionado;
    }//GEN-LAST:event_TABELAMouseClicked

    private void VerComentariosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_VerComentariosMouseClicked
    {//GEN-HEADEREND:event_VerComentariosMouseClicked
        if(itemSelecionado == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Você não selecionou um material da lista!");
            return;
        }
        
        TelaComentarios dialogo = new TelaComentarios(this.JFrame,true);
        try
        {
            int IDmaterial = (int) TABELA.getModel().getValueAt(itemSelecionado, 0);
           
            lista2 = controller2.getComentarios(IDmaterial);
            dialogo.passarLista(IDmaterial, lista2, IDLogado);
            dialogo.setVisible(true);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_VerComentariosMouseClicked

    private void DeletarMaterialMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_DeletarMaterialMouseClicked
    {//GEN-HEADEREND:event_DeletarMaterialMouseClicked
        if(itemSelecionado == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Você não selecionou um material da lista!");
            return;
        }
        int res = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja deletar esse material?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(res == 0)
        {
            try
            {
                int IDmaterial = (int) TABELA.getModel().getValueAt(itemSelecionado, 0);
                
                controller.DeleteMaterial(IDmaterial);
                JOptionPane.showMessageDialog(rootPane, "Material deletado com sucesso!");
                LoadMateriais();
                textDescricao.setText("");
                iconImagem.setIcon(null);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_DeletarMaterialMouseClicked

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
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                TelaListagem dialog = new TelaListagem();
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
    
    public void PassarUsuario(int usuario)
    {
        this.IDLogado = usuario;
    }
    
    private void LoadMateriais()
    {  
        try
        {  
            lista = controller.getAllMateriais();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
        int tamanho = lista.size();
        
        Material material;
        DefaultTableModel model = (DefaultTableModel) TABELA.getModel();
        
        model.setRowCount(0);//Limpa a tabela antes de escrever os itens
        //Assim podemos usar o mesmo método para criar e atualizar a tabela
        
        for(int i = 0; i < tamanho; i++)
        {
            material = lista.get(i);
            int ID = material.getID();
            String Nome = material.getMaterial();
            if(material.isAtivo() == true)
            {
                Object[] row = { ID, Nome };
                model.addRow(row); 
            }
        }     
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JPanel Cabecalho;
    private javax.swing.JButton CadastrarMaterial;
    private javax.swing.JLabel DeletarMaterial;
    private javax.swing.JTable TABELA;
    private javax.swing.JLabel VerComentarios;
    private javax.swing.JLabel data;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel iconImagem;
    private javax.swing.JLabel imagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDescricao;
    private javax.swing.JPanel painelImagem;
    private javax.swing.JPanel painelLista;
    private javax.swing.JTextField textData;
    private javax.swing.JTextArea textDescricao;
    // End of variables declaration//GEN-END:variables
}
