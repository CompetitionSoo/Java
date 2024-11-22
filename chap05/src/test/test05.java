package test;

public class test05 { //중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구해보세요

	public static void main(String[] args) {
		
		//2차원 배열의 합 , 평균!
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg =0.0; //실수
		int cnt = 0;	
		for(int row = 0; row <array.length; row++) {
			for(int col = 0 ; col < array[row].length; col++) {
				sum += array[row][col];
				cnt++;
			}
		}
		avg = (double) sum/cnt;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
