package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Copy;
import librarysys.managers.interfaces.CopyManager;

@ManagedBean(name="copyMB")
@RequestScoped
public class CopyManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	//@ManagedProperty(value = "{CopyManager}")
	@Autowired
	private CopyManager copyManager;
	private Copy copy;
	
	public CopyManagedBean(){
		copy = new Copy();
	}
	
	public String saveCopy(){
		String page = "";
		copyManager.save(copy);
		return page;
	}

	public CopyManager getCopyManager() {
		return copyManager;
	}

	public void setCopyManager(CopyManager copyManager) {
		this.copyManager = copyManager;
	}

	public Copy getCopy() {
		return copy;
	}

	public void setCopy(Copy copy) {
		this.copy = copy;
	}
	
	
}
