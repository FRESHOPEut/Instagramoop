package Shares;

public class Story extends Share {

	private String explanation;
	private String[] comment;
	
	public Story() {
		super();
	}

	public Story(String[] media, int likes, String explanation, String[] comment) {
		super(media,likes);
		this.explanation = explanation;
		this.comment = comment;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String[] getComment() {
		return comment;
	}

	public void setComment(String[] comment) {
		this.comment = comment;
	}
	
	
}
