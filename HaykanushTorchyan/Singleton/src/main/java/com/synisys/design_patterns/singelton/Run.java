package com.synisys.design_patterns.singelton;

public class Run {
	
	public static void main(String[] args){
		MediaPlayer player = MediaPlayer.INSTANCE;
		String track1 = "C:\\Users\\Haykanush.Torchyan\\MyMusic\\track1";
		String track2 = "C:\\Users\\Haykanush.Torchyan\\MyMusic\\track2";
		String track3 = "C:\\Users\\Haykanush.Torchyan\\MyMusic\\track3";

		// Play a single file
		player.play(track1);
		
		//Select all files and press Enter key - the same single instance 
		//of MediaPlayer will be used to play back all the tracks
		player.play(track1, track2, track3);
	}
}