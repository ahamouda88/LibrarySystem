package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLICATION")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Publication {

	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "title")
    private String title;
	@Column(name = "max_checkout_length")
    private int maxcheckoutlength;
	// I can change it to unidirectional association
	@OneToMany(mappedBy = "publicationModel")
	private List<Copy> copies = new ArrayList<Copy>();
//    @OneToMany(mappedBy = "publicationModel")
//    private List<Reservation> reservations = new LinkedList<Reservation>();
    
    public Publication(){}

    public Publication(String title, int max) {
        this.title = title;
        this.maxcheckoutlength = max;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Copy> getCopies() {
		return copies;
	}

	public void setCopies(List<Copy> copies) {
		this.copies = copies;
	}

//	public List<Reservation> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(List<Reservation> reservations) {
//		this.reservations = reservations;
//	}

   
}
