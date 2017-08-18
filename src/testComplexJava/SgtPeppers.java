package testComplexJava;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
	private String title = "七里香";
	private String artist = "周杰伦";
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
	}
}
