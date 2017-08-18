package xmlConfigProperty;

import java.util.List;

public class BlankDisc implements CompactDisc{
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
		for (String str:tracks) {
			System.out.println("_track:"+str);	
		}
	}
}
