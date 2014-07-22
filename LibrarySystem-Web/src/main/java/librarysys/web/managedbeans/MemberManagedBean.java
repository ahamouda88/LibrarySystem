package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Address;
import librarysys.entities.Member;
import librarysys.managers.interfaces.PersonManager;

@ManagedBean(name="memberMB")
@RequestScoped
public class MemberManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PersonManager memberManager;
	private Member member;
	private Address address;
	
	public MemberManagedBean(){
		member = new Member();
		address = new Address();
	}

	public String saveMember(){
		String page = "";
		if(address != null){
			member.setAddress(address);
		}
		memberManager.save(member);
		return page;
	}
	
	public PersonManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(PersonManager memberManager) {
		this.memberManager = memberManager;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
