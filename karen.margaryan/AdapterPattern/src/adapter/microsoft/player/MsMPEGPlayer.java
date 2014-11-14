package adapter.microsoft.player;

public class MsMPEGPlayer implements MsVideoPlayer {
	
	
	
	@Override
	public void playMPEG(String filePath) {
		System.out.println("Microsoft: Playing 'mpeg' file with name '" + filePath + "'");
	}
	
	@Override
	public void playMP4(String filePath) {
		// no any implementaion
	}
}
