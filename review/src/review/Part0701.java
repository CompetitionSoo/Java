package review;
/*
 * P.350 상속 
 * 상속은 기존 클래스를 확장시킨다.
 */
class Bread{
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class CreamBread extends Bread {       //CreamBread 총 4개의 인스턴스멤버가있따.
	String taste;
	void setTaste(String taste) {
		this.taste = taste;
	}
}



public class Part0701 {

	public static void main(String[] args) {
	//new Bread() 힙 영역에 객체가 저장된다
	// Bread b 	: 스텍에 있는 b 라는 변수는 힙영역의 주소를 저장한다! 
	Bread b = new Bread();
	CreamBread c = new CreamBread();

	}

}
