package review;

public class Part053 {
	/*
	 * p.232
	 * 열거타입은 제한된 값을 상수화 할 수 있는 타입이다.
	 * => 요일, 월, 리모콘의 버튼 등의 개념을 코들 옮기는...
	 * 
	 * 열거타입 enum
	 * 
	 * 버튼중 레드, 초록, 파랑이 있을경우 RGB 
	 */  
enum Button{
	RED_BUTTON,
	GREEN_BUTTON,
	BLUE_BUTTON,
}


enum LoginResult{
	SUCCESS,
	FAIL_ID,
	FAIL_PASSWORD
}

	public static void main(String[] args) {
		// 열거타입 변수 기반의 변수 생성가능
		Button bt = Button.RED_BUTTON;
		// if(사용자입력 == bt){ 동작 }
	}

}
