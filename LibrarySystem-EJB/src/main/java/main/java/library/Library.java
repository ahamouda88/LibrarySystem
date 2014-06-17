package main.java.library;

import javax.swing.*;

import librarysys.entities.Address;
import librarysys.entities.Book;
import librarysys.entities.Magazine;
import librarysys.entities.Member;

public class Library extends JFrame {

    private DefaultListModel publications;
    private DefaultListModel members;

    public Library() {
        publications = new DefaultListModel();
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

    private void makeloan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeloan_btnActionPerformed
//        try {
//            Member m = (Member) membersloan_cb.getSelectedItem();
//            Publication p = (Publication) publicatinsloan_cb.getSelectedItem();
//            Copy c = null;
//            for (Copy copy : p.getCopies()) {
//                if (copy.getStatus().equals("Available")) {
//                    c = copy;
//                    break;
//                }
//            }
//            if (c != null) {
//                m.loan(c);
//                setMembersList(membersloans_lst);
//            } else {
//                JOptionPane.showMessageDialog(this, "No Copies Available!!!", "Warning!!!!", JOptionPane.WARNING_MESSAGE);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Invalid Member or Publication!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_makeloan_btnActionPerformed

    private void returnloan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnloan_btnActionPerformed
//        if (membersloans_lst.getSelectedValue() != null && loans_lst.getSelectedValue() != null) {
//            Member m = (Member) membersloans_lst.getSelectedValue();
//            Loan l = (Loan) loans_lst.getSelectedValue();
//            Copy c = l.getCopy();
//            System.out.println(c.getStatus());
//            m.returnit(c);
//            System.out.println(c.getStatus());
//            setLoansList(m);
//            //Problem is Returning the loan and displaying the member's Loans//
//        }
    }//GEN-LAST:event_returnloan_btnActionPerformed

    public void addCopy() {
//        Publication p = (Publication) publicationlst.getSelectedValue();
//        CopyModel c = new CopyModel(p.getCopies().size() + 1, "Available", p);
//        noofcopies_lbl.setText("" + p.getCopies().size());
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

    public void setLoansList(Member m) {
//        loans_lst.setListData(m.getLoans().toArray());
//        /*
//        List<Loan> onloan = new ArrayList<Loan>();
//        for (Loan l : loans) {
//        if (l.getCopy().getStatus().equals("Loaned")) {
//        onloan.add(l);
//        }
//        }
//        loans_lst.setListData(onloan.toArray());*/
//        loans_lst.setCellRenderer(new DefaultListCellRenderer() {
//
//            @Override
//            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
//                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
//                if (value != null) {
//                    String s = "Not Returned Yet";
//                    Loan myObj = (Loan) value;
//                    if (myObj.isReturned()) {
//                        //Date d = myObj.getReturndate();
//                        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//                        s = df.format(d);
//                    }
//                    setText("- " + myObj.getCopy().getPublication().getTitle() + " - Return Date: " + s);
//                }
//                return this;
//            }
//        });
    }

   
    public void fillData() {
        publications.add(0, new Book("Book1", 7, 11));
        publications.add(1, new Book("Book2", 7, 122));
        publications.add(2, new Book("Book3", 7, 6));
        publications.add(3, new Book("Book4", 7, 2));
        publications.add(4, new Magazine("Magazine1", 7, 12));
        publications.add(5, new Magazine("Magazine2", 7, 54));
        publications.add(6, new Magazine("Magazine3", 7, 32));
        publications.add(7, new Magazine("Magazine4", 7, 23));

//        authors.add(0, new AuthorModel("Ahmed", "Ibrahim", 012334324, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(0)));
//        authors.add(1, new AuthorModel("Omar", "Sherif", 015656, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(1)));
//        authors.add(2, new AuthorModel("Mohamed", "AbdelRahman", 01562356, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(2)));
//        authors.add(3, new AuthorModel("Ibrahim", "Hamouda", 01562356, new AddressModel("1000", "Miami", "Alexandria", 1232), "N/A", "ABC", (BookModel) publications.get(3)));

        members.add(0, new Member("AbdelRaouf", "ElKaffash", new Address("1000", "Miami", "Alexandria", 1232), 91545454, 1));
        members.add(1, new Member("Sara", "Mohamed", new Address("1000", "Miami", "Alexandria", 1232), 17113224, 2));
        members.add(2, new Member("Nancy", "AbdelKreem", new Address("1000", "Miami", "Alexandria", 1232), 21391224, 3));
        members.add(3, new Member("Amr", "Diab", new Address("1000", "Miami", "Alexandria", 1232), 12334324, 4));
        members.add(4, new Member("Mohamed", "Mounir", new Address("1000", "Miami", "Alexandria", 1232), 812334324, 5));

    }
    
}
