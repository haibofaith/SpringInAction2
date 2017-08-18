package xmlConfigProperty;

public class CDPlayer implements MediaPlayer{
	private CompactDisc compactDisc;
	
	public CDPlayer() {
//		this.compactDisc = compactDisc;
	}
	
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	@Override
	public void play() {
		compactDisc.play();
	}

}
