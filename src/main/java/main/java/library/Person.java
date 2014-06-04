package main.java.library;

import javax.swing.*;

public class Person {
    private String firstname;
    private String lastname;
    private int telephone;
    private Address ad;
    
    public Person(String firstname,String lastname, int telephone,Address address)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.ad = address;
        address.setPerson(this);
       /* JFrame f = new JFrame("sssssssssssssssssssssssssssssss");
        f.setSize(100,100);
        f.setVisible(true);
       */
    }

    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String s)
    {
        this.firstname = s;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String s)
    {
        this.lastname = s;
    }
    public int getTelephone()
    {
        return telephone;
    }
    public void setTelephone(int tel)
    {
        this.telephone = tel;
    }
    
}
