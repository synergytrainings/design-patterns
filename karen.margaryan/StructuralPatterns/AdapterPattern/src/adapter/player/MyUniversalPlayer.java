package adapter.player;

public class MyUniversalPlayer implements Player {

	@Override
	public void play(String filetype, String filePath) {
		filetype = filetype.toLowerCase();

		Player player = null;

		switch (filetype) {
		case "mp3":
		case "cda":
		case "wma":
			player = new MyAudioPlayer();
			break;

		case "mp4":
		case "mpeg":
			player = new VideoPlayerAdapter(filetype);
			break;

		default:
			throw new IllegalArgumentException("Not known media type");
		}
		
		player.play(filetype, filePath);
	}
}
