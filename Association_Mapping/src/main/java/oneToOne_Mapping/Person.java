package oneToOne_Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String emails;
	private long phoneNo;
	
	@OneToOne
	private AadhaarCard ac;

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

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public AadhaarCard getAc() {
		return ac;
	}

	public void setAc(AadhaarCard ac) {
		this.ac = ac;
	}

	public Person(int id, String name, String emails, long phoneNo, AadhaarCard ac) {
		super();
		this.id = id;
		this.name = name;
		this.emails = emails;
		this.phoneNo = phoneNo;
		this.ac = ac;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emails=" + emails + ", phoneNo=" + phoneNo + ", ac=" + ac
				+ "]";
	}
	
	

}
