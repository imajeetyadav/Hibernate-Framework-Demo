package ak47.ajeet.hibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

//@Entity(name="student_record")  change  name  of  table  using  entity annotation
@Entity
public class Student {
	@Id
	private	int rollnumber;
	
// 	@Transient     if we use this annotation then below variable data will not store in database 
//  @Column(name="name_student")      if we use this annotation then this name is use as column for  below  variable data
	@Column
	private StudentName Name;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public StudentName getName() {
		return Name;
	}
	public void setName(StudentName name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", Name=" + Name + "]";
	}


	
}
