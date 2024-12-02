package sec01.exam01;
import java.util.*;

//Member 객체를 중복없이 저장하는 HashSet

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("호랑이", 31));   // 인스턴스는 다르지만 내부데이터가 동일하므로 객체1개만 저장
		set.add(new Member("호랑이", 31));
		System.out.println("총 객체 수 : " + set.size());
	}

}
