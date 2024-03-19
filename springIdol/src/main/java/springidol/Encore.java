package springidol;

public class Encore {
	private Performer performer;

	public void setPerformer(Singer performer) {
		this.performer = performer;
	}

	public void execute() {
		System.out.println("Encore Performance");
		performer.perform();
	}
}
