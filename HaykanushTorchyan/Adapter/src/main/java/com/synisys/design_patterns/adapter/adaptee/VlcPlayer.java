package com.synisys.design_patterns.adapter.adaptee;

/**
 * Created by haykanush.torchyan on 11/14/2014.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
