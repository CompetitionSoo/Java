package review;
/* P.221
 * 
 * 참조타입 배열은 여러개 값을 일렬로 보관하는 자료구조의 일종
 * 
 * 자료 배열의 특징 
 * 1. 배열 안의 값들은 모두 같은 자료형이여야 한다.
 * 2. 배열의 각 값들에는 인덱스 번호가 매겨진다. 0부터 시작된다.
 * 
 * 
 */
public class Part052 {

	public static void main(String[] args) {
		
		// int[] 배열입니다.
		// 초기화 방법 1
		int[] arr1 = {1, 2, 3, 4, 5}; //배열입니다.  선언과 동시에 초기화하는 방법 따로하면 에러가 일어남
		
		// 초기화 방법 2
		int[] arr2; 
		arr2 = new int[]{1, 2, 3, 4, 5}; //배열입니다.  따로하면 에러가 일어남 
		
		
		// 값은 나중에 넣을거라서... 개수만 정해놓기 방법
		int[] arr3 = new int[5];
		//arr3[0] 	  값에 접근하기
		arr3[0] = 9;  //값에 덮어쓰기 
		arr3[1] = 9;  
		arr3[2] = 9;  
		arr3[3] = 9;  
		arr3[4] = 9;  
		// arr3.length: 배열의 칸 수(읽기전용) 
		
		// 다차원 배열 (2)
		// 행열 순서로 보면돼, 행은 줄, 열은 칸
		// int[]  //1차원
		// int[][]  //2차원
		int[][] arr4 = {{1, 2 , 3},{4, 5, 6}};// 2행 3열
		for(int row =0; row<2; row++) {
			for(int col = 0; col<3; col++) {
				System.out.println(arr4[row][col]);
			}
		}	
	}
}
