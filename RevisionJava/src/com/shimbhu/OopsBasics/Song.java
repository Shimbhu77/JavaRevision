package com.shimbhu.OopsBasics;

public class Song {

	String artist;
	String title;
	
	void play(){
	   System.out.println(artist+" is singing "+title);
	}
	
	public static void main(String[] args){
		Song track1=new Song();
		track1.artist="Lata";
		track1.title="wande matram";
		track1.play();
		
		Song track2=new Song();
		track2.artist="Sukhwindar";
		track2.title="Jai Ho";
		track2.play();
	}
		

}
