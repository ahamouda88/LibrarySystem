package librarysys.spring;

import librarysys.entities.Address;
import librarysys.entities.Author;
import librarysys.entities.Member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfig {
	
	@Bean(name = "Address")
	public Address address(){
		Address address = new Address();
		return address;
	}
	
	@Bean(name = "Author")
	public Author author(){
		Author author = new Author();
		return author;
	}
	
	@Bean(name = "Member")
	public Member member(){
		Member member = new Member();
		return member;
	}
}
