package ch10.collection01.ch15.sec03.exam02;
/*
 * Member객체의 내용(이름, 나이)로 객체가 같은지 다른지 비교하기 위해서는
 * Object로 부터 상속받은 hashCode()와 equals()를 overriding 해야한다.
 * overriding 하지 않으면 각각 객체의 해시값과 객체의 주소를 가지고 비교하지만
 * 아래처럼 overriding 하면 객체내의 필드 내용으로 비교한다.
 * 
 * 그러므로 주소록이나 이런 데이터를 저장할 때는 아래처럼 하는 것이 필요하다.
 */

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		//return super.hashCode(); 	// 16진수 해시값
		return name.hashCode()+ age;	//이름이 같으면 해시코드도 같다.
	} // 이렇게 하면 같은값을 출력한다. 한개만 힙에 올려놓고 맴버의 지역변수가 가리킨다.
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
//		Member target = null;
//		if(obj instanceof Member) {
//			target = (Member)obj;
//		}
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age);
		}else {
			return false;
		}
	}// hashCOde로 먼저 비교하고 equals로 다시 비교
	// hashCode와 equals를 주석처리하면 "홍길동" 30은 2개로 저장된다.

}
