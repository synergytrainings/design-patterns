package com.synisys.design_patterns.singelton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public enum MediaPlayer{
	INSTANCE;
	
	private List<String> playList = new ArrayList<String>();
	
	public void addToPlayList(String... filePaths){
		this.playList.addAll(Arrays.asList(Objects.requireNonNull(filePaths)));
	}
	
	public void play(String... filePaths){
		playList.clear();
		addToPlayList(filePaths);
		// Start playing the tracks in the filePathList
		System.out.println("Playing the tracks in the playlist");
	}
}