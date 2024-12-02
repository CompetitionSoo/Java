package sec01.exam01;


class Person{
	int age;
	Person(int age){
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person comp = (Person) obj;       // 강제 형 변환
			if(this.age == comp.age) {
				return true;
			}
	}
	return false;
	
}

public class Example {

	public static void main(String[] args) {
		Person p1 = new Person(25);
		Person p2 = new Person(25);
		// 객체 간의 비교는 주소비교다,즉 같은 대상인지!
		System.out.println(p1 == p2); 
		}

	}
}
