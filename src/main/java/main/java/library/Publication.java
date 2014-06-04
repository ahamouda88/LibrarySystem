package main.java.library;

import java.util.*;

public class Publication {

    private String title;
    private int maxcheckoutlength;
    private List<Copy> copies;
    private Queue<Reservation> reservations;

    public Publication(String title, int max) {
        reservations = new LinkedList<Reservation>();
        copies = new ArrayList<Copy>();
        this.title = title;
        this.maxcheckoutlength = max;
        Copy c = new Copy(copies.size() + 1, "Available", this);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String s) {
        this.title = s;
    }

    public int getMaxlength() {
        return this.maxcheckoutlength;
    }

    public void setMaxlength(int max) {
        this.maxcheckoutlength = max;
    }

    public void addCopy(Copy c) {
        copies.add(c);
    }

    public void addReservation(Reservation res) {
        reservations.add(res);
    }

    public Reservation getFirstReservation() {
        return reservations.poll();
    }

    public Queue getAllReservations() {
        return reservations;
    }

    public boolean hasPendingReservations() {
        for (Reservation res : reservations) {
            if (res.getStatus().equals("Pending")) {
                return true;
            }
        }
        return false;
    }

    public List<Copy> getCopies() {
        return copies;
    }
}
