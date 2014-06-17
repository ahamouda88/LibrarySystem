package main.java.library;

import javax.swing.*;

import librarysys.entities.Book;
import librarysys.entities.Magazine;

public class PublicationGUI extends javax.swing.JDialog {

    private Library lb;

    public PublicationGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                PublicationGUI dialog = new PublicationGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void magazine_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazine_rbActionPerformed
        magazinepanel.setVisible(true);
        bookpanel.setVisible(false);
    }//GEN-LAST:event_magazine_rbActionPerformed

    private void book_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_rbActionPerformed
        magazinepanel.setVisible(false);
        bookpanel.setVisible(true);
    }//GEN-LAST:event_book_rbActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        closeDialog();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        try {
            if (book_rb.isSelected()) {
                addBook();
            } else {
                addMagazine();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Incorret Input.....", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    public void addBook() {
        Book b = new Book(title_txt.getText(), Integer.parseInt(maxcheckoutlength_txt.getText()), Integer.parseInt(ISBN_txt.getText()));
        lb.addPublication(b);
    }

    public void addMagazine() {
        Magazine m = new Magazine(title_txt.getText(), Integer.parseInt(maxcheckoutlength_txt.getText()), Integer.parseInt(issueno_txt.getText()));
        lb.addPublication(m);
    }

    public void closeDialog() {
        setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private javax.swing.JLabel ISBN;
    private javax.swing.JTextField ISBN_txt;
    private javax.swing.JLabel Issuenumber;
    private javax.swing.JLabel SelectPublication;
    private javax.swing.JButton add_btn;
    private javax.swing.JRadioButton book_rb;
    private javax.swing.JPanel bookpanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField issueno_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton magazine_rb;
    private javax.swing.JPanel magazinepanel;
    private javax.swing.JLabel maxcheckoutlength;
    private javax.swing.JTextField maxcheckoutlength_txt;
    private javax.swing.JPanel sourcepanel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField title_txt;
    // End of variables declaration//GEN-END:variables
}
