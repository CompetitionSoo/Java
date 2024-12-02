package review;

/*
 * P.244
 * 클래스 : 객체를 만들기 위한 설계도 
 * 객체 : 값(변수)과 기능(메소드)을 가지고 있는 데이터
 * 
 * P.252
 * 필드 : 객체 내부에 있는 변수(멤버 라고 함)
 * => 클래스 안에서는 필드 사용이 기본적으로 가능하다.
 * => 클래스 밖에서는 new 연산이 선행되어야 사용이 가능
 */

// 내 프로그램 내에서는 붕어빵이라는 데이터를 사용할 예정이야!
// 설계도 
/*
class FishBun{
	int price = 1000;// 가격
	String place = "골목"; // 위치
}
*/
class FishBun{
	int price = 1000;// 가격
	String place = "골목"; // 위치
	
	void init() {
		price = 500;
		place = "갤러리아 앞";
	}
}

public class Part061 {
	

	public static void main(String[] args) {
		FishBun a = new FishBun();   //붕어빵이 저장된 장소 a
		a.price = 1000;
	}
}
