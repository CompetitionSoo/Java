package review;

/*
 * 생성자 : 클래스의 인스턴스 생성시 동작하는 기능을 정의하는 코드 블록
 * => 자바의 클래스는 반드시 생성자를 하나 이상 가진다.
 * 
 * 기본생성자 : 생성자를 안만들어도 컴파일러가 자동으로 기본적인 생성자를 추가해주는 것 사람눈에는 안보이고 자바 컴파일러에서만 보임  
 * 생성자 이름 규칙 : 클래스명과 동일해야한다! 앞에 타입 키워드가 안 붙음 return 타입이 정의 할 필요가 없다 / 객체를 생성할 목적
 * 
 * 
 */

class FishBun01{
	int price = 1000;     // 가격
	String place = "골목"; // 위치
	
	//생성자 오버로딩 : 생성자를 여러 형태로 만들기
	FishBun01(){         //생성자
		System.out.println("붕어빵 하나");
	}
	
	FishBun01(String sok){
		System.out.println(sok + "붕어빵 하나");
	}
	
	FishBun01(int price, String place){
		this.price = price; // FishBun01.price = price;  (나) this를 통해서 초기화하는 방법도 있다.
		this.place = place;
		System.out.println(price + "원 "  + place);
	}
}
	


public class Part063 { //

	public static void main(String[] args) {
		FishBun01 F1 = new FishBun01();
		FishBun01 F2 = new FishBun01("슈크림"); 
		FishBun01 F3 = new FishBun01(5000,"미래학원");
	}
}
