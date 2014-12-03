package com.synisys.design_patterns.adapter;
import com.synisys.design_patterns.adapter.target.AudioPlayer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by haykanush.torchyan on 11/14/2014.
 */
public class Demo {
    @Test
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        //audioPlayer plays .mp3 file on its own
        audioPlayer.play("mp3", "beyond the horizon.mp3");

        //audioPlayer uses mediaAdapter to play .vlc and .mp4 files
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");

        //audioPlayer doesn't support .avi files
        audioPlayer.play("avi", "mind me.avi");
    }
}
