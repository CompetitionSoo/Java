package sec01.exam03;

import java.util.HashMap;
// hashCode()메소드를 재정의하지 않음
class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key compareKey) {
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	} 
	// hashCode() 메소드 재정의 추가
	@Override
	public int hashCode() {
		return number;
	}
}

public class KeyExample {  //다른키로 인식

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		// 식별키를 new Key(1)로 '홍길동' 을 저장함
		hashmap.put(new Key(1), "홍길동");
		
		// 식별키를 new Key(1)로 '홍길동' 을 읽어옴
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
