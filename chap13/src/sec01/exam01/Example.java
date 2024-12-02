package sec01.exam01;

import java.util.*;

class Potato{
	
	int month;
	int date;
	String New; 
	
	Potato(int m, int d){
		month = m;
		date = d;
	
	if (month <9) {
		New = "묵은감자";
	}else {
		New = "햇감자";
	}
	
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Potato) {
			Potato cmp = (Potato)obj;
			return this.month == cmp.month && this.date== cmp.date;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.month;
	}
	@Override
	public String toString() {
		return "이 감자는" +month+"에 수확한"+New;
		
	}
}


public class Example {

	public static void main(String[] args) {
		// new 를 사용하였기 때문에 반복이 아니다.
		Potato a = new Potato(10, 15);
		Potato b = new Potato(10, 15);
		Potato c = new Potato(10, 15);
		Potato d = new Potato(11, 3);
		Potato e = new Potato(11, 3);
		
		Set<Potato> bucket = new HashSet<>();
		bucket.add(a);
		bucket.add(b);
		bucket.add(c);
		bucket.add(d);
		bucket.add(e);
		
		Iterator<Potato> it = bucket.iterator();
		
		for(Potato p : bucket) {
			System.out.println("감자 있어요!"+p);
		}
				
	}

}
