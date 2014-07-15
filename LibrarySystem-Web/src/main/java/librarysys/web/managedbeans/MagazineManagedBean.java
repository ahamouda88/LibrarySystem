package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Magazine;
import librarysys.managers.interfaces.PublicationManager;

@ManagedBean(name="magazineMB")
@RequestScoped
public class MagazineManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PublicationManager magazineManager;
	private Magazine magazine;
	
	public MagazineManagedBean(){
		magazine = new Magazine();
	}

	public String saveMagazine(){
		String page = "";
		magazineManager.save(magazine);
		return page;
	}

	public PublicationManager getMagazineManager() {
		return magazineManager;
	}

	public void setMagazineManager(PublicationManager magazineManager) {
		this.magazineManager = magazineManager;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}

}
