package User;

public class BussinessUser extends User{

	private String companyName;
	private String companyAddress;
	
	public BussinessUser() {
		super();
	}

	public BussinessUser(int id, String username, String password, String profilePicture, String explanation, String companyName, String companyAddress) {
		super(id, username, password, profilePicture, explanation);
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
}
