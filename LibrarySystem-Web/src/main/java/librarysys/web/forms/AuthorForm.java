package librarysys.web.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Address;
import librarysys.entities.Author;

@ManagedBean(name="authorForm")
@RequestScoped
public class AuthorForm {
	
	private Author author;
	private Address address;
	
	public AuthorForm(){
		author = new Author();
		address = new Address();
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
