package sec01.exam01;

import java.util.*;

public class HashMapExample3 {

	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("홍길동", 100);
		map.put("길서", 95);
		map.put("길남", 90);
		map.put("길북", 85);
		map.put("홍길동", 100);
		
		System.out.println("총 Entry수 :" + map.size());
		

	}

}
