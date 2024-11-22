package sec03.exam01;

public class CarExample { //생성자를 호출해서 객체 생성

	public static void main(String[] args) {
		Car myCar1 = new Car("검정", 3000);
		  //참조변수(주소를 저장)
	
	System.out.printf("%s %d", myCar1.c,myCar1.c2);
	System.out.println();
	System.out.println(myCar1.c + myCar1.c2);
	}
}
