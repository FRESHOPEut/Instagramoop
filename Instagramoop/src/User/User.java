package User;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String profilePicture;
	private String explanation;
	
	public User() {
		super();
	}

	public User(int id, String username, String password, String profilePicture, String explanation) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.profilePicture = profilePicture;
		this.explanation = explanation;
	}

	public User(String username, String profilePicture) {
		super();
		this.username = username;
		this.profilePicture = profilePicture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
}
