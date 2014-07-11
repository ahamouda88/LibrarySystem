package librarysys.web.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Author;
import librarysys.managers.interfaces.PersonManager;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@RequestScoped
public class AuthorManagedBean {

	@Autowired
	private PersonManager personManager;
	private Author author;
	
	public AuthorManagedBean(){
		author = new Author();
	}
	
	public String saveAuthor(){
		String page = "";
		personManager.save(author);
		return page;
	}

	public PersonManager getPersonManager() {
		return personManager;
	}

	public void setPersonManager(PersonManager personManager) {
		this.personManager = personManager;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
