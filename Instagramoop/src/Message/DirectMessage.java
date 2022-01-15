package Message;

public class DirectMessage {

	private String message;
	private String call;
	private String likeMessage;
	
	public DirectMessage() {
		super();
	}

	public DirectMessage(String message, String likeMessage) {
		super();
		this.message = message;
		this.likeMessage = likeMessage;
	}
	

	public DirectMessage(String call) {
		super();
		this.call = call;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getLikeMessage() {
		
			return likeMessage;
	}

	public void setLikeMessage(String likeMessage) {
		this.likeMessage = likeMessage;
	}
	
	
}
