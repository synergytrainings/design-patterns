package adapter.microsoft.player;

public class MsMP4layer implements MsVideoPlayer {
	
	@Override
	public void playMPEG(String filePath) {
		// no any implementation
	}
	
	@Override
	public void playMP4(String filePath) {
		System.out.println("Microsoft: Playing 'mp4' file with name '" + filePath + "'");
	}
}
