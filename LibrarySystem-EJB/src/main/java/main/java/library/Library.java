package main.java.library;

import java.awt.CardLayout;

import javax.swing.*;

import librarysys.entities.AddressModel;
import librarysys.entities.AuthorModel;
import librarysys.entities.BookModel;
import librarysys.entities.CopyModel;
import librarysys.entities.MagazineModel;
import librarysys.entities.MemberModel;
import librarysys.entities.PublicationModel;

import java.awt.Component;
import java.text.DateFormat;
import java.util.*;

public class Library extends JFrame {

    private DefaultListModel publications;
    private DefaultListModel authors;
    private DefaultListModel members;

    public Library() {
        initComponents();
        publications = new DefaultListModel();
        authors = new DefaultListModel();
        members = new DefaultListModel();
        fillData();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				new Library().setVisible(true);
				
			}
		});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        addPub_btn = new javax.swing.JButton();
        addmember_btn = new javax.swing.JButton();
        addauthor_btn = new javax.swing.JButton();
        addCopy_menubtn = new javax.swing.JButton();
        loans_btn = new javax.swing.JButton();
        reservations_btn = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        listsPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        publicationList = new javax.swing.JList();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        authorList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        addCopyPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        publicationlst = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        noofcopies_lbl = new javax.swing.JLabel();
        addcopy_btn = new javax.swing.JButton();
        cancelcopy_btn = new javax.swing.JButton();
        loansPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        membersloan_cb = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        publicatinsloan_cb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        loans_lst = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        membersloans_lst = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        returnloan_btn = new javax.swing.JButton();
        makeloan_btn = new javax.swing.JButton();
        cancelloan_btn = new javax.swing.JButton();
        reservationsPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        membersreserve_cb = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        publicatinsreserve_cb = new javax.swing.JComboBox();
        makereservations_btn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        membersreserve_lst = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        reservations_lst = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pickupreservation_btn = new javax.swing.JButton();
        cancelreservation_btn = new javax.swing.JButton();
        cancelreservationspanel_btn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setResizable(false);

        menupanel.setBackground(new java.awt.Color(255, 255, 255));

        addPub_btn.setIcon(new javax.swing.ImageIcon("src/resources/icons/book-icon.png")); // NOI18N
        addPub_btn.setText("Add Publication");
        addPub_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPub_btnActionPerformed(evt);
            }
        });

        addmember_btn.setIcon(new javax.swing.ImageIcon("src/resources/icons/member-icon.png")); // NOI18N
        addmember_btn.setText("Add Member");
        addmember_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmember_btnActionPerformed(evt);
            }
        });

        addauthor_btn.setIcon(new javax.swing.ImageIcon("src/resources/icons/author-icon.png")); // NOI18N
        addauthor_btn.setText("Add Author");
        addauthor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addauthor_btnActionPerformed(evt);
            }
        });

        addCopy_menubtn.setIcon(new javax.swing.ImageIcon("src/resources/icons/copy-icon.png")); // NOI18N
        addCopy_menubtn.setText("Add Copy");
        addCopy_menubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCopy_menubtnActionPerformed(evt);
            }
        });

        loans_btn.setIcon(new javax.swing.ImageIcon("src/resources/icons/loan-icon.png")); // NOI18N
        loans_btn.setText("Loans");
        loans_btn.setIconTextGap(8);
        loans_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loans_btnActionPerformed(evt);
            }
        });

        reservations_btn.setIcon(new javax.swing.ImageIcon("src/resources/icons/reservation-icon.png")); // NOI18N
        reservations_btn.setText("Reservations");
        reservations_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservations_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservations_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(loans_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(addCopy_menubtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(addmember_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(addauthor_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(addPub_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addComponent(addPub_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addauthor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addmember_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCopy_menubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loans_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservations_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        mainpanel.setBackground(new java.awt.Color(153, 153, 153));
        mainpanel.setLayout(new java.awt.CardLayout());

        listsPanel.setName("1"); // NOI18N

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 8, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("List of books and Magazines :");

        publicationList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        publicationList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        publicationList.setEnabled(false);
        jScrollPane1.setViewportView(publicationList);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 8, true));

        authorList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        authorList.setEnabled(false);
        jScrollPane2.setViewportView(authorList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("List of Authors :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 8, true));

        memberList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberList.setEnabled(false);
        jScrollPane3.setViewportView(memberList);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("List of Members :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon("src/resources/icons/library-icon.png")); // NOI18N

        javax.swing.GroupLayout listsPanelLayout = new javax.swing.GroupLayout(listsPanel);
        listsPanel.setLayout(listsPanelLayout);
        listsPanelLayout.setHorizontalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        listsPanelLayout.setVerticalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        mainpanel.add(listsPanel, "listscard");

        addCopyPanel.setName("2"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 3, 24));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Copy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Select Publication :");

        publicationlst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        publicationlst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                publicationlstValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(publicationlst);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel6.setText("No of Copies :");

        noofcopies_lbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        noofcopies_lbl.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noofcopies_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(noofcopies_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addcopy_btn.setText("Add");
        addcopy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcopy_btnActionPerformed(evt);
            }
        });

        cancelcopy_btn.setText("Cancel");
        cancelcopy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelcopy_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCopyPanelLayout = new javax.swing.GroupLayout(addCopyPanel);
        addCopyPanel.setLayout(addCopyPanelLayout);
        addCopyPanelLayout.setHorizontalGroup(
            addCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCopyPanelLayout.createSequentialGroup()
                .addGroup(addCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCopyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(addCopyPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(addcopy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelcopy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        addCopyPanelLayout.setVerticalGroup(
            addCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCopyPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelcopy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addcopy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        mainpanel.add(addCopyPanel, "copycard");

        loansPanel.setName("3"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Select Member :");

        membersloan_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(72, 72, 72)
                .addComponent(membersloan_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(membersloan_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Select Publication :");

        publicatinsloan_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(54, 54, 54)
                .addComponent(publicatinsloan_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(publicatinsloan_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 3, 24));
        jLabel9.setText("List of Loans :");
        jLabel9.setToolTipText("");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));

        loans_lst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.black));
        loans_lst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        loans_lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                loans_lstValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(loans_lst);

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel11.setText("Member's Loans");
        jLabel11.setToolTipText("");

        membersloans_lst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.black));
        membersloans_lst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        membersloans_lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                membersloans_lstValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(membersloans_lst);

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel10.setText("Members");
        jLabel10.setToolTipText("");

        returnloan_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnloan_btn.setText("Return");
        returnloan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnloan_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnloan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addComponent(returnloan_btn)
                .addContainerGap())
        );

        makeloan_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        makeloan_btn.setText("Make Loan");
        makeloan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeloan_btnActionPerformed(evt);
            }
        });

        cancelloan_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelloan_btn.setText("Cancel");
        cancelloan_btn.setActionCommand("Cancel");
        cancelloan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelloan_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loansPanelLayout = new javax.swing.GroupLayout(loansPanel);
        loansPanel.setLayout(loansPanelLayout);
        loansPanelLayout.setHorizontalGroup(
            loansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loansPanelLayout.createSequentialGroup()
                .addGroup(loansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loansPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(loansPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addComponent(makeloan_btn)
                                .addGap(111, 111, 111))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(loansPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(cancelloan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        loansPanelLayout.setVerticalGroup(
            loansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loansPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(makeloan_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelloan_btn)
                .addGap(175, 175, 175))
        );

        mainpanel.add(loansPanel, "loanscard");

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Select Member :");

        membersreserve_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Select Publication :");

        publicatinsreserve_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(publicatinsreserve_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(membersreserve_cb, 0, 262, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(membersreserve_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(publicatinsreserve_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        makereservations_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        makereservations_btn.setText("Make Reservation");
        makereservations_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makereservations_btnActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.white), "List of Reservations ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 3, 24))); // NOI18N

        membersreserve_lst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        membersreserve_lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                membersreserve_lstValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(membersreserve_lst);

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel14.setText("Members");

        reservations_lst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(reservations_lst);

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel17.setText("Reservations");

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        pickupreservation_btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pickupreservation_btn.setText("Pickup Reservation");
        pickupreservation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupreservation_btnActionPerformed(evt);
            }
        });

        cancelreservation_btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cancelreservation_btn.setText("Cancel Reservation");
        cancelreservation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelreservation_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(pickupreservation_btn)
                .addGap(27, 27, 27)
                .addComponent(cancelreservation_btn)
                .addGap(28, 28, 28))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelreservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickupreservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel17))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cancelreservationspanel_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelreservationspanel_btn.setText("Cancel");
        cancelreservationspanel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelreservationspanel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reservationsPanelLayout = new javax.swing.GroupLayout(reservationsPanel);
        reservationsPanel.setLayout(reservationsPanelLayout);
        reservationsPanelLayout.setHorizontalGroup(
            reservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationsPanelLayout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(makereservations_btn)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationsPanelLayout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(cancelreservationspanel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(reservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        reservationsPanelLayout.setVerticalGroup(
            reservationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(makereservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelreservationspanel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mainpanel.add(reservationsPanel, "reservationscard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, 0, 0, Short.MAX_VALUE)
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelcopy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcopy_btnActionPerformed
        setVisibility("listscard");
    }//GEN-LAST:event_cancelcopy_btnActionPerformed

    private void addcopy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcopy_btnActionPerformed
        try {
            addCopy();

        } catch (Exception x) {
            JOptionPane.showMessageDialog(this, "Incorret Input.....", "Error!!!!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_addcopy_btnActionPerformed

    private void publicationlstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_publicationlstValueChanged
        if (publicationlst.getSelectedValue() != null) {
            PublicationModel p = (PublicationModel) publicationlst.getSelectedValue();
            noofcopies_lbl.setText("" + p.getCopies().size());
        }

    }//GEN-LAST:event_publicationlstValueChanged

    private void addCopy_menubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCopy_menubtnActionPerformed
        publicationlst.setModel(publications);
        publicationlst.setCellRenderer(new DefaultListCellRenderer() {

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
        noofcopies_lbl.setText("0");
        setVisibility("copycard");
}//GEN-LAST:event_addCopy_menubtnActionPerformed

    private void addauthor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addauthor_btnActionPerformed
        AuthorGUI a = new AuthorGUI(this, true);
        a.setLibrary(this);
        a.fillComboBox();
        a.setVisible(true);
        setVisibility("listscard");
        setAuthorsList(authorList);
    }//GEN-LAST:event_addauthor_btnActionPerformed

    private void addmember_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmember_btnActionPerformed
        MemeberGUI m = new MemeberGUI(this, true);
        m.setLibrary(this);
        m.setVisible(true);
        setVisibility("listscard");
        setMembersList(memberList);
}//GEN-LAST:event_addmember_btnActionPerformed

    private void addPub_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPub_btnActionPerformed
        PublicationGUI d = new PublicationGUI(this, true);
        d.setLibrary(this);
        d.setVisible(true);
        setVisibility("listscard");
        setPublicationsList(publicationList);
}//GEN-LAST:event_addPub_btnActionPerformed

    private void loans_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loans_btnActionPerformed

        setVisibility("loanscard");
        fillMemberComboBox(membersloan_cb);
        fillPublicationComboBox(publicatinsloan_cb);
        setMembersList(membersloans_lst);
        //membersloans_lst.setModel(members);

    }//GEN-LAST:event_loans_btnActionPerformed

    private void makeloan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeloan_btnActionPerformed
        try {
            MemberModel m = (MemberModel) membersloan_cb.getSelectedItem();
            PublicationModel p = (PublicationModel) publicatinsloan_cb.getSelectedItem();
            CopyModel c = null;
            for (CopyModel copy : p.getCopies()) {
                if (copy.getStatus().equals("Available")) {
                    c = copy;
                    break;
                }
            }
            if (c != null) {
               // m.loan(c);
                setMembersList(membersloans_lst);
            } else {
                JOptionPane.showMessageDialog(this, "No Copies Available!!!", "Warning!!!!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Member or Publication!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_makeloan_btnActionPerformed

    private void membersloans_lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_membersloans_lstValueChanged
        if (membersloans_lst.getSelectedValue() != null) {
            MemberModel m = (MemberModel) membersloans_lst.getSelectedValue();
            setLoansList(m);
        }
    }//GEN-LAST:event_membersloans_lstValueChanged

    private void returnloan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnloan_btnActionPerformed
        if (membersloans_lst.getSelectedValue() != null && loans_lst.getSelectedValue() != null) {
            MemberModel m = (MemberModel) membersloans_lst.getSelectedValue();
            Loan l = (Loan) loans_lst.getSelectedValue();
            CopyModel c = l.getCopy();
            System.out.println(c.getStatus());
          //  m.returnit(c);
            System.out.println(c.getStatus());
            setLoansList(m);
            //Problem is Returning the loan and displaying the member's Loans//
        }
    }//GEN-LAST:event_returnloan_btnActionPerformed

    private void loans_lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_loans_lstValueChanged
        /*  if (membersloans_lst.getSelectedValue() != null && loans_lst.getSelectedValue() != null) {    
        //returnloan_btn.setVisible(true);
        Member m = (Member) membersloans_lst.getSelectedValue();
        }
        else {
        // returnloan_btn.setVisible(false);
        }*/
    }//GEN-LAST:event_loans_lstValueChanged

    private void reservations_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservations_btnActionPerformed
        setVisibility("reservationscard");
        fillMemberComboBox(membersreserve_cb);
        fillPublicationComboBox(publicatinsreserve_cb);
        setMembersList(membersreserve_lst);
    }//GEN-LAST:event_reservations_btnActionPerformed

    private void cancelloan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelloan_btnActionPerformed
        setVisibility("listscard");
    }//GEN-LAST:event_cancelloan_btnActionPerformed

    private void makereservations_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makereservations_btnActionPerformed
        try {
            MemberModel m = (MemberModel) membersreserve_cb.getSelectedItem();
            PublicationModel p = (PublicationModel) publicatinsreserve_cb.getSelectedItem();
//            m.reserve(p);
            setMembersList(membersreserve_lst);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Member or Publication!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_makereservations_btnActionPerformed

    private void cancelreservationspanel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelreservationspanel_btnActionPerformed
        setVisibility("listscard");
    }//GEN-LAST:event_cancelreservationspanel_btnActionPerformed

    private void cancelreservation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelreservation_btnActionPerformed
        if (membersreserve_lst.getSelectedValue() != null && reservations_lst.getSelectedValue() != null) {
            MemberModel m = (MemberModel) membersreserve_lst.getSelectedValue();
            Reservation res = (Reservation) reservations_lst.getSelectedValue();
            System.out.println(res.getStatus());
//            m.cancelReservation(res);
            System.out.println(res.getStatus());
            setReservesList(m);
        }
    }//GEN-LAST:event_cancelreservation_btnActionPerformed

    private void pickupreservation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupreservation_btnActionPerformed
        if (membersreserve_lst.getSelectedValue() != null && reservations_lst.getSelectedValue() != null) {
            MemberModel m = (MemberModel) membersreserve_lst.getSelectedValue();
            Reservation res = (Reservation) reservations_lst.getSelectedValue();
            System.out.println(res.getStatus());
//            m.pickupReservation(res);
            System.out.println(res.getStatus());
            setReservesList(m);
        }
    }//GEN-LAST:event_pickupreservation_btnActionPerformed

    private void membersreserve_lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_membersreserve_lstValueChanged
        if (membersreserve_lst.getSelectedValue() != null) {
            MemberModel m = (MemberModel) membersreserve_lst.getSelectedValue();
            setReservesList(m);
        }
    }//GEN-LAST:event_membersreserve_lstValueChanged

    public void addPublication(PublicationModel p) {
        publications.addElement(p);
    }

    public void addAuthor(AuthorModel a) {
        authors.addElement(a);
    }

    public void addMember(MemberModel m) {
        members.addElement(m);
    }

    public void addCopy() {
        PublicationModel p = (PublicationModel) publicationlst.getSelectedValue();
//        CopyModel c = new CopyModel(p.getCopies().size() + 1, "Available", p);
        noofcopies_lbl.setText("" + p.getCopies().size());
    }

    public DefaultListModel getallPublicatins() {
        return publications;
    }

    public void setPublicationsList(JList list) {
        list.setModel(publications);
//        list.setCellRenderer(new DefaultListCellRenderer() {

//            @Override
//            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
//                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
//                if (value != null) {
//                    PublicationModel myObj = (PublicationModel) value;
//                    setText(index + 1 + "- " + myObj.getTitle());
//                }
//                return this;
//            }
//        });
    }

    public void setAuthorsList(JList list) {
        list.setModel(authors);
        list.setCellRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    AuthorModel myObj = (AuthorModel) value;
                    setText(index + 1 + "- " + myObj.getFirstname() + " " + myObj.getLastname());
                }
                return this;
            }
        });
    }

    public void setMembersList(JList list) {
        list.setModel(members);
        list.setCellRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    MemberModel myObj = (MemberModel) value;
                    setText(index + 1 + "- " + myObj.getFirstname() + " " + myObj.getLastname());
                }
                return this;
            }
        });
    }

    public void setLoansList(MemberModel m) {
        loans_lst.setListData(m.getLoans().toArray());
        /*
        List<Loan> onloan = new ArrayList<Loan>();
        for (Loan l : loans) {
        if (l.getCopy().getStatus().equals("Loaned")) {
        onloan.add(l);
        }
        }
        loans_lst.setListData(onloan.toArray());*/
        loans_lst.setCellRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    String s = "Not Returned Yet";
                    Loan myObj = (Loan) value;
                    if (myObj.isReturned()) {
                        Date d = myObj.getReturndate();
                        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
                        s = df.format(d);
                    }
//                    setText("- " + myObj.getCopy().getPublication().getTitle() + " - Return Date: " + s);
                }
                return this;
            }
        });
    }

    public void setReservesList(MemberModel m) {
        List<Reservation> reservations = m.getReservations();
        reservations_lst.setListData(reservations.toArray());
        reservations_lst.setCellRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    Reservation myObj = (Reservation) value;
                    setText("- " + myObj.getPublication().getTitle() + " - Status: " + myObj.getStatus());
                }
                return this;
            }
        });
    }

    public void setVisibility(String s) {
        CardLayout c = (CardLayout) mainpanel.getLayout();
        c.show(mainpanel, s);
    }

    public void fillMemberComboBox(JComboBox bx) {
        if (!members.isEmpty()) {
            bx.setModel(new DefaultComboBoxModel(members.toArray()));
            bx.setRenderer(new DefaultListCellRenderer() {

                @Override
                public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    if (value != null) {
                        MemberModel myObj = (MemberModel) value;
                        setText(myObj.getFirstname() + " " + myObj.getLastname());
                    }
                    return this;
                }
            });
        }
    }

    public void fillPublicationComboBox(JComboBox bx) {
        if (!publications.isEmpty()) {
            bx.setModel(new DefaultComboBoxModel(publications.toArray()));
            bx.setRenderer(new DefaultListCellRenderer() {

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

    public void fillData() {
        publications.add(0, new BookModel("Book1", 7, 11));
        publications.add(1, new BookModel("Book2", 7, 122));
        publications.add(2, new BookModel("Book3", 7, 6));
        publications.add(3, new BookModel("Book4", 7, 2));
        publications.add(4, new MagazineModel("Magazine1", 7, 12));
        publications.add(5, new MagazineModel("Magazine2", 7, 54));
        publications.add(6, new MagazineModel("Magazine3", 7, 32));
        publications.add(7, new MagazineModel("Magazine4", 7, 23));

//        authors.add(0, new AuthorModel("Ahmed", "Ibrahim", 012334324, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(0)));
//        authors.add(1, new AuthorModel("Omar", "Sherif", 015656, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(1)));
//        authors.add(2, new AuthorModel("Mohamed", "AbdelRahman", 01562356, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(2)));
//        authors.add(3, new AuthorModel("Ibrahim", "Hamouda", 01562356, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(3)));

        members.add(0, new MemberModel("AbdelRaouf", "ElKaffash", new AddressModel("1000", "Miami", "Alexandria", 1232), 91545454, 1));
        members.add(1, new MemberModel("Sara", "Mohamed", new AddressModel("1000", "Miami", "Alexandria", 1232), 17113224, 2));
        members.add(2, new MemberModel("Nancy", "AbdelKreem", new AddressModel("1000", "Miami", "Alexandria", 1232), 21391224, 3));
        members.add(3, new MemberModel("Amr", "Diab", new AddressModel("1000", "Miami", "Alexandria", 1232), 12334324, 4));
        members.add(4, new MemberModel("Mohamed", "Mounir", new AddressModel("1000", "Miami", "Alexandria", 1232), 812334324, 5));

        setPublicationsList(publicationList);
        setAuthorsList(authorList);
        setMembersList(memberList);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCopyPanel;
    private javax.swing.JButton addCopy_menubtn;
    private javax.swing.JButton addPub_btn;
    private javax.swing.JButton addauthor_btn;
    private javax.swing.JButton addcopy_btn;
    private javax.swing.JButton addmember_btn;
    private javax.swing.JList authorList;
    private javax.swing.JButton cancelcopy_btn;
    private javax.swing.JButton cancelloan_btn;
    private javax.swing.JButton cancelreservation_btn;
    private javax.swing.JButton cancelreservationspanel_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel listsPanel;
    private javax.swing.JPanel loansPanel;
    private javax.swing.JButton loans_btn;
    private javax.swing.JList loans_lst;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton makeloan_btn;
    private javax.swing.JButton makereservations_btn;
    private javax.swing.JList memberList;
    private javax.swing.JComboBox membersloan_cb;
    private javax.swing.JList membersloans_lst;
    private javax.swing.JComboBox membersreserve_cb;
    private javax.swing.JComboBox membersreserve_cb1;
    private javax.swing.JList membersreserve_lst;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel noofcopies_lbl;
    private javax.swing.JButton pickupreservation_btn;
    private javax.swing.JComboBox publicatinsloan_cb;
    private javax.swing.JComboBox publicatinsreserve_cb;
    private javax.swing.JComboBox publicatinsreserve_cb1;
    private javax.swing.JList publicationList;
    private javax.swing.JList publicationlst;
    private javax.swing.JPanel reservationsPanel;
    private javax.swing.JButton reservations_btn;
    private javax.swing.JList reservations_lst;
    private javax.swing.JButton returnloan_btn;
    // End of variables declaration//GEN-END:variables
}
