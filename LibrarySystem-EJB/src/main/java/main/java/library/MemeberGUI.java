package main.java.library;

import javax.swing.*;

import librarysys.entities.AddressModel;
import librarysys.entities.MemberModel;

public class MemeberGUI extends javax.swing.JDialog {

    private Library lb;

    public MemeberGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        city_txt = new javax.swing.JTextField();
        zipcode_lbl = new javax.swing.JLabel();
        street_txt = new javax.swing.JTextField();
        state_txt = new javax.swing.JTextField();
        street_lbl = new javax.swing.JLabel();
        lastname_lbl = new javax.swing.JLabel();
        firstname_txt = new javax.swing.JTextField();
        lastname_txt = new javax.swing.JTextField();
        city_lbl = new javax.swing.JLabel();
        state_lbl = new javax.swing.JLabel();
        firstname_lbl = new javax.swing.JLabel();
        zipcode_txt = new javax.swing.JFormattedTextField();
        telephone_lbl = new javax.swing.JLabel();
        memberno_lbl = new javax.swing.JLabel();
        telephone_txt = new javax.swing.JTextField();
        memberno_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Member");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));

        city_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        zipcode_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        zipcode_lbl.setText("Zip Code :");

        street_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        state_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        street_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        street_lbl.setText("Street :");

        lastname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        lastname_lbl.setText("Last Name :");

        firstname_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        lastname_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        city_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        city_lbl.setText("City :");

        state_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        state_lbl.setText("State :");

        firstname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        firstname_lbl.setText("First Name :");

        zipcode_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        zipcode_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        telephone_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        telephone_lbl.setText("Telephone :");

        memberno_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        memberno_lbl.setText("Member No. :");

        telephone_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        memberno_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        add_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        add_btn.setText("Add");
        add_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(memberno_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(memberno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(zipcode_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstname_lbl)
                                    .addComponent(lastname_lbl)
                                    .addComponent(telephone_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(lastname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(telephone_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(street_lbl)
                                    .addComponent(state_lbl)
                                    .addComponent(city_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(city_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(state_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(street_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_lbl)
                    .addComponent(firstname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_lbl)
                    .addComponent(street_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname_lbl)
                    .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state_lbl)
                    .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone_lbl)
                    .addComponent(city_lbl)
                    .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberno_lbl)
                    .addComponent(memberno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode_lbl)
                    .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        closeDialog();
}//GEN-LAST:event_cancel_btnActionPerformed

    public Library getLibrary() {
        return lb;
    }

    public void setLibrary(Library lb) {
        this.lb = lb;
    }

    public void closeDialog() {
        setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void addMember() {
        MemberModel member = new MemberModel(firstname_txt.getText(), lastname_txt.getText(), addAddress(), Integer.parseInt(telephone_txt.getText()), Integer.parseInt(memberno_txt.getText()));
        lb.addMember(member);
        clearDialog();
    }

    public AddressModel addAddress() {
        AddressModel a = new AddressModel(street_txt.getText(), state_txt.getText(), city_txt.getText(), Integer.parseInt(zipcode_txt.getText()));
        return a;
    }

    public void clearDialog() {
        street_txt.setText("");
        state_txt.setText("");
        city_txt.setText("");
        zipcode_txt.setText("");
        firstname_txt.setText("");
        lastname_txt.setText("");
        telephone_txt.setText("");
        memberno_txt.setText("");
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
