package sec02.exam02;

public class IncreaseDecreaseOperatorExample { // 증감연산자

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-------------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
	
		System.out.println("-------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
				
	}
}
