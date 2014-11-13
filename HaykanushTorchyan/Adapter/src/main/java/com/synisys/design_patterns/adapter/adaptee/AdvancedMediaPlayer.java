package com.synisys.design_patterns.adapter.adaptee;

/**
 * Created by haykanush.torchyan on 11/14/2014.
 *
 * Adaptee interface
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
