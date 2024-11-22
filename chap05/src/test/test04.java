package test;

public class test04 { //for문을 이용해서 주어진 배열의 항목에서 최대값을 구하시오.

	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int a : array) {
			if(max < a) max = a;
		}
		System.out.println("max: " + max);

	}
}
