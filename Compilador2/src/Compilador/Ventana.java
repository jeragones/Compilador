/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;

import Compilador.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;
import java.io.StringReader;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jdbr
 */
public class Ventana extends javax.swing.JFrame {
    
    private JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
    private File fileName = null;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        lblColumna = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFila = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNuevo = new javax.swing.JMenuItem();
        mnuAbrir = new javax.swing.JMenuItem();
        mnuGuardar = new javax.swing.JMenuItem();
        mnuCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCompilar = new javax.swing.JMenuItem();
        mnuASM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        txtTexto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTextoCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtTexto);

        lblColumna.setText("0");

        jLabel2.setText("Columna:");

        lblFila.setText("0");

        jLabel1.setText("Fila:");

        jMenu1.setText("Archivo");

        mnuNuevo.setText("Nuevo");
        mnuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNuevo);

        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAbrir);

        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGuardar);

        mnuCerrar.setText("Cerrar");
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compilar");

        mnuCompilar.setText("Compilar");
        mnuCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCompilarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCompilar);

        mnuASM.setText("Código ASM");
        jMenu2.add(mnuASM);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFila, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFila)
                    .addComponent(lblColumna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTextoCaretUpdate
        int caretPos = txtTexto.getCaretPosition();
        int rowNum = (caretPos == 0) ? 1 : 0;
        for (int offset = caretPos; offset > 0;) {
            try {
                offset = Utilities.getRowStart(txtTexto, offset) - 1;
            } catch (BadLocationException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            rowNum++;
        }
        lblFila.setText(String.valueOf(rowNum-1));

        int offset=0;
        try {
            offset = Utilities.getRowStart(txtTexto, caretPos);
        } catch (BadLocationException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        int colNum = caretPos - offset;
        lblColumna.setText(String.valueOf(colNum));
    }//GEN-LAST:event_txtTextoCaretUpdate

    private void mnuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevoActionPerformed
       
    }//GEN-LAST:event_mnuNuevoActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        // TODO add your handling code here:
       FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivos de Texto","txt");
            fileChooser.setFileFilter(filter);
            fileChooser.setDialogTitle("Abrir archivo...");
            File ruta= new File("C:");
            fileChooser.setCurrentDirectory(ruta);
            int retval = fileChooser.showOpenDialog(Ventana.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                fileName = fileChooser.getSelectedFile();
                try {
                    FileReader reader = new FileReader(fileName);
                    txtTexto.read(reader, "");  
                } catch (IOException ioex) {
                    //System.out.println(e);
                    //JOptionPane.showMessageDialog(Ventana.this, ioex);
                    System.exit(1);
                }
            }
        
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
     
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void mnuCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCompilarActionPerformed
        // TODO add your handling code here:
        try {
                    Driver.driver(fileName);
                } 
        catch (Exception ex) {
                    
                }
         
        txtConsola.setText(" ");
        int largo= Compilador.Scanner.Ltokens.size();
       
        txtConsola.append("\n=====================================================");
        txtConsola.append("\n                                               Lista de Tokens");
        txtConsola.append("\n=====================================================");
        txtConsola.append("\n");
        for (int i=0;i<largo;i++){
            txtConsola.append(Compilador.Scanner.Ltokens.get(i).toString());
        }
       txtConsola.append("\n=====================================================");
        txtConsola.append("\n                                            Fin Lista de Tokens");
        txtConsola.append("\n=====================================================");
        txtConsola.append("\n");
         txtConsola.append(" ");
        txtConsola.append(Compilador.PrettyPrintAST.tree);
    }//GEN-LAST:event_mnuCompilarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblFila;
    private javax.swing.JMenuItem mnuASM;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuCerrar;
    private javax.swing.JMenuItem mnuCompilar;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuNuevo;
    public static javax.swing.JTextArea txtConsola;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
