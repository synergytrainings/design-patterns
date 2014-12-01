package adapter.player;

public class MyAudioPlayer implements Player {
	@Override
	public void play(String fileType, String filePath) {
		System.out.println("Playing '" + fileType + "' file with name '" + filePath + "'");
	}
}
