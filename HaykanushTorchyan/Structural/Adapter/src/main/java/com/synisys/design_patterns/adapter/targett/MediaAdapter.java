package com.synisys.design_patterns.adapter.target;

import com.synisys.design_patterns.adapter.adaptee.AdvancedMediaPlayer;
import com.synisys.design_patterns.adapter.adaptee.Mp4Player;
import com.synisys.design_patterns.adapter.adaptee.VlcPlayer;

/**
 * Created by haykanush.torchyan on 11/14/2014.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
