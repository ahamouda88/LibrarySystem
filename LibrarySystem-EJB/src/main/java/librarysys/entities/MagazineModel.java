package librarysys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "MAGAZINE")
@PrimaryKeyJoinColumn(name = "magazine_id", referencedColumnName = "id")
public class MagazineModel extends PublicationModel {

	@Column(name = "issue_no")
    private int issueno;
    
    public MagazineModel(){}

    public MagazineModel(String title, int max, int issueno) {
        super(title, max);
        this.issueno = issueno;
    }
    public int getIssueno() {
        return this.issueno;
    }
    public void setIssueno(int issue) {
        this.issueno = issue;
    }
}
