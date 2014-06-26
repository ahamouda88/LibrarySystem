package librarysys.spring;

import librarysys.entities.Address;
import librarysys.entities.Author;
import librarysys.entities.Book;
import librarysys.entities.Copy;
import librarysys.entities.Loan;
import librarysys.entities.Magazine;
import librarysys.entities.Member;
import librarysys.entities.Reservation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"librarysys.entities"})
public class SpringBeansConfig {
	
//	@Bean(name = "Address")
//	public Address address(){
//		Address address = new Address();
//		return address;
//	}
//	
//	@Bean(name = "Author")
//	public Author author(){
//		Author author = new Author();
//		return author;
//	}
//	
//	@Bean(name = "Member")
//	public Member member(){
//		Member member = new Member();
//		return member;
//	}
//	
//	@Bean(name = "Book")
//	public Book book(){
//		Book book = new Book();
//		return book;
//	}
//	
//	@Bean(name = "Magazine")
//	public Magazine magazine(){
//		Magazine magazine = new Magazine();
//		return magazine;
//	}
//	
//	@Bean(name = "Copy")
//	public Copy copy(){
//		Copy copy = new Copy();
//		return copy;
//	}
//	
//	@Bean(name = "Reservation")
//	public Reservation reservation(){
//		return new Reservation();
//	}
//	
//	@Bean(name = "Loan")
//	public Loan loan(){
//		return new Loan();
//	}
	
}
