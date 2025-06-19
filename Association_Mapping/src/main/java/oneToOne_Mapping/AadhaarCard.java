package oneToOne_Mapping;

public class AadhaarCard {

	private int id;
	private String name;
	private long phoneNo;
	private long aadhaarNo;
	private String address;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AadhaarCard(int id, String name, long phoneNo, long aadhaarNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.aadhaarNo = aadhaarNo;
		this.address = address;
	}
	public AadhaarCard() {
		super();
	}
	@Override
	public String toString() {
		return "AadhaarCard [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", aadhaarNo=" + aadhaarNo
				+ ", address=" + address + "]";
	}
	
}
