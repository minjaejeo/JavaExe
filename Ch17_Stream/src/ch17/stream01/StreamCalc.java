package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("톨스토이");
		nameList.add("김수한무거북이와두루미삼천갑자동방삭");
		nameList.add("Cristoper");
		nameList.add("프랑스대왕루이");
		nameList.add("영국알프레드대왕");
		nameList.add("영문예무인성명효대왕");
		nameList.add("일본왕");
		nameList.add("몰라몰라몰라몰라");
		
		// Stream 을 안쓰는 경우
		for(String name : nameList) {
			if(name.length()>=5) {
				System.out.print(name + ", ");
			}
		}
		System.out.println();
		
		// Stream 을 풀어쓴 경우
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s->s.length() >= 5);
		strmF.forEach(s->System.out.print(s + ", "));
		System.out.println();
		
		//한번 사용한 스트임은 재사용 불가능(내부 데이터 모두 흘려보냈다.)
//		System.out.println("-------------------");
//		strmF.forEach(s->System.out.print(s + ", "));
//		System.out.println();
		
		//Stream을 쓰는 경우
		nameList.stream().filter(s->s.length()>=5).filter(s->s.length()<10).forEach(s->System.out.print(s + ", "));
	}

}
