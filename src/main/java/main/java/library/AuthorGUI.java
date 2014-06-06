package main.java.library;

import javax.swing.*;

import main.java.librarysys.model.AddressModel;
import main.java.librarysys.model.AuthorModel;
import main.java.librarysys.model.BookModel;
import main.java.librarysys.model.PublicationModel;

import java.awt.*;

public class AuthorGUI extends javax.swing.JDialog {
    
    private Library lb;
    
    public AuthorGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lastname_lbl = new javax.swing.JLabel();
        firstname_lbl = new javax.swing.JLabel();
        telephone_lbl = new javax.swing.JLabel();
        city_lbl = new javax.swing.JLabel();
        state_lbl = new javax.swing.JLabel();
        street_lbl = new javax.swing.JLabel();
        shortbio_lbl = new javax.swing.JLabel();
        credentials_lbl = new javax.swing.JLabel();
        zipcode_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shortbio_txtarea = new javax.swing.JTextArea();
        firstname_txt = new javax.swing.JTextField();
        lastname_txt = new javax.swing.JTextField();
        credentials_txt = new javax.swing.JTextField();
        zipcode_txt = new javax.swing.JFormattedTextField();
        street_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JTextField();
        state_txt = new javax.swing.JTextField();
        zipcode_lbl1 = new javax.swing.JLabel();
        book_cb = new javax.swing.JComboBox();
        telephone_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Author");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lastname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        lastname_lbl.setText("Last Name :");

        firstname_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        firstname_lbl.setText("First Name :");

        telephone_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        telephone_lbl.setText("Telephone :");

        city_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        city_lbl.setText("City :");

        state_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        state_lbl.setText("State :");

        street_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        street_lbl.setText("Street :");

        shortbio_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        shortbio_lbl.setText("Short Bio. :");

        credentials_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        credentials_lbl.setText("Credentials :");

        zipcode_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        zipcode_lbl.setText("Zip Code :");

        shortbio_txtarea.setColumns(20);
        shortbio_txtarea.setFont(new java.awt.Font("Tahoma", 0, 12));
        shortbio_txtarea.setRows(5);
        jScrollPane1.setViewportView(shortbio_txtarea);

        firstname_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        lastname_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        credentials_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        zipcode_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        zipcode_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        street_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        city_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        state_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        zipcode_lbl1.setFont(new java.awt.Font("Tahoma", 1, 14));
        zipcode_lbl1.setText("Book :");

        book_cb.setFont(new java.awt.Font("Tahoma", 0, 14));
        book_cb.setToolTipText("");

        telephone_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        add_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        add_btn.setText("Add");
        add_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shortbio_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telephone_lbl)
                                .addComponent(lastname_lbl))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(credentials_lbl)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lastname_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telephone_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(credentials_txt, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(firstname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(street_lbl)
                            .addComponent(state_lbl)
                            .addComponent(city_lbl)
                            .addComponent(zipcode_lbl)
                            .addComponent(zipcode_lbl1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(book_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(street_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_txt)
                            .addComponent(state_txt, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_lbl)
                    .addComponent(street_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname_txt)
                    .addComponent(state_lbl)
                    .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_lbl)
                    .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credentials_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode_lbl)
                    .addComponent(zipcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credentials_lbl))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shortbio_lbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zipcode_lbl1)
                                .addComponent(book_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        closeDialog();
    }//GEN-LAST:event_cancel_btnActionPerformed
    
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        try {
            addAuthor();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Incorret Input.....", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed
    
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
    
    public void addAuthor() {
        AuthorModel author = new AuthorModel(firstname_txt.getText(), lastname_txt.getText(), Integer.parseInt(telephone_txt.getText()), addAddress(), credentials_txt.getText(), shortbio_txtarea.getText(), (BookModel) book_cb.getSelectedItem());
        lb.addAuthor(author);
        clearDialog();
    }
    
    public AddressModel addAddress() {
        AddressModel a = new AddressModel(street_txt.getText(), state_txt.getText(), city_txt.getText(), Integer.parseInt(zipcode_txt.getText()));
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
            PublicationModel p = (PublicationModel) lb.getallPublicatins().getElementAt(i);
            if (p instanceof BookModel) {
                book_cb.addItem(p);
                book_cb.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (value != null) {
                            PublicationModel myObj = (PublicationModel) value;
                            setText(myObj.getTitle());
                        }
                        return this;
                    }
                });                
            }
            
        }
    }
    
    public void clearDialog() {
        street_txt.setText("");
        state_txt.setText("");
        city_txt.setText("");
        zipcode_txt.setText("");
        firstname_txt.setText("");
        lastname_txt.setText("");
        telephone_txt.setText("");
        credentials_txt.setText("");
        shortbio_txtarea.setText("");
        book_cb.setSelectedIndex(-1);
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
