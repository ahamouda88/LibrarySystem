package main.java.library;

import javax.swing.*;

import main.java.librarysys.model.BookModel;
import main.java.librarysys.model.MagazineModel;

public class PublicationGUI extends javax.swing.JDialog {

    private Library lb;

    public PublicationGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        maxcheckoutlength = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        magazine_rb = new javax.swing.JRadioButton();
        book_rb = new javax.swing.JRadioButton();
        SelectPublication = new javax.swing.JLabel();
        sourcepanel = new javax.swing.JPanel();
        bookpanel = new javax.swing.JPanel();
        ISBN = new javax.swing.JLabel();
        ISBN_txt = new javax.swing.JTextField();
        magazinepanel = new javax.swing.JPanel();
        Issuenumber = new javax.swing.JLabel();
        issueno_txt = new javax.swing.JTextField();
        title_txt = new javax.swing.JTextField();
        maxcheckoutlength_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Publication");
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 1, 14));
        title.setText("Title : ");

        maxcheckoutlength.setFont(new java.awt.Font("Tahoma", 1, 14));
        maxcheckoutlength.setText("Max Checkout Length: ");

        add_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_btn.setLabel("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        buttonGroup1.add(magazine_rb);
        magazine_rb.setFont(new java.awt.Font("Tahoma", 0, 14));
        magazine_rb.setText("Magazine");
        magazine_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazine_rbActionPerformed(evt);
            }
        });

        buttonGroup1.add(book_rb);
        book_rb.setFont(new java.awt.Font("Tahoma", 0, 14));
        book_rb.setSelected(true);
        book_rb.setText("Book");
        book_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_rbActionPerformed(evt);
            }
        });

        SelectPublication.setFont(new java.awt.Font("Tahoma", 1, 14));
        SelectPublication.setText("Select Publication :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectPublication, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(book_rb)
                .addGap(28, 28, 28)
                .addComponent(magazine_rb)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectPublication, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_rb)
                    .addComponent(magazine_rb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sourcepanel.setLayout(new java.awt.CardLayout());

        bookpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ISBN.setFont(new java.awt.Font("Tahoma", 1, 14));
        ISBN.setText("ISBN Number : ");

        ISBN_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout bookpanelLayout = new javax.swing.GroupLayout(bookpanel);
        bookpanel.setLayout(bookpanelLayout);
        bookpanelLayout.setHorizontalGroup(
            bookpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ISBN)
                .addGap(65, 65, 65)
                .addComponent(ISBN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bookpanelLayout.setVerticalGroup(
            bookpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookpanelLayout.createSequentialGroup()
                .addGroup(bookpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISBN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        sourcepanel.add(bookpanel, "card2");

        Issuenumber.setFont(new java.awt.Font("Tahoma", 1, 14));
        Issuenumber.setText("Issue Number : ");

        issueno_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout magazinepanelLayout = new javax.swing.GroupLayout(magazinepanel);
        magazinepanel.setLayout(magazinepanelLayout);
        magazinepanelLayout.setHorizontalGroup(
            magazinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(magazinepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Issuenumber)
                .addGap(64, 64, 64)
                .addComponent(issueno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        magazinepanelLayout.setVerticalGroup(
            magazinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(magazinepanelLayout.createSequentialGroup()
                .addGroup(magazinepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Issuenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        sourcepanel.add(magazinepanel, "card3");

        title_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        maxcheckoutlength_txt.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maxcheckoutlength)
                .addGap(15, 15, 15)
                .addComponent(maxcheckoutlength_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addComponent(sourcepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxcheckoutlength, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxcheckoutlength_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(sourcepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            clearDialog();
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

    public void addBook() {
        BookModel b = new BookModel(title_txt.getText(), Integer.parseInt(maxcheckoutlength_txt.getText()), Integer.parseInt(ISBN_txt.getText()));
        lb.addPublication(b);
    }

    public void addMagazine() {
        MagazineModel m = new MagazineModel(title_txt.getText(), Integer.parseInt(maxcheckoutlength_txt.getText()), Integer.parseInt(issueno_txt.getText()));
        lb.addPublication(m);
    }

    public void closeDialog() {
        setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void clearDialog() {
        title_txt.setText("");
        maxcheckoutlength_txt.setText("");
        issueno_txt.setText("");
        ISBN_txt.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
