/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SILo;

import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class MainPage extends javax.swing.JFrame {
    Main mp;
//    private ItemForm itemPanel;
    /**
     * Creates new form MainP
     */
    public MainPage() {
        initComponents();
        Menu menu = new Menu();                
        setJMenuBar(menu);            
        pack();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(mp);
        this.setTitle("Main Page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        items = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deliveryNote = new javax.swing.JButton();
        invoice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 20, 20));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        items.setText("Items");
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(200, 200, 200));
        mainPanel.setAlignmentX(0.0F);
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("SILo");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        deliveryNote.setText("DeliveryNote");
        deliveryNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryNoteActionPerformed(evt);
            }
        });

        invoice.setText("Invoices");
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(items)
                .addGap(85, 85, 85)
                .addComponent(deliveryNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(invoice)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryNote)
                    .addComponent(items)
                    .addComponent(invoice))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        JPanel item = new ItemForm();
        item.setBounds(mainPanel.getBounds());
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        mainPanel.add(item); 
    }//GEN-LAST:event_itemsActionPerformed

    private void deliveryNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryNoteActionPerformed
        // TODO add your handling code here:
        JPanel dNote = new DeliveryNoteForm();
        dNote.setBounds(mainPanel.getBounds());
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        mainPanel.add(dNote); 
    }//GEN-LAST:event_deliveryNoteActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        // TODO add your handling code here:
        JPanel invoice = new InvoiceForm();
        invoice.setBounds(mainPanel.getBounds());
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        mainPanel.add(invoice);
    }//GEN-LAST:event_invoiceActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deliveryNote;
    private javax.swing.JButton invoice;
    private javax.swing.JButton items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
