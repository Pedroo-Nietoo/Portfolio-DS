package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {
    Scanner ent = new Scanner(System.in);
    ArrayList<String> itens = new ArrayList<>();
    
    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        resposta = new javax.swing.JLabel();
        btnRmv = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArrayList - Arroz");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoItem.setName(""); // NOI18N
        jPanel1.add(campoItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 101, 340, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Dale feio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 82, -1, -1));

        btnAdd.setBackground(new java.awt.Color(255, 153, 153));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAddKeyTyped(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 132, -1));

        resposta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resposta.setText("Lista de Itens");
        resposta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        resposta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                respostaPropertyChange(evt);
            }
        });
        jPanel1.add(resposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 360, -1));

        btnRmv.setBackground(new java.awt.Color(255, 153, 153));
        btnRmv.setText("Remover");
        btnRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvActionPerformed(evt);
            }
        });
        btnRmv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnRmvKeyTyped(evt);
            }
        });
        jPanel1.add(btnRmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 147, -1));

        btnEditar.setBackground(new java.awt.Color(255, 153, 153));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 134, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       String elemento = campoItem.getText();
       
       if(verificarExistencia(elemento) == true){
           JOptionPane.showMessageDialog(this, "Este item já existe");}
       
       else{
       itens.add(elemento);
       campoItem.setText(null);
       exibeLista();}
    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddKeyTyped
   
    }//GEN-LAST:event_btnAddKeyTyped

    private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvActionPerformed
       String elemento = campoItem.getText();
       
       if(verificarExistencia(elemento) == false){
           JOptionPane.showMessageDialog(this, "A lista está vazia ou\neste item não se encontra na lista", "Mensagem", JOptionPane.PLAIN_MESSAGE);}
       
       else{
       itens.remove(elemento);
       campoItem.setText(null);
       exibeLista();}     
    }//GEN-LAST:event_btnRmvActionPerformed
    public void exibeLista(){
        String html = "<html>Lista de Itens<br><br>";
       
        for(String item : itens){
        html += item+"<br>";}
       
        resposta.setText(html);
    }
     
    public boolean verificarExistencia(String palavra){
        for(String item : itens){
            if(item.equals(palavra)){
                return true;
            }
        }
    return false;
    }
    
    
    private void btnRmvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRmvKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRmvKeyTyped

    private void respostaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_respostaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_respostaPropertyChange

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String elemento = campoItem.getText();
        
        if(verificarExistencia(elemento) == true){
            String resposta = JOptionPane.showInputDialog("Você quer substituir "+elemento+" por qual palavra?");
            
            if(resposta.equals(elemento)){
              JOptionPane.showMessageDialog(this,"Este item já existe!", "Aviso", JOptionPane.WARNING_MESSAGE);
           }
           
            int edit = itens.indexOf(campoItem.getText());
            itens.set(edit, resposta);
            exibeLista();
            }
        
        else{
            JOptionPane.showMessageDialog(this,"Este item não existe!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
            
        //Selecione a palavra que deseja editar
        //Deseja editá-la por qual palavras?
        //lista.set(X, "");
    }//GEN-LAST:event_btnEditarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRmv;
    private javax.swing.JTextField campoItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resposta;
    // End of variables declaration//GEN-END:variables
}