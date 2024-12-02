package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		//B : 인스턴스 멤버클래스
		//C : 정적멤버클래스
		//D : 로컬클래스 
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성 (A가 있어야 사용이가능) 
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;    //일반멤버
		c.method1();
		
		A.C.field2 = 3;  //정적멤버
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();

	}

}
