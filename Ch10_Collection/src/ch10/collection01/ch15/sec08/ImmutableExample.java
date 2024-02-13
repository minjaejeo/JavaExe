package ch10.collection01.ch15.sec08;

import java.util.List;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B" ,"C");
		//immutableList1.add("D"); (x)
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet = Set.of("A","B","C");
		//immutableSet.remove("A"); (x)
		
		
	}

}
