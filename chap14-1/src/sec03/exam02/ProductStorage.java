package sec03.exam02;
// Scanner 입력된 문자열 얻기
import java.util.*;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();  // list컬렉션 생성
	private Scanner scanner = new Scanner(System.in);
	private int counter; //pno 제공카운터
	
	public void showMenu() {
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료" );
			System.out.println("-------------------------------------------");
			
			System.out.print("선택 :");
			String selectNo = scanner.nextLine();  // 번호읽기
			switch(selectNo) {
			case "1" : registerProduct(); break;
			case "2" : showProducts(); break;
			case "3" : return; 
			}
		}
	}
	
	
	
	
}
