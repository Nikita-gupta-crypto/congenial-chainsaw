package Ntier.pojo;

public class Customer {
	private int id;
	private String name;
	private String email,address,mobileno;
	public Customer()
	{
		
	}
	public Customer(int id, String name, String email, String address, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileno = mobileno;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobileno="
				+ mobileno + "]";
	}

}
