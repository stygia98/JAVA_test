package chapter17.practice01.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter17.practice01.model.Music;

public class MusicController {
	private List<Music> mList;
	private List<Music> cmList;

	public MusicController() {
		super();
		this.mList = new ArrayList<Music>();
		this.cmList = new ArrayList<Music>();
	}

	public int addList(Music music) {
		try {mList.add(music); return 1;} 
		catch (Exception e) {return 0;}
	}
	
	public int addAtZero(Music music) {
		try {mList.add(0, music); return 1;} 
		catch (Exception e) {return 0;}
	}
	
	public List<Music> printAll() {
		return mList;
	}
	
	public List<Music> sortPrintAll() {
		return cmList;
	}
	
	public Music serachMusic(String title) {
		for (Music music : mList) {
			if(music.getTitle().equals(title))	return music;
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for (Music music : mList) {
			if(music.getTitle().equals(title)) {
				mList.remove(music);
				return music;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for (int i = 0; i < mList.size(); i++ ){
			Music m = mList.get(i);
			if(m.getTitle().equals(title)) {
				mList.set(i, music);
				return m;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		cmList.clear();
		for (Music music : mList) {
			if(music != null) cmList.add(new Music(music));
		}
		
		try {Collections.sort(cmList, new AscTitle()); return 1;}
		catch (Exception e) {return 0;}
	}
	
	public int descSinger() {
		cmList.clear();
		for (Music music : mList) {
			if(music != null) cmList.add(new Music(music));
		}

		try {Collections.sort(cmList); return 1;}
		catch (Exception e) {return 0;}
	}
	
}
