package librarysys.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Magazine")
public class MagazineModel extends PublicationModel {

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
