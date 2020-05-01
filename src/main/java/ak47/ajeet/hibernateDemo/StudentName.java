package ak47.ajeet.hibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String firstname;
	private String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "studentName [firstname=" + firstname + ", lastname=" + lastname + "]";
	} 
	
}
