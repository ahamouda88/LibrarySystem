package main.java.library;

import javax.swing.*;

import librarysys.entities.Address;
import librarysys.entities.Author;
import librarysys.entities.Book;
import librarysys.entities.Publication;

import java.awt.*;

public class AuthorGUI extends javax.swing.JDialog {
    
    private Library lb;
    
    public AuthorGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                AuthorGUI dialog = new AuthorGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        try {
            addAuthor();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Incorret Input.....", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed
   
    
    public void addAuthor() {
//        AuthorModel author = new AuthorModel(firstname_txt.getText(), lastname_txt.getText(), Integer.parseInt(telephone_txt.getText()), addAddress(), credentials_txt.getText(), shortbio_txtarea.getText(), (BookModel) book_cb.getSelectedItem());
//        lb.addAuthor(author);

    }
    
    public Address addAddress() {
        Address a = new Address(street_txt.getText(), state_txt.getText(), city_txt.getText(), Integer.parseInt(zipcode_txt.getText()));
        return a;
    }
    
    public void fillComboBox() {
       /* if(!lb.getallPublicatins().isEmpty())
        {
        book_cb.setModel(new DefaultComboBoxModel(lb.getallPublicatins().toArray()));
        book_cb.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (value != null) {
                            Publication myObj = (Publication) value;
                            setText(myObj.getTitle());
                        }
                        return this;
                    }
                });
        }*/
        for (int i = 0; i < lb.getallPublicatins().size(); i++) {
            Publication p = (Publication) lb.getallPublicatins().getElementAt(i);
            if (p instanceof Book) {
                book_cb.addItem(p);
                book_cb.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (value != null) {
                            Publication myObj = (Publication) value;
                            setText(myObj.getTitle());
                        }
                        return this;
                    }
                });                
            }
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JComboBox book_cb;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel city_lbl;
    private javax.swing.JTextField city_txt;
    private javax.swing.JLabel credentials_lbl;
    private javax.swing.JTextField credentials_txt;
    private javax.swing.JLabel firstname_lbl;
    private javax.swing.JTextField firstname_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname_lbl;
    private javax.swing.JTextField lastname_txt;
    private javax.swing.JLabel shortbio_lbl;
    private javax.swing.JTextArea shortbio_txtarea;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JLabel street_lbl;
    private javax.swing.JTextField street_txt;
    private javax.swing.JLabel telephone_lbl;
    private javax.swing.JTextField telephone_txt;
    private javax.swing.JLabel zipcode_lbl;
    private javax.swing.JLabel zipcode_lbl1;
    private javax.swing.JFormattedTextField zipcode_txt;
    // End of variables declaration//GEN-END:variables
}
