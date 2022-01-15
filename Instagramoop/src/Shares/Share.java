package Shares;

public class Share {

	private String[] media;
	private int likes;
	
	public Share() {
		super();
	}

	public Share(String[] media, int likes) {
		super();
		this.media = media;
		this.likes = likes;
	}

	public String[] getMedia() {
		return media;
	}

	public void setMedia(String[] media) {
		this.media = media;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	
}
