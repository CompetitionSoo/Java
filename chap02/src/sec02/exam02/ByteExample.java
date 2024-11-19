package sec02.exam02;
		
public class ByteExample {  //byte 타입 변수 

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; 정수타입 byte는 저장되는 값의 허용범위가 -128~ 127이여서 
		// 범위를 넘어가면 컴파일에러가 일어난다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		// System.out.println(var6);
	}
}
