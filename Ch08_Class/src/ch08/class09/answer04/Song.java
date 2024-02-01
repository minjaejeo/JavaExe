package ch08.class09.answer04;
/*
 * 4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
    Show()로 출력하세요
 */

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setSongInfo(String title, String artist, String album, String compoer, int year, int track) {
		
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	public void show() {
		String strInfo = "노래제목 : " + title + "\n" + 
				"가수 : " + artist + "\n" +
				"앨범 : " + album + "\n" +
				"작곡가 : " + composer + "\n" +
				"연도 : " + year + "\n" +
				"트랙 : " + track + "\n" ;
		System.out.printf(strInfo);
			
	}

}
