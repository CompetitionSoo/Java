package chap10;

public class More {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[100] = 3;
			
			int result = Integer.parseInt("오");
		}catch(ArrayIndexOutOfBoundsException e) {
		
		}catch(NumberFormatException e) {
		
		}catch(Exception e) {
		}

	}

}
