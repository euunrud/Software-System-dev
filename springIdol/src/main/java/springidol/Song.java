package springidol;

public class Song{ //Song 클래스 생성
	private String title;
	private String artist;

	//Setter이용해 값 주입 받음.
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
}
