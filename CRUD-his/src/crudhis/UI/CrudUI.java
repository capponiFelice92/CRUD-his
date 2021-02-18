package crudhis.UI;

import crudhis.AddEvent;
import crudhis.AnnullaEvent;
import crudhis.AutomaCrud;
import crudhis.Automabile;

public class CrudUI extends javax.swing.JFrame implements Automabile {

    AutomaCrud automa;

    @Override
    public void entraStatoRicerca() {
        //Buttons
        jButtonConferma.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonAnnulla.setVisible(false);
        jButtonSeleziona.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonNuova.setVisible(true);

        //Input fields
        jTextFieldCercaPerCodice.setVisible(true);
        jTextFieldCodice.setVisible(false);
        jTextFieldDescrizione.setVisible(false);

        //table
        jTable.setVisible(true);
    }

    @Override
    public void entraStatoAggiungi() {
        //Buttons
        jButtonConferma.setVisible(true);
        jButtonRimuovi.setVisible(false);
        jButtonAnnulla.setVisible(true);
        jButtonSeleziona.setVisible(false);
        jButtonCerca.setVisible(false);
        jButtonModifica.setVisible(false);
        jButtonNuova.setVisible(false);

        //Input fields
        jTextFieldCercaPerCodice.setVisible(false);
        jTextFieldCodice.setVisible(true);
        jTextFieldDescrizione.setVisible(true);

        //table
        jTable.setVisible(false);
    }

    @Override
    public void entraStatoVisualizza() {
        //Buttons
        jButtonConferma.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonNuova.setVisible(true);

        //Input fields
        jTextFieldCercaPerCodice.setVisible(true);
        jTextFieldCodice.setVisible(true);
        jTextFieldDescrizione.setVisible(true);

        //table
        jTable.setVisible(true);
    }

    @Override
    public void entraStatoModifica() {
        //Buttons
        jButtonConferma.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonNuova.setVisible(true);

        //Input fields
        jTextFieldCercaPerCodice.setVisible(true);
        jTextFieldCodice.setVisible(true);
        jTextFieldDescrizione.setVisible(true);

        //table
        jTable.setVisible(true);
    }

    @Override
    public void entraStatoRimuovi() {
        //Buttons
        jButtonConferma.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonAnnulla.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonNuova.setVisible(true);

        //Input fields
        jTextFieldCercaPerCodice.setVisible(true);
        jTextFieldCodice.setVisible(true);
        jTextFieldDescrizione.setVisible(true);

        //table
        jTable.setVisible(true);
    }

    /**
     * Creates new form CrudUI
     */
    public CrudUI() {
        initComponents();
        automa = new AutomaCrud(this);
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
        jTable = new javax.swing.JTable();
        jTextFieldCercaPerCodice = new javax.swing.JTextField();
        jButtonCerca = new javax.swing.JButton();
        jButtonNuova = new javax.swing.JButton();
        jTextFieldCodice = new javax.swing.JTextField();
        jTextFieldDescrizione = new javax.swing.JTextField();
        jButtonModifica = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jButtonSeleziona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButtonCerca.setText("Cerca");

        jButtonNuova.setText("Nuova");
        jButtonNuova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuovaActionPerformed(evt);
            }
        });

        jButtonModifica.setText("Modifica");

        jButtonConferma.setText("Conferma");

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
            }
        });

        jButtonSeleziona.setText("Seleziona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSeleziona, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModifica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConferma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAnnulla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRimuovi))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonNuova))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCercaPerCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCerca))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuova)
                    .addComponent(jTextFieldCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonRimuovi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCercaPerCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerca))
                .addGap(2, 2, 2)
                .addComponent(jButtonSeleziona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonNuovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuovaActionPerformed
        automa.next(new AddEvent());
    }//GEN-LAST:event_jButtonNuovaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        automa.next(new AnnullaEvent());
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

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
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonCerca;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonNuova;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonSeleziona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCercaPerCodice;
    private javax.swing.JTextField jTextFieldCodice;
    private javax.swing.JTextField jTextFieldDescrizione;
    // End of variables declaration//GEN-END:variables
}
