package librarysys.web.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Member;
import librarysys.managers.interfaces.PersonManager;

@ManagedBean(name="memberMB")
@RequestScoped
public class MemberManagedBean {

	@Autowired
	private PersonManager memberManager;
	private Member member;
	
	public MemberManagedBean(){
		member = new Member();
	}

	public String saveMember(){
		String page = "";
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
	
}
