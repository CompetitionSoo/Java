package review;
/*
 * P.306
 * 
 * static 키워드 유무에 따른 차이
 * 없을 때 : (new 를 통하여)인스턴스 멤버. 객체 생성 후 접근 가능. 개별적으로 존재. 
 * 있을 떄 : 정적 멤버. 객체 생성 이전부터 접근 가능.  하나를 공유.
 * 상수화된 변수 VS 상수
 * 상수화된 변수 : final 이 붙은 개별 멤버
 * 상수 : static final 이 붙은 하나뿐인 값 / 불변의 값을 저장할대 사용


class Person {
	String name;
	String town;
	static String earth;
 */

class Person {
	static final String species = "포유류";
	final String name = "강영수";  //상수화된 변수, 인스턴스 멤버를 외부접근을 막을수 있다!
	String town;
	static String earth;
	
}

public class Part065 {

	public static void main(String[] args) {
		Person.earth = "하나뿐인 지구";
		//Person.name = "누군가의 이름";
		Person p = new Person();
		//p.name = "강동원"
	}

}
