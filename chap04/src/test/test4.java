package test;

public class test4 {	
	public static void main(String[] args) {
	// 별찍기 2번 (공백이 줄면서 별은 늘어나
		for(int layer = 1; layer <= 8; layer++) {
			
			for(int scnt = 8 - layer; scnt > 0; scnt--) {
				System.out.print(" ");
			}
			for(int tcnt = 1; tcnt < layer; tcnt++) {
				System.out.print("*");
			}
		System.out.println();
	}
	}
}
	
	