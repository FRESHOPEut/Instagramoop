package Following;

public class ToFollow extends Following {

	private String toFollow;

	public ToFollow() {
		super();
	}

	public ToFollow(String username, String profilePicture, String toFollow) {
		super(username, profilePicture);
		this.toFollow = toFollow;
	}

	public String getToFollow() {
		return toFollow;
	}

	public void setToFollow(String toFollow) {
		this.toFollow = toFollow;
	}
	
	
}
