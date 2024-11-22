package sec05.exam01;

public class CarExample {  //인스턴스 멤버와 this

	public static void main(String[] args) {
		Car myCar = new Car("람보르기니");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
