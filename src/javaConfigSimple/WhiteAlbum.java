package javaConfigSimple;

import org.springframework.stereotype.Component;

@Component
public class WhiteAlbum implements CompactDisc{
	private String title = "天路";
	private String artist = "韩红";
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
	}
}
