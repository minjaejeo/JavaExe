package ch16.lambda02.ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//Member 클래스의 param 1개 짜리 생성자 메서드 전달.
		Member m1 = person.getMember1(Member :: new); //생성자 참조
		System.out.println(m1);
		System.out.println();
		
		//Member 클래스의 param 2개 짜리 생성자 메서드 전달
		Member m2 = person.getMember2(Member :: new); // 생성자 참조
		System.out.println(m2);
	}

}
