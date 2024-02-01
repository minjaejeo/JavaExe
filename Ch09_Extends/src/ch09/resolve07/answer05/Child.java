package ch09.resolve07.answer05;

/*
 * 클래스 설계에서 접근권한 설정
 * 1) 필드 -> private
 * 	  메서드 -> public
 * 2) 메서드 중에 내부에서만 사용하는 메서드 -> private
 */

public class Child {
	private int ballCnt;
	
	public Child(int ballCnt) {
		this.ballCnt = ballCnt;
	}
	public void give(Child other, int cnt) {
		sub(cnt);
		other.add(cnt);
	}
	public void get(Child other, int cnt) {
		other.sub(cnt);
		add(cnt);		
	}
	private void add(int cnt) {
		this.ballCnt += cnt;
	}
	private void sub(int cnt) {
		this.ballCnt -= cnt;
	}
	public int getBallCnt() {
		return ballCnt;
	}
	

}
