package test;

public class test2 { 
	//while 문과 Math.random()메소를 활용하여 2개의 주사위를 던졌을 때 나오는 눈을 
	//(눈1, 눈2) 형태로 출력하고 눈의 합이 5가아니면 계속 주사위를 던지고 합이 5인면 실행을 멈추는 코드 
	public static void main(String[] args) {
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;	//주사위1
			int dice2 = (int)(Math.random()*6)+1;   //주사위2		
			System.out.println(dice1 + " " + dice2 );
			if ((dice1 + dice2)== 5) 
				break;
		}
	}
}