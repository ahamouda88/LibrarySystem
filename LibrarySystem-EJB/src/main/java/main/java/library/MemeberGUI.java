package main.java.library;

import javax.swing.*;

import librarysys.entities.Address;
import librarysys.entities.Member;

public class MemeberGUI extends javax.swing.JDialog {

    private Library lb;

    public MemeberGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MemeberGUI dialog = new MemeberGUI(new javax.swing.JFrame(), true);
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
            addMember();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Incorret Input.....", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }

}//GEN-LAST:event_add_btnActionPerformed

    public void addMember() {
        Member member = new Member(firstname_txt.getText(), lastname_txt.getText(), addAddress(), Integer.parseInt(telephone_txt.getText()), Integer.parseInt(memberno_txt.getText()));
        lb.addMember(member);
    }

    public Address addAddress() {
        Address a = new Address(street_txt.getText(), state_txt.getText(), city_txt.getText(), Integer.parseInt(zipcode_txt.getText()));
        return a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel city_lbl;
    private javax.swing.JTextField city_txt;
    private javax.swing.JLabel firstname_lbl;
    private javax.swing.JTextField firstname_txt;
    private javax.swing.JLabel lastname_lbl;
    private javax.swing.JTextField lastname_txt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel memberno_lbl;
    private javax.swing.JTextField memberno_txt;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JLabel street_lbl;
    private javax.swing.JTextField street_txt;
    private javax.swing.JLabel telephone_lbl;
    private javax.swing.JTextField telephone_txt;
    private javax.swing.JLabel zipcode_lbl;
    private javax.swing.JFormattedTextField zipcode_txt;
    // End of variables declaration//GEN-END:variables
}
