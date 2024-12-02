package review;
	//인터페이스
class Worker {
	public void start(){   // 멤버가 public 인것은 상관없음
	System.out.println("쉬고 있습니다.");
		}
	}
	//익명 구현과 클래스 객체 생성
class Anonymous {
	Worker field = new Worker() {
	@Override //컴파일러 효율이 올라간다.
	public void start(){
	System.out.println("디자인을 합니다.");
		}
	}
	;
	
	void method1() {
	Worker localVar = new Worker() {
	@Override //컴파일러 효율이 올라간다.
	public void start() {
	System.out.println("개발을 합니다.");
			}
	
		};
	localVar.start();
	}
	void method2(Worker worker) {
		worker.start();
	}
}	
// 익명 구현클래스와 객체생성	
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		annoy.field.start(); // 디자인을 합니다.
		annoy.method1(); // 개발을 합니다.
		
		annoy.method2(new Worker() {	
			@Override 
			public void start() {
			System.out.println("테스트를 합니다.");
					}
			}
		);
	}
}
				

