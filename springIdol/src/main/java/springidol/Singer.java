package springidol;

public class Singer implements Performer {
	private String name;
	private Song song; //Song 객체 참조
	private Instrument instrument;

	public Singer(String name, Song song) { //악기 없는 Singer를 위한 생성자. Singer는 생성자 이용해 값, 의존객체 주입 받음.
		this.name = name;
		this.song = song;
	}

	public Singer(String name, Song song, Instrument instrument) {//악기 있는 Singer를 위한 생성자
		this.name = name;
		this.song = song;
		this.instrument = instrument;
	}

	public Song getSong() {
		return song;
	} // xml에서 사용. SpEL 사용하여 이름.song했을때 getter 반드시 필요

	@Override
	public void perform() throws PerformanceException {
		System.out.println(name + " is singing a song \"" + song.getTitle() + "\" by " + song.getArtist());
		if (instrument != null) {  //악기가 있을때 악기명 + 악기 소리 출력
			System.out.print("while playing " + instrument.getClass().getSimpleName() + " ");
			instrument.play();
		}
	}
}
