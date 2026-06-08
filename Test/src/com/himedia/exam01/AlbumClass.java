package com.himedia.exam01;

public class AlbumClass {
	String title;
	String artist;
	String album;
	String release;
//	int count;
	
	public AlbumClass() {
	}
	
	public AlbumClass(String title, String artist, String album, String release) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.release = release;
	}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getArtist() {return artist;}
	public void setArtist(String artist) {this.artist = artist;}
	public String getAlbum() {return album;}
	public void setAlbum(String album) {this.album = album;}
	public String getRelease() {return release;}
	public void setRelease(String release) {this.release = release;}
	
	public void printInform() {
		System.out.printf("곡명:%-5s / 가수:%-5s / 앨범:%-5s / 발매일:%-5s\n", getTitle(), getArtist(), getAlbum(), getRelease());
	}
	
	@Override
	public String toString() {
		return "AlbumClass [title=" + title + ", artist=" + artist + ", album=" + album + ", release=" + release + "]";
	}
	
	
	
	
	
	
	
}
