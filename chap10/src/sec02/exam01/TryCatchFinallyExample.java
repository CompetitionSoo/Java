package sec02.exam01;

public class TryCatchFinallyExample {  //일반 예외처리

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException a) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
