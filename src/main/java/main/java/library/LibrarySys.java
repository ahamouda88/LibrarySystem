package main.java.library;

import java.text.DateFormat;
import java.util.*;

import javax.swing.*;

import main.java.model.AddressModel;
import main.java.model.MemberModel;

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
         
         AddressModel a1 = new AddressModel("20","Alex","Miami",2015);
         MemberModel m1 = new MemberModel("Omar","Ibrahim",a1, 12312312,333);
         Book b1 = new Book("Sindad",4,123);
         Copy c1 = new Copy(1,"aviable",b1);
         javax.swing.ImageIcon x=  new javax.swing.ImageIcon(this.getClass().getResource("/book-icon.png"));
         /* Secenario 1
         m1.loan(c1);
         System.out.println(c1.getStatus());
         m1.returnit(c1);
         System.out.println(c1.getStatus());
         */
         m1.reserve(b1);
         //System.out.println(b1.getFirstReservation().getStatus());

         JFrame f = new JFrame("Library System");
         f.setSize(800, 500);
         f.setVisible(true);
         f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
