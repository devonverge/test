
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phone;
	
	public BuddyInfo(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone =phone;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BuddyInfo bud = new BuddyInfo("homer", "123 tree", "123456789");
		System.out.println("Name: " + bud.getName() + "Address: " + bud.getAddress() + "Phone #: " + bud.getPhone());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
