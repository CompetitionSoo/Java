package review;
/*
 * 익명 객체 : 그때 한번만 사용할 클래스를 일시적으로 정의하는것
 */

interface Snack{
	
}
class Swingchip implements Snack{
	String name = "스윙칩";
}

public class Part0902 {
	
	public static void main(String[] args) {
		//Snack s = new Swingchip();
		Snack s = new Snack() {
			String name = "스윙칩";   // 익명객체
		};
		
	}
}