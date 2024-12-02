package sec01.exam01;
/*
 * 무엇이든 좋으니 자신만의 클래스를 만들어
 * 해시셋에 저장하는 코드를 만들어보는 연습을하자  HashSet
 * 
 * String 객체를 중복없이 저장하는 HashSet
 * HashSet은 객체들의 순서없이 저장하고 동일한 객체는 중복 저장하지 않습니다.
*/

import java.util.*;


public class Phone {
	public static void main(String[] args) {   
		Set<String> set = new HashSet<String>();
	
		set.add("갤럭시1");
		set.add("갤럭시2");
		set.add("갤럭시2");
		set.add("아이폰1");
		set.add("아이폰2");
		
//		int size = set.size();
		System.out.println("총 객체수: " + set.size());
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("갤럭시2");
		set.remove("아이폰2");
		
		System.out.println("총 객체수: " + set.size());
		
		
		iterator = set.iterator();   // 반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);  
		}
		
		set.clear();  // 모든 객체를 제거하고 비움
		if(set.isEmpty()) {System.out.println("비어 있음");
		}
	}
}