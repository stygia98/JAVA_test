package chapter17.practice01.model;

import java.util.Objects;

public class Music implements Comparable<Music> {
	private String title;
	private String singer;
	
	public Music() {
		this(null, null);
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public Music(Music m) {
		super();
		this.title = m.title;
		this.singer = m.singer;
	}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getSinger() {return singer;}
	public void setSinger(String singer) {this.singer = singer;}

	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsCheck = false;
		Music music = (Music) obj;
		
		if(obj instanceof Music) 
			if(this.title.equals(music.title) && this.singer.equals(music.singer))
				equalsCheck = true;
		
		return equalsCheck;
	}

	@Override
	public String toString() {
		return "[" + title + ", " + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
//		int compareCheck = this.singer.compareTo(o.singer);
//		if(compareCheck ==0)
//			compareCheck = this.title.compareTo(o.title);
		return o.singer.compareTo(this.singer);
	}	
	
}
