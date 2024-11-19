package sec02.exam03;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}

// !
//피연산자가 true 이면  fasle 값을 산출
//피연산자가 fasle 이면 true 값을 산출
