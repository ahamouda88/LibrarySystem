package librarysys.springconfig;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan({"librarysys.entities","librarysys.spring"})
@ImportResource("classpath:META-INF/spring-config.xml")
@PropertySource("classpath:persistence-mysql.properties")
public class SpringBeansConfig {

// TODO Convert from XML Configuration to Java Configuration and Annotations
	
//	@Value("${datbaase.url}")
//	private String databaseURL;
	
//	@Bean
//	public DataSource dataSource() {
//		
//		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost/..");
//		dataSource.setUsername("username");
//		dataSource.setPassword("password");
//		return dataSource;
//	}
	
//	@Bean
//	public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
//		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
//		ppc.setLocation(new ClassPathResource("application.properties"));
//		ppc.setIgnoreUnresolvablePlaceholders(true);
//		return ppc;
//	}
	
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
