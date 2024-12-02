package sec01.exam02;

class Member { //객체 동등 비교(equals()메소드)
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if(obj instanceof Member) {
			if(id.equals(member.id)) {
				return true;
			}
		}	return false;
	}
}


public class MemberExample { //객체 동등 비교(equals()메소드)
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
	if(obj1.equals(obj2)) {
		System.out.println("obj1 과 obj2 는 동등합니다.");
		} 

	else {
		System.out.println("obj1 과 obj2 는 동등하지 않습니다.");
		}
	
	if(obj1.equals(obj3)) {
		System.out.println("obj1 과 obj3 는 동등합니다.");
		} 
	
	else {
		System.out.println("obj1 과 obj3 는 동등하지 않습니다.");
		}
	
	}
}
		
		

