package librarysys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COPY")
public class Copy implements BaseEntity{

	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "copy_no")
    private int copyno;
	@Column(name = "status")
    public String status;
	@ManyToOne
	@JoinColumn(name = "publication_id")
    private Publication publicationModel;

	@OneToMany(mappedBy = "copyModel")
    private Reservation reservation;
    
    public Copy(){}
    
	public Copy(int copyno, String status) {
		this.copyno = copyno;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopyno() {
		return copyno;
	}
	
	public void setCopyno(int copyno) {
		this.copyno = copyno;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Publication getPublicationModel() {
		return publicationModel;
	}

	public void setPublicationModel(Publication publicationModel) {
		this.publicationModel = publicationModel;
	}

	public Reservation getReservation() {
		return reservation;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
