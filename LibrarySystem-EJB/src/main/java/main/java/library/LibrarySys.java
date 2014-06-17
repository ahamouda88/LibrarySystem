package main.java.library;

import java.text.DateFormat;
import java.util.*;

import javax.swing.*;

import librarysys.entities.Address;
import librarysys.entities.Book;
import librarysys.entities.Copy;
import librarysys.entities.Member;

public class LibrarySys {

    public static void main(String[] args) {
       LibrarySys sys = new LibrarySys();
       sys.startMain();
    }
    
    public void startMain(){
    	 Calendar c = Calendar.getInstance();
         c.set(1988, 7, 8);
         Date d = c.getTime();
         DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
         String s = df.format(d);
         
         Address a1 = new Address("20","Alex","Miami",2015);
         Member m1 = new Member("Omar","Ibrahim",a1, 12312312,333);
         Book b1 = new Book("Sindad",4,123);
//         CopyModel c1 = new CopyModel(1,"aviable",b1);
         javax.swing.ImageIcon x=  new javax.swing.ImageIcon(this.getClass().getResource("/book-icon.png"));
         /* Secenario 1
         m1.loan(c1);
         System.out.println(c1.getStatus());
         m1.returnit(c1);
         System.out.println(c1.getStatus());
         */
//         m1.reserve(b1);
         //System.out.println(b1.getFirstReservation().getStatus());

         JFrame f = new JFrame("Library System");
         f.setSize(800, 500);
         f.setVisible(true);
         f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
