package sec02.exam05;

public class charOperationExample { //char 타입의 산술연산

	public static void main(String[] args) {
		char c1 = 'A' + 1;  // char c1 = 66으로 컴파일됨
		char c2 = 'A';
		//char c3 = c2 + 1 ;  char변수가 산술연산에 사용되면 int 타입으로 변환되므로 연산결과는 int타입이됨
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: " +  c3);
	}

}
