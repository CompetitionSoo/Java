package test;

public class test1 {  //for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
	public static void main(String[] args) {
		int total = 0;	
		//int i = 0;
		// 1부터 100까지의 정수 중에서 3의배수 총합
		for(int i=1; i<=100; i++) {
			if (i%3 == 0){
				total += i;
				//System.out.println(i);
			}
		}
		System.out.println(total);
	}
}