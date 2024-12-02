package sec01.exam01;

import java.util.*;  // java.util.* 컬렉션 프레임워크 (List, Set, Map)

class Coffee{
	String brand;
	Coffee(String brand){this.brand = brand;}
	
	
	@Override
    public String toString() {
        return "커피 브랜드: " + brand;  // Coffee 객체를 출력할 때 브랜드명만 표시하도록 설정
    }
	
}


public class ArrayListSample {

	public static void main(String[] args) {
		List<Coffee> coffeeList = new ArrayList<>();
		
		coffeeList.add(new Coffee("스타벅스"));
		coffeeList.add(new Coffee("이디아"));
		coffeeList.add(new Coffee("파스쿠찌"));
		coffeeList.add(new Coffee("컴포즈"));
		
		coffeeList.add(2, new Coffee("매머드"));
		
		for (int i =0; i<coffeeList.size(); i++) {
			System.out.println(coffeeList.get(i));
		}
		
		coffeeList.remove(1);
		
		// 향상된 for문
		for(Coffee brand : coffeeList) {
			System.out.println(brand);
		}
				
	}	
	
}
