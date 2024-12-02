package review;
/* p.406
 * 자바에는 객체 생성이 아닌 클래스 확장을 위해 존재하는 코드 블록이 있다.
 * 1. 추상클래스: abstract 키워드가 붙은 클래스
 * 2. 인터페이스: interface 코드 블록
 * -> 공통적인 속성과 기능을 정의할 목적으로 사용한다~!
 * 
 */
//추상메소드가 하나 이상 존재하면 반드시 추상 클래스로 선언해야!
interface A{
	
}

abstract class Soup {
	//추상 메소드 : 이거 상속받아서 네 나름대로 재정의해!
	abstract void boil();		
}
	


class ChickenSoup extends Soup {
	void boil() {}
}
class BeefSoup extends Soup{
	void boil() {}
}

	

// 인터페이스의 멤버 : 상수 + 추상 메소드
// public static final
// public abstract(메소드)
interface Food{
	String name = "울엄마 해장국";
}


// 메소의 타입이 인터페이스일 경우의 사용법...
interface Phone{}

// 인터페이스의 자식 만들기
class SmartPhone implements Phone{}

class User{
	User(Phone P){}
}
public class Part0801 {

	public static void main(String[] args) {
	
	}

}
