/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.invoice_controller;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Invoice_Tablemodel;
import model.Invoice_data;
import model.Items;

/**
 *
 * @author sarah
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
   public invoice() {
      
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoice_Table = new javax.swing.JTable();
        invoice_Table.getSelectionModel().addListSelectionListener(handler);
        new_inv = new javax.swing.JButton();
        new_inv.addActionListener(handler);
        del_inv = new javax.swing.JButton();
        del_inv.addActionListener(handler);
        nn = new javax.swing.JLabel();
        cs = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        item_Table = new javax.swing.JTable();
        new_item = new javax.swing.JButton();
        new_item.addActionListener(handler);
        del_item = new javax.swing.JButton();
        del_item.addActionListener(handler);
        num = new javax.swing.JTextField();
        cst = new javax.swing.JTextField();
        cst.addActionListener(handler);
        date = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        load_file = new javax.swing.JMenuItem();
        load_file.addActionListener(handler);

        save_file = new javax.swing.JMenuItem();
        save_file.addActionListener(handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoice_Table.setAutoCreateRowSorter(true);
        invoice_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        invoice_Table.setCellSelectionEnabled(true);
        invoice_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        invoice_Table.setEditingRow(0);
        invoice_Table.setRowSelectionAllowed(true);
        invoice_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        invoice_Table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        invoice_Table.setShowGrid(true);
        invoice_Table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(invoice_Table);

        new_inv.setText("new invoice");
        new_inv.setToolTipText("");
        new_inv.setName("new_inv"); // NOI18N

        del_inv.setText("delete invoice");

        nn.setText("num");

        cs.setText("customer");

        jLabel3.setText("date");

        jLabel5.setText("total");

        item_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        item_Table.setCellSelectionEnabled(true);
        item_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        item_Table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        item_Table.setSelectionForeground(new java.awt.Color(51, 51, 51));
        item_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        item_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        item_Table.setShowGrid(true);
        jScrollPane2.setViewportView(item_Table);

        new_item.setText("save");
        new_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_itemActionPerformed(evt);
            }
        });

        del_item.setText("delete item");
        del_item.setToolTipText("");
        del_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_itemActionPerformed(evt);
            }
        });

        num.setEditable(false);
        num.setText("jTextField1");
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        cst.setText("c_n");

        date.setText("date");

        total.setEditable(false);
        total.setText("total");

        jMenu1.setText("File");

        load_file.setText("load file");
        jMenu1.add(load_file);

        save_file.setText("save file");
        save_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_fileActionPerformed(evt);
            }
        });
        jMenu1.add(save_file);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cs)
                                    .addComponent(nn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cst, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                                .addComponent(date))))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(new_inv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del_inv)
                        .addGap(89, 89, 89)
                        .addComponent(new_item)
                        .addGap(18, 18, 18)
                        .addComponent(del_item)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nn)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del_inv)
                    .addComponent(new_inv)
                    .addComponent(new_item)
                    .addComponent(del_item))
                .addGap(0, 224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void del_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_del_itemActionPerformed

    private void new_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_itemActionPerformed

    private void save_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_fileActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cs;
    private javax.swing.JTextField cst;
    private javax.swing.JTextField date;
    private javax.swing.JButton del_inv;
    private javax.swing.JButton del_item;
    private javax.swing.JTable invoice_Table;
    private javax.swing.JTable item_Table;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem load_file;
    private javax.swing.JButton new_inv;
    private javax.swing.JButton new_item;
    private javax.swing.JLabel nn;
    private javax.swing.JTextField num;
    private javax.swing.JMenuItem save_file;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
private invoice_controller handler=new invoice_controller(this);
private ArrayList <Invoice_data> invoicelist;
 private ArrayList<Items> invoiceilist;
private Invoice_Tablemodel invoicemodel;
 
    public invoice_controller getHandler() {
        return handler;
    }

    

    public ArrayList<Items> getInvoiceilist() {
        return invoiceilist;
    }
    public void setInvoiceilist(ArrayList<Items> invoicelinelist) {
        this.invoiceilist = invoicelinelist;
    }
    

    public ArrayList<Invoice_data> getInvoicelist() {
        return invoicelist;
    }

    public JTable getinvoice_Table() {
        return invoice_Table;
    }

    public JTable getitem_Table() {
        return item_Table;
    }

    public JTextField getCst() {
        return cst;
    }

    public JTextField getDate() {
        return date;
    }

    public JTextField getNum() {
        return num;
    }

    public JTextField getTotal() {
        return total;
    }

    
 
    public Invoice_Tablemodel getinvoiceTablemodel() {
        return invoicemodel;
    }

    public void setTotal(JTextField total) {
        this.total = total;
    }


    public void setInvoicelist(ArrayList<Invoice_data> invoicelist) {
        this.invoicelist = invoicelist;
        invoicemodel=new Invoice_Tablemodel(invoicelist);
        this.invoice_Table.setModel(invoicemodel);
    }
    
    
}