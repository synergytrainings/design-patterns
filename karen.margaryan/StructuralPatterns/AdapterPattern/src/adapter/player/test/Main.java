package adapter.player.test;

import adapter.player.MyUniversalPlayer;

public class Main {
	public static void main(String[] args) {
		MyUniversalPlayer universalPlayer = new MyUniversalPlayer();
		universalPlayer.play("mp4", "PrideAndPrejudice.mp4");
		universalPlayer.play("mp3", "AndreaBochelli.mp3");
	}
}
