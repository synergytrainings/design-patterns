package adapter.player;

import adapter.microsoft.player.MsMP4layer;
import adapter.microsoft.player.MsMPEGPlayer;
import adapter.microsoft.player.MsVideoPlayer;

public class VideoPlayerAdapter implements Player {

	private MsVideoPlayer msVideoPlayer = null;

	public VideoPlayerAdapter(String type) {
		type = type.toLowerCase();
		
		switch (type) {
		case "mpeg":
			msVideoPlayer = new MsMPEGPlayer();
			break;
		case "mp4":
			msVideoPlayer = new MsMP4layer();
			break;
		default:
			throw new IllegalArgumentException("Not found video player type");
		}
	}

	@Override
	public void play(String filetype, String filePath) {
		filetype = filetype.toLowerCase();
		
		switch (filetype) {
		case "mpeg":
			msVideoPlayer.playMPEG(filePath);
			break;
		case "mp4":
			msVideoPlayer.playMP4(filePath);
			break;
		default:
			throw new IllegalArgumentException("Not found video player type");
		}
		
	}
	
	public MsVideoPlayer getMsVideoPlayer() {
		return msVideoPlayer;
	}
}
