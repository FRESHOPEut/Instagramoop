package Shares;

public class Reel extends Share{

	private String explanation;
	
	public Reel() {
		super();
	}

	public Reel(String[] media, int likes, String explanation) {
		super(media,likes);
		this.explanation = explanation;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
}
