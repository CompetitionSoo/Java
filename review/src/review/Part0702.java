package review;
/*
 * P.350 상속 
 * 상속은 기존 클래스를 확장시킨다.
 * 
 */
class Bread1{
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class CreamBread1 extends Bread1 {       //CreamBread 총 4개의 인스턴스멤버가있따.
	String taste;
	void setTaste(String taste) {
		this.taste = taste;
	}
}



public class Part0702 {

	public static void main(String[] args) {
	//new Bread() 힙 영역에 객체가 저장된다
	// Bread b 	: 스텍에 있는 b 라는 변수는 힙영역의 주소를 저장한다! 
	Bread1 b = new Bread1();
	CreamBread1 c = new CreamBread1();
	
	// 다형성 : 같은 객체라도 참조 타입에 따라 사용방법이 달라질 수 있다.
	
	// 부모 타입 변수는 자식 타입 객체 참조 가능 / 클래스의 자동타입 변환
	// 이 경우, 부모 타입의 멤버에만 접근 가능
	Bread1 p = new CreamBread1();
	p.setName("메론빵");

	// **자식 타입 객체 생성 후, 부모타입으로 참조했을때...
	// 다시 자식 타입으로 참조시키기 위해.. '강제 타입 변환' 가능하다
	CreamBread1 cb = (CreamBread1) p;
	cb.setTaste("바나나맛");
	}
}
