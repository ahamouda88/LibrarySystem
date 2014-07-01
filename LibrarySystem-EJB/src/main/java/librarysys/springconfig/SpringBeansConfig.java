package librarysys.springconfig;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({"librarysys.entities","librarysys.spring"})
@ImportResource("classpath:META-INF/spring-config.xml")
public class SpringBeansConfig {

	
	@Bean
	public DataSource dataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/..");
		dataSource.setUsername("username");
		dataSource.setPassword("password");
		return dataSource;
	}
	
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
