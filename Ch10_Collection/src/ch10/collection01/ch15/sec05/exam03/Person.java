package ch10.collection01.ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Person o) {
//		if(age<o.age) return -1;
//		else if(age == o.age) return 0;
//		else return 1;
//	}	// 나이순으로 정렬한다. >를 사용하면 역정렬
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name)*-1;
	}	// 이름순으로 정렬 (*-1하면 역정렬)

}
