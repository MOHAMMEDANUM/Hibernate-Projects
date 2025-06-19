package manyToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	private String name;
	private String usn;
	private long phoneNo;
	private String emails;
	
	@ManyToMany
	private Subject s;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public Subject getS() {
		return s;
	}

	public void setS(Subject s) {
		this.s = s;
	}

	public Student(int id, String name, String usn, long phoneNo, String emails, Subject s) {
		super();
		this.id = id;
		this.name = name;
		this.usn = usn;
		this.phoneNo = phoneNo;
		this.emails = emails;
		this.s = s;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", usn=" + usn + ", phoneNo=" + phoneNo + ", emails=" + emails
				+ ", s=" + s + "]";
	}
}
