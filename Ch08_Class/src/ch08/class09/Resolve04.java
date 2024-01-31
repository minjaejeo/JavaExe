package ch08.class09;

import java.util.Scanner;

/*
 * 4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
 * <필드>
 * 	노래제목 title
 * 	가수	artist
 * 	앨범제목 album
 * 	작곡가 composer
 * 	노래가 발표된 연도 year
 * 	노래가 속한 앨범에서의 트랙 번호를 나타내는 track
 * 
 * <메서드>
 * 	노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
 * 	노래의 정보를 나타내는 show()
 * 
 * <main 실행>
 * 	ABBA의 "Dancing Queen" 노래를 Song객체로 생성하고 
 * 	Show()로 출력하세요
 */

public class Resolve04 {
	private String title;
	private String artist;
	private String	album;
	private String	composer;
	private int year;
	private int track;
	private Scanner sc;
	
	public Resolve04(Scanner sc, String artist, String title) {
		this.sc = sc;
		this.artist = artist;
		this.title = title;
	}

	public void Show() {
		System.out.println("가수를 입력하세요 >> ");
		artist = sc.nextLine();
		System.out.println("제목을 입력하세요 >> ");
		title = sc.nextLine();

		System.out.println(artist + "의 " + title + "노래");

		album = "Arrival";
		composer = "Benny Andersson";
		year = 1976;
		track = 2;

		System.out.println("앨범제목 : " + album + ", 작곡가 : " + composer);
		System.out.println("발매연도 : " + year + ", 트랙번호 : " + track);

	}

}
