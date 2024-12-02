package review;
/*
 * 중첩 클래스 : 클래스 안에 멤버로써 존재하는 클래스
 * 로컬 클래스 : 메소드 안에 지역 변수처럼 존재하는 클래스
 * 
 * 효력 범위 : 어디에서까지 사용할 수 있는지를 의미하는 것인데,
 * 위 두 가지는 서로 효력 범위가 다르다.
 * 
 */

class Car{           // 외부클래스
	Engine e = new Engine();
	
	class Engine{ }   // 중첩클래스 Car에 속해있다 / 일반 멤버클래스
	static class Handle{ }					//	정적 클래스
	
	void run( ) {										
		class Speed {int speed;}		    // 메소드 안에있으니 지역클래스
		Speed s = new Speed();
		System.out.println(s.speed);
	}

	
}

public class Part0901 {

	public static void main(String[] args) {
		
		// 멤버 클래스에 접근하려면 객체 선언이 먼저!  
		Car c = new Car();
		Car.Engine e = c.new Engine();
		
		// 정적 멤버 클래스에 접근하려면 객체 선언 없어도 괜찮다!
		Car.Handle h = new Car.Handle();
		
		// 로컬클래스는 메소드 유출 시에만 효력이있다.
		c.run();
	}

}