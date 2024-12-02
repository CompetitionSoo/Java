package review;


/* P.289
 * 메소드 : 클래스의 기능을 정의한 코드 블록
 * => 메소드 작명 표기법: 영문 소문자로 사용하되, 단어가 추가되면 대문자로 시작된다.
 */

//투자자
class Investor{
	// 메소드 오버로딩 : 매개변수 설정이 다른 같은 이름의 메소드 정의하기
	//반환타입 buyStock(매개변수) {코드블록:코드내용}
	void buyStock() {
		System.out.println("주식을 산다!");
	}
	void buyStock(String company) {                   //String company은 매개변수
		System.out.println(company + "주식을 산다!");
	}
	
	int sellStock() {
		System.out.println("주식을 판다!");
		
		// return 역활 : 값 내보내기 + 메소드 끝내기
		return 58100;
	}
}

public class Part064 {

	public static void main(String[] args) {
		Investor i = new Investor();   // 인스턴스화
		i.buyStock(); 				   // 메소드 호출
		i.buyStock("현대자동차 "); 	   // 반환데이터가 없는 메소드 호출 [기능이없으면 끝남]
		int result = i.sellStock();
		
	}

}
