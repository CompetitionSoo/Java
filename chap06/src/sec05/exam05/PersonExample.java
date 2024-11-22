package sec05.exam05;

public class PersonExample { //final 필드 테스트

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567" , "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		
		p1.name = "홍길순";

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}
