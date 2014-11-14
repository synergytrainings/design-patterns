package adapter.player.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import adapter.microsoft.player.MsMP4layer;
import adapter.microsoft.player.MsMPEGPlayer;
import adapter.player.VideoPlayerAdapter;

public class MediaPlayerTesting {

	@Test
	public void testAdapter() {
		VideoPlayerAdapter vpAdapter = new VideoPlayerAdapter("mpeg");
		assertEquals(vpAdapter.getMsVideoPlayer().getClass(), MsMPEGPlayer.class);
		
		vpAdapter = new VideoPlayerAdapter("mp4");
		assertEquals(vpAdapter.getMsVideoPlayer().getClass(), MsMP4layer.class);
	}
	
}
