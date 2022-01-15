package User;

public class IndividualUser extends User{

	private String firstName;
	private String lastName;
	private int age;
	
	public IndividualUser() {
		super();
	}

	public IndividualUser(int id, String username, String password, String profilePicture, String explanation, String firstName, String lastName, int age) {
		super(id, username, password, profilePicture, explanation);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
