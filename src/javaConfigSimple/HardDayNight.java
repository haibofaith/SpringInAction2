package javaConfigSimple;

import org.springframework.stereotype.Component;

@Component
public class HardDayNight implements CompactDisc{
	private String title = "十年";
	private String artist = "陈奕迅";
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
	}
}
