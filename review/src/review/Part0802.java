package review;
/*
 *  P.424
 */
interface Animal{
	void sound(); 
	void eat();
}

class Tiger implements Animal{
	public void sound() {System.out.println("어흥");}
	public void eat() {System.out.println("고기 먹자");}
}
class Rabbit implements Animal{
	public void sound() {System.out.println("끼끼");}
	public void eat() {System.out.println("풀 먹자");}
}

public class Part0802 {

	public static void main(String[] args) {
		//자동 타입 변환 : 자식객체가 부모 타입에 대입이 된다!
		Animal a1 = new Tiger();
		Animal a2 = new Rabbit();
		a1.sound(); a2.sound();
		a1.eat();   a2.eat();

		System.out.println(a1 instanceof Tiger);
		System.out.println(a2 instanceof Rabbit);
		
		// 강제 타입 변환 : 부모 타입을 자식타입에 도로 대입한다.
		Tiger t = (Tiger) a1;
		Rabbit r = (Rabbit) a2;
	}

}
