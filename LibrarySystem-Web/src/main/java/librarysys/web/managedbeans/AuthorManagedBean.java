package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import librarysys.managers.interfaces.PersonManager;
import librarysys.web.forms.AuthorForm;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name="authorMB")
@RequestScoped
public class AuthorManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PersonManager personManager;
	
	@ManagedProperty(value="#{authorForm}")
	private AuthorForm authorForm;
	
	public AuthorManagedBean(){
	}
	
	public String saveAuthor(){
		String page = "";
		if(authorForm.getAddress() != null){
			authorForm.getAuthor().setAddress(authorForm.getAddress());
		}
		personManager.save(authorForm.getAuthor());
		return page;
	}

	public AuthorForm getAuthorForm() {
		return authorForm;
	}

	public void setAuthorForm(AuthorForm authorForm) {
		this.authorForm = authorForm;
	}

	
}
