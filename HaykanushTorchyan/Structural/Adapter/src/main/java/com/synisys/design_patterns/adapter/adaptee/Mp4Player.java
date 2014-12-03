package com.synisys.design_patterns.adapter.adaptee;

/**
 * Created by haykanush.torchyan on 11/14/2014.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
