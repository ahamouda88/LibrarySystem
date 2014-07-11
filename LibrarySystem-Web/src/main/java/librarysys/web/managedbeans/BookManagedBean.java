package librarysys.web.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Book;
import librarysys.managers.interfaces.PublicationManager;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@RequestScoped
public class BookManagedBean {

	@Autowired
	private PublicationManager publicationManager;
	private Book book;
	
	public BookManagedBean(){
		book = new Book();
	}
	
	public String saveBook(){
		String page = "";
		publicationManager.save(book);
		return page;
	}

	public PublicationManager getPublicationManager() {
		return publicationManager;
	}

	public void setPublicationManager(PublicationManager publicationManager) {
		this.publicationManager = publicationManager;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
