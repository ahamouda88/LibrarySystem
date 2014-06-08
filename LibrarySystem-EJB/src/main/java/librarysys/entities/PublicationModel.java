package librarysys.entities;

import java.util.*;

import main.java.library.Reservation;

public abstract class PublicationModel {

    private String title;
    private int maxcheckoutlength;
    private List<CopyModel> copies = new ArrayList<CopyModel>();
    private List<Reservation> reservations = new LinkedList<Reservation>();
    
    public  PublicationModel(){}

    public PublicationModel(String title, int max) {
        this.title = title;
        this.maxcheckoutlength = max;
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

	public int getMaxcheckoutlength() {
		return maxcheckoutlength;
	}

	public void setMaxcheckoutlength(int maxcheckoutlength) {
		this.maxcheckoutlength = maxcheckoutlength;
	}

	public List<CopyModel> getCopies() {
		return copies;
	}

	public void setCopies(List<CopyModel> copies) {
		this.copies = copies;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

   
}
