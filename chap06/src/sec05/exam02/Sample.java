package sec05.exam02;
// 이 Sample 의 객체는 두 개 이상 생성되면 안돼~! //싱글톤 

public class Sample { // 정적멤버사용
		// 정적 필드
		private static Sample s =  new Sample();
		
		//정적 필드의 주소값을 반환하는 정적 메소드
		static Sample getInstance() {
			return s;
		}
	}