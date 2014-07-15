package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Book;
import librarysys.managers.interfaces.PublicationManager;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name="bookMB")
@RequestScoped
public class BookManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PublicationManager bookManager;
	private Book book;
	
	public BookManagedBean(){
		book = new Book();
	}
	
	public String saveBook(){
		String page = "";
		bookManager.save(book);
		return page;
	}

	public PublicationManager getBookManager() {
		return bookManager;
	}

	public void setBookManager(PublicationManager bookManager) {
		this.bookManager = bookManager;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
