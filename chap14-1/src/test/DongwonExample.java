package test;

public class DongwonExample {

	public static void main(String[] args) throws Exception{
		DongwonStorage	d = new DongwonStorage();
		try{
			d.showMenu();
		}catch (Exception e) {
			System.out.println("예외 발생!" + e);
			e.printStackTrace();
		}
	}
}
