package Following;

public class Follower extends Following {
	private String follower;

	public Follower() {
		super();
	}

	public Follower(String username, String profilePicture, String follower) {
		super(username, profilePicture);
		this.follower = follower;
	}

	public String getFollower() {
		return follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
	}

	
	
	
}
