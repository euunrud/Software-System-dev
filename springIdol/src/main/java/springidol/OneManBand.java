package springidol;

import java.util.*;

public class OneManBand implements Performer {
	private Map<String, Instrument> instruments;

	public OneManBand() {
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (Map.Entry<String, Instrument> entry : instruments.entrySet()) {
			String key = entry.getKey();
			Instrument instrument = entry.getValue();
			System.out.print(key + " : ");
			instrument.play();
		}
	}

}
