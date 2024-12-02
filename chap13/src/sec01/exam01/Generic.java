package sec01.exam01;

//<> : 제네릭 기호 
// 제네릭 안에는 '타입 매개변수' 가 들어간다 (관례적으로 대문자 한글자 들어간다)
class Box <T>{
	T obj;
	Box(T obj){
		this.obj = obj;
	}
	
	//String getName() {
	//}
}
class Apple {}
class Banana {}


public class Generic {

	public static void main(String[] args) {
		Box<Apple> applebox = new Box<Apple>(new Apple());
		applebox.obj = new Apple();
		// applebox.obj = new Banana();
		
		Box<Banana> bananabox = new Box<>(new Banana());
		bananabox.obj = new Banana();
		
	}
}


/*
class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

public class Generic {

	public static void main(String[] args) {
		new Box(new Apple());
		new Box(new Banana());
		
		new Box(new String());
		new Box(new Integer(10));
	}

}
*/