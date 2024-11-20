package test;

public class test7 {	
	//중첩 for문을 이용하여 방정식 4x+5y=60 의 모든해를 구해서(x,y)형태로 출력하기 
	// 단 x와 y는 10이하의 자연수이다.
	public static void main(String[] args) {
	for(int x = 1; x <= 10; x++) {
		for(int y = 1; y <= 10; y++) {
			if((4*x + 5*y )==60) {
				System.out.println(x + "" + y);
				}
			}
		}
	}
}
