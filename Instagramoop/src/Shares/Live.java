package Shares;

public class Live extends Share {

	private String[] comment;

	public Live() {
		super();
	}

	public Live(String[] media, int likes, String[] comment) {
		super(media, likes);
		this.comment = comment;
	}

	public String[] getComment() {
		return comment;
	}

	public void setComment(String[] comment) {
		this.comment = comment;
	}
	
	
}
